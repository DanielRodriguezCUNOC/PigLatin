package com.paboomi.backend.semantic.analysis;

import com.paboomi.backend.model.nodes.literal.*;
import com.paboomi.backend.model.nodes.principal.ASTNode;
import com.paboomi.backend.model.nodes.declaration.NodeArrayDeclaration;
import com.paboomi.backend.model.nodes.declaration.NodeStructDefinition;
import com.paboomi.backend.model.nodes.declaration.NodeVariableDeclaration;
import com.paboomi.backend.model.nodes.expression.*;
import com.paboomi.backend.model.nodes.function.NodeFunction;
import com.paboomi.backend.model.nodes.function.NodeParameter;
import com.paboomi.backend.model.nodes.instruction.*;
import com.paboomi.backend.model.nodes.lvalue.NodeFieldAccess;
import com.paboomi.backend.model.nodes.lvalue.NodeIndexAccess;
import com.paboomi.backend.model.nodes.lvalue.NodeLvalue;
import com.paboomi.backend.model.nodes.principal.NodeProgram;
import com.paboomi.backend.model.visitor.Visitor;
import com.paboomi.backend.semantic.errors.SemanticErrorReporter;
import com.paboomi.backend.semantic.symboltable.SymbolTable;
import com.paboomi.backend.semantic.symboltable.symbols.*;
import com.paboomi.backend.semantic.types.StructType;
import com.paboomi.backend.semantic.types.TypeTable;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Semantic analysis pass 2.
 *
 * Traversal: Bottom-up (post-order, my weakness T-T ).
 * Functions:
 *  - Infer and return the type of each expression.
 *  - Validate operand compatibility with operators.
 *  - Verify that function call arguments match the signature.
 *  - Validate that REDDERE expressions match the current function's return type.
 *  - Validate that control-flow conditions are boolean.
 *
 * This class reconstructs its own Symbol Table while traversing the AST,
 * allowing identifier types to be resolved at any nesting level.
 */
@Getter
@Setter
public class TypeChecker implements Visitor<String> {

    private final SymbolTable symbolTable;
    private final TypeTable typeTable;
    private final SemanticErrorReporter errorReporter;
    private final Deque<String> functionReturnStack;

    public TypeChecker(TypeTable typeTable, SemanticErrorReporter errorReporter) {
        this.symbolTable = new SymbolTable();
        this.typeTable = typeTable;
        this.errorReporter = errorReporter;
        this.functionReturnStack = new ArrayDeque<>();
    }

    // ============================================================
    // PROGRAM
    // ============================================================

    @Override
    public String visitProgram(NodeProgram n) {
        for (ASTNode decl : n.getGlobalDeclarations()) {
            decl.accept(this);
        }
        for (ASTNode func : n.getFunctionDefinitions()) {
            func.accept(this);
        }
        for (ASTNode inst : n.getMainInstructions()) {
            inst.accept(this);
        }
        return null;
    }

    // ============================================================
    // STATEMENTS
    // ============================================================

    @Override
    public String visitVariableDeclaration(NodeVariableDeclaration n) {

        //* Normalize Type Created
        String declaredType = n.getType() != null ? normalizeType(n.getType()) : null;
        //* Save normalized node
        n.setType(declaredType);

        //* Get and normalize type in initialization
        String exprType = null;
        if (n.getInitializer() != null) {
            exprType = n.getInitializer().accept(this);
            if (exprType != null) {
                exprType = normalizeType(exprType);
            }
        }

        //* Type inference if no type is declared
        if (declaredType == null && exprType != null) {
            n.setType(exprType);
            declaredType = exprType;
        }
        // Compatibility validation if both exist
        else if (declaredType != null && exprType != null) {
            if (!areTypesCompatible(declaredType, exprType)) {
                errorReporter.reportError(
                        "Incompatible type in declaration: expected '" + declaredType +
                                "' but it has been found '" + exprType + "'",
                        n.getLine(), n.getColumn()
                );
            }
        }

        //* Register in the symbol table with the type already normalized
        VariableSymbol symbol = new VariableSymbol(
                n.getIdentifier(),
                n.getType(),
                n.getLine(),
                n.getColumn()
        );
        if (!symbolTable.declare(n.getIdentifier(), symbol)) {
            errorReporter.reportError(
                    "Variable redeclaration '" + n.getIdentifier() + "' in the same scope",
                    n.getLine(), n.getColumn()
            );
        }

        return null;
    }

    @Override
    public String visitArrayDeclaration(NodeArrayDeclaration n) {

        //* Normalize element type
        String elementType = n.getElementType() != null ? normalizeType(n.getElementType()) : null;
        n.setElementType(elementType);

        //* Validate initializers
        for (ASTNode value : n.getInitialValues()) {
            String valType = value.accept(this);
            if (valType != null) {
                valType = normalizeType(valType);
                if (elementType != null && !areTypesCompatible(elementType, valType)) {
                    errorReporter.reportError(
                            "Incompatible type in array initializer: expected '" +
                                    elementType + "' but it has been found '" + valType + "'",
                            value.getLine(), value.getColumn()
                    );
                }
            }
        }

        //* Register as ArraySymbol (SERIES_elementType type)
        String arrayType = elementType != null ? "SERIES_" + elementType : null;
        ArraySymbol symbol = new ArraySymbol(
                n.getIdentifier(),
                arrayType,
                n.getSize(),
                elementType,
                n.getLine(),
                n.getColumn()
        );
        if (!symbolTable.declare(n.getIdentifier(), symbol)) {
            errorReporter.reportError(
                    "Redeclaration of array '" + n.getIdentifier() + "' in the same scope",
                    n.getLine(), n.getColumn()
            );
        }

        return null;
    }

    @Override
    public String visitStructDefinition(NodeStructDefinition n) {
        // The structs are already in the TypeTable from Pass 1 :)
        return null;
    }

    // ============================================================
    // FUNCTIONS
    // ============================================================

    @Override
    public String visitFunction(NodeFunction n) {

        // Register signature
        FunctionSymbol funcSymbol = new FunctionSymbol(
                n.getFunctionName(), n.getReturnType(),
                n.getLine(), n.getColumn(), n.getReturnType());
        for (NodeParameter param : n.getParameters()) {
            funcSymbol.addParameter(new ParameterSymbol(
                    param.getParameterName(), param.getDataType(), param.getLine(), param.getColumn()
            ));
        }
        symbolTable.declare(n.getFunctionName(), funcSymbol);

        // Function context for validating returns
        functionReturnStack.push(n.getReturnType() != null ? n.getReturnType() : "VOID");

        symbolTable.pushScope("function " + n.getFunctionName());

        // Record parameters
        for (NodeParameter param : n.getParameters()) {
            symbolTable.declare(param.getParameterName(),
                    new ParameterSymbol(param.getParameterName(), param.getDataType(), param.getLine(), param.getColumn()));
        }

        //* Register parameters in the local scope
        for (NodeParameter param : n.getParameters()) {
            ParameterSymbol parameterSymbol = new ParameterSymbol(
                    param.getParameterName(), param.getDataType(), param.getLine(), param.getColumn()
            );
            symbolTable.declare(param.getParameterName(), parameterSymbol);
        }

        for (ASTNode localDecl: n.getLocalVariables()){
            localDecl.accept(this);
        }

        // Visit the body
        if (n.getBody() != null) {
            n.getBody().accept(this);
        }

        symbolTable.popScope();
        functionReturnStack.pop();

        return null;
    }

    @Override
    public String visitParameter(NodeParameter n) {
        return n.getDataType();
    }

    // ============================================================
    // INSTRUCTIONS
    // ============================================================

    @Override
    public String visitAssignment(NodeAssignment n) {
        String lvalueType = n.getLvalue().accept(this);
        String exprType = n.getExpression() != null ? n.getExpression().accept(this) : null;

        if (lvalueType != null) {
            lvalueType = normalizeType(lvalueType);
        }
        if (exprType != null) {
            exprType = normalizeType(exprType);
        }

        if (lvalueType != null && exprType != null && !areTypesCompatible(lvalueType, exprType)) {
            errorReporter.reportError(
                    "Incompatible assignment type: cannot assign '" + exprType +
                            "' to '" + lvalueType + "'",
                    n.getLine(), n.getColumn()
            );
        }
        return null;
    }

    @Override
    public String visitRead(NodeRead n) {
        String lvalueType = n.getTarget().accept(this);
        if (lvalueType != null && typeTable.isStruct(lvalueType)) {
            errorReporter.reportError(
                    "You cannot read directly into a complete struct.",
                    n.getLine(), n.getColumn());
        }
        return null;
    }

    @Override
    public String visitPrint(NodePrint n) {
        for (ASTNode item : n.getPrintItems()) {
            item.accept(this);
        }
        return null;
    }

    @Override
    public String visitIf(NodeIf n) {
        String condType = n.getCondition().accept(this);
        if (condType != null && !isBooleanType(condType)) {
            errorReporter.reportError(
                    "The 'if' condition must be boolean, was found. '" + condType + "'",
                    n.getLine(), n.getColumn());
        }
        n.getThenBlock().accept(this);
        for (ElseIfClause elseIf : n.getElseIfClauses()) {
            String elseIfType = elseIf.getCondition().accept(this);
            if (elseIfType != null && !isBooleanType(elseIfType)) {
                errorReporter.reportError(
                        "The 'aliter' condition must be Boolean, found '" + elseIfType + "'",
                        elseIf.getCondition().getLine(), elseIf.getCondition().getColumn());
            }
            elseIf.getBlock().accept(this);
        }
        if (n.getElseBlock() != null) {
            n.getElseBlock().accept(this);
        }
        return null;
    }

    @Override
    public String visitWhile(NodeWhile n) {
        String condType = n.getCondition().accept(this);
        if (condType != null && !isBooleanType(condType)) {
            errorReporter.reportError(
                    "The 'dum' condition must be boolean, found '" + condType + "'",
                    n.getLine(), n.getColumn());
        }
        n.getBlock().accept(this);
        return null;
    }

    @Override
    public String visitDoWhile(NodeDoWhile n) {
        n.getBlock().accept(this);
        String condType = n.getCondition().accept(this);
        if (condType != null && !isBooleanType(condType)) {
            errorReporter.reportError(
                    "The condition of the 'facere...dum' must be boolean, was found. '" + condType + "'",
                    n.getLine(), n.getColumn());
        }
        return null;
    }

    @Override
    public String visitFor(NodeFor n) {
        symbolTable.pushScope("bloque for");

        if (n.getInitialization() != null) n.getInitialization().accept(this);

        String condType = n.getCondition() != null ? n.getCondition().accept(this) : null;
        if (condType != null && !isBooleanType(condType)) {
            errorReporter.reportError(
                    "The 'per' condition must be boolean, found '" + condType + "'",
                    n.getLine(), n.getColumn());
        }

        if (n.getUpdate() != null) n.getUpdate().accept(this);
        if (n.getBlock() != null) n.getBlock().accept(this);

        symbolTable.popScope();
        return null;
    }

    @Override
    public String visitContinue(NodeContinue n) {
        return null;
    }

    @Override
    public String visitBreak(NodeBreak n) {
        return null;
    }

    @Override
    public String visitReturn(NodeReturn n) {
        String expectedReturn = functionReturnStack.isEmpty() ? null : functionReturnStack.peek();
        if (expectedReturn != null) {
            expectedReturn = normalizeType(expectedReturn);
        }

        String exprType = n.getExpression() != null ? n.getExpression().accept(this) : null;
        if (exprType != null) {
            exprType = normalizeType(exprType);
        }

        if ("VOID".equals(expectedReturn)) {
            if (exprType != null) {
                errorReporter.reportError(
                        "The 'actio' function must not return a value.",
                        n.getLine(), n.getColumn()
                );
            }
        } else {
            if (exprType == null) {
                errorReporter.reportError(
                        "The 'ratio' function must return a value of type '" + expectedReturn + "'",
                        n.getLine(), n.getColumn()
                );
            } else if (expectedReturn != null && !areTypesCompatible(expectedReturn, exprType)) {
                errorReporter.reportError(
                        "Incompatible return type: expected '" + expectedReturn +
                                "' but was founded '" + exprType + "'",
                        n.getLine(), n.getColumn()
                );
            }
        }
        return null;
    }

    @Override
    public String visitBlock(NodeBlock n) {
        symbolTable.pushScope("block");
        for (ASTNode inst : n.getInstructions()) {
            inst.accept(this);
        }
        symbolTable.popScope();
        return null;
    }

    // ============================================================
    // LVALUE
    // ============================================================

    @Override
    public String visitLvalue(NodeLvalue n) {
        Symbol baseSymbol = symbolTable.lookup(n.getIdentifier());
        if (baseSymbol == null) {
            return "ERROR";
        }

        String currentType = baseSymbol.getType();
        if (currentType != null) {
            currentType = normalizeType(currentType);
        }

        for (ASTNode suffix : n.getSuffixes()) {
            if (suffix instanceof NodeFieldAccess fieldAccess) {
                if (currentType == null || !typeTable.isStruct(currentType)) {
                    errorReporter.reportError(
                            "The field cannot be accessed. '" + fieldAccess.getFieldName() +
                                    "' of a non-struct type '" + currentType + "'",
                            fieldAccess.getLine(), fieldAccess.getColumn()
                    );
                    return "ERROR";
                }
                String fieldType = typeTable.getFieldType(currentType, fieldAccess.getFieldName());
                if (fieldType == null) {
                    errorReporter.reportError(
                            "The struct '" + currentType + "' It has no field. '" + fieldAccess.getFieldName() + "'",
                            fieldAccess.getLine(), fieldAccess.getColumn()
                    );
                    return "ERROR";
                }
                currentType = normalizeType(fieldType);
            } else if (suffix instanceof NodeIndexAccess indexAccess) {
                String indexType = indexAccess.getIndexExpression().accept(this);
                if (indexType != null && !"NUMERUS".equals(indexType)) {
                    errorReporter.reportError(
                            "Array index must be NUMERUS, found '" + indexType + "'",
                            indexAccess.getLine(), indexAccess.getColumn()
                    );
                }
                if (baseSymbol instanceof ArraySymbol arrSym) {
                    String elemType = arrSym.getElementType();
                    if (elemType != null) {
                        currentType = normalizeType(elemType);
                    } else {
                        currentType = "ERROR";
                    }
                } else if (currentType != null && currentType.startsWith("SERIES_")) {
                    currentType = normalizeType(currentType.substring(7));
                } else {
                    errorReporter.reportError(
                            "A non-array type cannot be indexed. '" + currentType + "'",
                            indexAccess.getLine(), indexAccess.getColumn()
                    );
                    return "ERROR";
                }
            }
        }

        return currentType;
    }

    @Override
    public String visitFieldAccess(NodeFieldAccess n) {
        return null;
    }

    @Override
    public String visitIndexAccess(NodeIndexAccess n) {
        String indexType = n.getIndexExpression().accept(this);
        if (indexType != null && !"NUMERUS".equals(indexType)) {
            errorReporter.reportError(
                    "The index must be NUMERUS; found'" + indexType + "'",
                    n.getLine(), n.getColumn());
        }
        return null;
    }

    // ============================================================
    // EXPRESSIONS
    // ============================================================

    @Override
    public String visitBooleanExpression(NodeBooleanExpression n) {
        String innerType = n.getExpression() != null ? n.getExpression().accept(this) : null;
        if (innerType != null && !isBooleanType(innerType)) {
            errorReporter.reportError(
                    "Boolean expression expected, found '" + innerType + "'",
                    n.getLine(), n.getColumn());
        }
        return "BOOLEAN";
    }

    @Override
    public String visitNumericExpression(NodeNumericExpression n) {
        return n.getExpression() != null ? n.getExpression().accept(this) : null;
    }

    @Override
    public String visitStringExpression(NodeStringExpression n) {
        return n.getExpression() != null ? n.getExpression().accept(this) : null;
    }

    @Override
    public String visitIntegerLiteral(NodeIntegerLiteral n) {
        return "NUMERUS";
    }

    @Override
    public String visitDecimalLiteral(NodeDecimalLiteral n) {
        return "DECIMALIS";
    }

    @Override
    public String visitStringLiteral(NodeStringLiteral n) {
        return "TEXTUM";
    }

    @Override
    public String visitCharLiteral(NodeCharLiteral n) {
        return "LITTERA";
    }

    @Override
    public String visitBooleanLiteral(NodeBooleanLiteral n) {
        return "BOOLEAN";
    }

    @Override
    public String visitIdentifier(NodeIdentifier n) {
        Symbol symbol = symbolTable.lookup(n.getId());
        if (symbol == null) {
            errorReporter.reportError(
                    "Undeclared identifier: '" + n.getId() + "'",
                    n.getLine(), n.getColumn());
            return "ERROR";
        }
        return symbol.getType();
    }

    @Override
    public String visitAttributeAccess(NodeAttributeAccess n) {
        String baseType = n.getBase().accept(this);
        if (baseType == null || "ERROR".equals(baseType)) {
            return "ERROR";
        }

        // If access is via a field
        if (n.getFieldName() != null) {
            if (!typeTable.isStruct(baseType)) {
                errorReporter.reportError(
                        "The field cannot be accessed. '" + n.getFieldName() +
                                "' of the type '" + baseType + "'",
                        n.getLine(), n.getColumn());
                return "ERROR";
            }
            String fieldType = typeTable.getFieldType(baseType, n.getFieldName());
            if (fieldType == null) {
                errorReporter.reportError(
                        "The type '" + baseType + "' It has no field. '" + n.getFieldName() + "'",
                        n.getLine(), n.getColumn());
                return "ERROR";
            }
            return fieldType;
        }
        return baseType;
    }

    @Override
    public String visitFunctionCall(NodeFunctionCall n) {
        if (n.getFunctionName() == null) {

            // Access chain call for struct method
            for (ASTNode arg : n.getArguments()) {
                arg.accept(this);
            }
            return "ERROR";
        }

        Symbol symbol = symbolTable.lookupGlobal(n.getFunctionName());
        if (!(symbol instanceof FunctionSymbol funcSym)) {
            errorReporter.reportError(
                    "'" + n.getFunctionName() + "' it is not an invocable function",
                    n.getLine(), n.getColumn());
            return "ERROR";
        }

        // Validate the number of arguments
        if (funcSym.getParameters().size() != n.getArguments().size()) {
            errorReporter.reportError(
                    "The function '" + n.getFunctionName() + "' wait " + funcSym.getParameters().size() +
                            " arguments, but they were provided " + n.getArguments().size(),
                    n.getLine(), n.getColumn());
        }

        // Validate argument types
        int minArgs = Math.min(funcSym.getParameters().size(), n.getArguments().size());
        for (int i = 0; i < minArgs; i++) {
            String expectedType = funcSym.getParameters().get(i).getType();
            String actualType = n.getArguments().get(i).accept(this);
            if (actualType != null && !areTypesCompatible(expectedType, actualType)) {
                errorReporter.reportError(
                        "Type of argument " + (i + 1) + " incompatible in call to '" +
                                n.getFunctionName() + "': it was expected '" + expectedType +
                                "' but was founded '" + actualType + "'",
                        n.getArguments().get(i).getLine(), n.getArguments().get(i).getColumn());
            }
        }

        // Validate extra arguments
        for (int i = minArgs; i < n.getArguments().size(); i++) {
            n.getArguments().get(i).accept(this);
        }

        return funcSym.getReturnType() != null ? funcSym.getReturnType() : "VOID";
    }

    @Override
    public String visitBinaryOperation(NodeBinaryOperation n) {
        String leftType = n.getLeft().accept(this);
        String rightType = n.getRight().accept(this);

        if (leftType == null || rightType == null || "ERROR".equals(leftType) || "ERROR".equals(rightType)) {
            return "ERROR";
        }

        String op = n.getOperator();

        // Arithmetic operators
        if ("+".equals(op) || "-".equals(op) || "*".equals(op) || "/".equals(op)) {
            return resolveArithmeticType(leftType, rightType, op, n);
        }

        // Concatenation: if any operand is TEXTUM, the result is TEXTUM.
        if ("+".equals(op) && ("TEXTUM".equals(leftType) || "TEXTUM".equals(rightType))) {
            return "TEXTUM";
        }

        // Relational operators
        if ("==".equals(op) || "!=".equals(op) || "<".equals(op) || ">".equals(op) || "<=".equals(op) || ">=".equals(op)) {
            if (!areTypesCompatible(leftType, rightType)) {
                errorReporter.reportError(
                        "Incompatible types cannot be compared. '" + leftType + "' and '" + rightType + "'",
                        n.getLine(), n.getColumn());
                return "ERROR";
            }
            return "BOOLEAN";
        }

        // Operadores lógicos
        if ("&&".equals(op) || "||".equals(op)) {
            if (!isBooleanType(leftType) || !isBooleanType(rightType)) {
                errorReporter.reportError(
                        "Logic operator '" + op + "' requires boolean operands",
                        n.getLine(), n.getColumn());
                return "ERROR";
            }
            return "BOOLEAN";
        }

        errorReporter.reportError("Unknown operator: '" + op + "'", n.getLine(), n.getColumn());
        return "ERROR";
    }

    @Override
    public String visitUnaryOperation(NodeUnaryOperation n) {
        String operandType = n.getOperand().accept(this);
        if (operandType == null || "ERROR".equals(operandType)) {
            return "ERROR";
        }

        String op = n.getOperator();
        if ("!".equals(op)) {
            if (!isBooleanType(operandType)) {
                errorReporter.reportError(
                        "Operator '!' requires a boolean operand.",
                        n.getLine(), n.getColumn());
                return "ERROR";
            }
            return "BOOLEAN";
        }

        if ("+".equals(op) || "-".equals(op)) {
            if (!isNumericType(operandType)) {
                errorReporter.reportError(
                        "Operator '" + op + "' requires a numeric operand",
                        n.getLine(), n.getColumn());
                return "ERROR";
            }
            return operandType;
        }

        errorReporter.reportError("Unknown unary operator: '" + op + "'", n.getLine(), n.getColumn());
        return "ERROR";
    }

    @Override
    public String visitIncrementDecrement(NodeIncrementDecrement n) {

        //!Waters with this XD
        Symbol symbol = symbolTable.lookup(n.getOperation());
        if (symbol == null) {
            return "ERROR";
        }
        if (!"NUMERUS".equals(symbol.getType())) {
            errorReporter.reportError(
                    "Increment/decrement allowed only on NUMERUS",
                    n.getLine(), n.getColumn());
            return "ERROR";
        }
        return "NUMERUS";
    }

    @Override
    public String visitStructLiteral(NodeStructLiteral n) {
        if (n.getStructName() != null && !typeTable.exists(n.getStructName())) {
            errorReporter.reportError(
                    "Unknown struct type: '" + n.getStructName() + "'",
                    n.getLine(), n.getColumn());
        }

        StructType structType = typeTable.getStruct(n.getStructName());
        if (structType != null) {
            for (NodeStructFieldInitializer init : n.getFieldInitializers()) {
                String expectedFieldType = structType.getFieldType(init.getFieldName());
                String actualType = init.getValue().accept(this);
                if (expectedFieldType != null && actualType != null && !areTypesCompatible(expectedFieldType, actualType)) {
                    errorReporter.reportError(
                            "Incompatible type in field '" + init.getFieldName() + "' struct '" +
                                    n.getStructName() + "': it was expected '" + expectedFieldType +
                                    "' but was found'" + actualType + "'",
                            init.getLine(), init.getColumn());
                }
            }
        }

        return n.getStructName();
    }

    @Override
    public String visitStructFieldInitializer(NodeStructFieldInitializer n) {
        return n.getValue() != null ? n.getValue().accept(this) : null;
    }

    @Override
    public String visitArrayCreation(NodeArrayCreation n) {
        String sizeType = n.getSizeExpression() != null ? n.getSizeExpression().accept(this) : null;
        if (sizeType != null && !"NUMERUS".equals(sizeType)) {
            errorReporter.reportError(
                    "The size of an array must be NUMERUS.",
                    n.getLine(), n.getColumn());
        }
        return n.getElementType() != null ? "SERIES_" + n.getElementType() : null;
    }

    @Override
    public String visitArrayLiteral(NodeArrayLiteral n) {
        String inferredType = null;
        for (ASTNode elem : n.getValues()) {
            String elemType = elem.accept(this);
            if (inferredType == null) {
                inferredType = elemType;
            } else if (elemType != null && !areTypesCompatible(inferredType, elemType)) {
                errorReporter.reportError(
                        "Incompatible types within the array literal",
                        elem.getLine(), elem.getColumn());
            }
        }
        return inferredType != null ? "SERIES_" + inferredType : null;
    }

    // ============================================================
    // AUXILIARY METHODS
    // ============================================================

    /**
     * Resolves the resulting type of arithmetic operation.
     * Rules:
     *  - NUMERUS op NUMERUS → NUMERUS
     *  - DECIMALIS op DECIMALIS -> DECIMALIS
     *  - NUMERUS op DECIMALIS -> DECIMALIS
     *  - TEXTUM + anything -> TEXTUM Concatenation
     */
    private String resolveArithmeticType(String left, String right, String op, ASTNode node) {
        if ("TEXTUM".equals(left) || "TEXTUM".equals(right)) {

            // Only + allows concatenation; this was already handled in visitBinaryOperation.
            if ("+".equals(op)) {
                return "TEXTUM";
            }
            errorReporter.reportError(
                    "Operator '" + op + "' not valid for TEXTUM",
                    node.getLine(), node.getColumn());
            return "ERROR";
        }

        boolean leftNum = isNumericType(left);
        boolean rightNum = isNumericType(right);

        if (!leftNum || !rightNum) {
            errorReporter.reportError(
                    "Operator '" + op + "' requires numeric operands, found '" +
                            left + "' and '" + right + "'",
                    node.getLine(), node.getColumn());
            return "ERROR";
        }

        if ("DECIMALIS".equals(left) || "DECIMALIS".equals(right)) {
            return "DECIMALIS";
        }
        return "NUMERUS";
    }



    private String normalizeType(String type) {
        if ("bool".equals(type) || "BOOL".equals(type)) return "BOOLEAN";
        return type;
    }

    private boolean isBooleanType(String type) {
        return "BOOLEAN".equals(type) || "BOOL".equals(type) ||
                "bool".equals(type) || "VERUM".equals(type) || "FALSUS".equals(type);
    }

    private boolean isNumericType(String type) {
        return "NUMERUS".equals(type) || "DECIMALIS".equals(type);
    }

    /**
     * Checks if two types are compatible for assignment/comparison.
     * Rules:
     *  - Same type -> compatible.
     *  - NUMERUS and DECIMALIS -> compatible -> implicit promotion.
     */
    private boolean areTypesCompatible(String expected, String actual) {
        if (expected == null || actual == null) return true;
        if (expected.equals(actual)) return true;

        //* Numerical promotion
        if (("NUMERUS".equals(expected) && "DECIMALIS".equals(actual)) ||
                ("DECIMALIS".equals(expected) && "NUMERUS".equals(actual))) {
            return true;
        }

        //* Booleans: all boolean types are compatible.
        if (isBooleanType(expected) && isBooleanType(actual)) {
            return true;
        }

        //* Arrays: compatible if the elements are compatible.
        if (expected.startsWith("SERIES_") && actual.startsWith("SERIES_")) {
            String expectedElem = expected.substring(7);
            String actualElem = actual.substring(7);
            return areTypesCompatible(expectedElem, actualElem);
        }

        return false;
    }


}
