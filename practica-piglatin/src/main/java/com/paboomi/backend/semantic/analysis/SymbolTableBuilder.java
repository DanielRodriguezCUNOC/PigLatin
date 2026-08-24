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

/**
 * Semantic analysis pass 1.
 *
 * Traversal: Top-down.
 * Functions:
 * - Build the Symbol Table.
 * - Build the Type Table.
 * - Validate strict sequencing: every identifier used must be previously
 * declared
 * in the same scope or an ancestor scope.
 * - Register function signatures before analyzing their bodies.
 *
 * !EYE!!: A local variable may shadow one from a parent scope.
 */
@Getter
@Setter
public class SymbolTableBuilder implements Visitor<Void> {

    private final SymbolTable symbolTable;
    private final TypeTable typeTable;
    private final SemanticErrorReporter errorReporter;

    public SymbolTableBuilder(TypeTable typeTable, SemanticErrorReporter errorReporter) {
        this.symbolTable = new SymbolTable();
        this.typeTable = typeTable;
        this.errorReporter = errorReporter;
    }

    // ============================================================
    // PROGRAM
    // ============================================================

    @Override
    public Void visitProgram(NodeProgram n) {
        // Global Declarations (structs, variables, arreglos)
        for (ASTNode decl : n.getGlobalDeclarations()) {
            decl.accept(this);
        }

        // Functions: registrar firmas y analizar cuerpos
        for (ASTNode func : n.getFunctionDefinitions()) {
            func.accept(this);
        }

        // Instructions of main
        for (ASTNode inst : n.getMainInstructions()) {
            inst.accept(this);
        }

        return null;
    }

    // ============================================================
    // STATEMENTS
    // ============================================================

    @Override
    public Void visitVariableDeclaration(NodeVariableDeclaration n) {
        // Validate type if it was explicit
        if (n.getType() != null && !typeTable.exists(n.getType())) {
            errorReporter.reportError(
                    "Uknow Type: '" + n.getType() + "'",
                    n.getLine(), n.getColumn());
        }

        // Visit the initializer first
        if (n.getInitializer() != null) {
            n.getInitializer().accept(this);

        }

        // Register in the current scope
        VariableSymbol symbol = new VariableSymbol(
                n.getIdentifier(), n.getType(), n.getLine(), n.getColumn());

        // * Check if the initializer is a literal and store constant value
        if (n.getInitializer() != null) {
            ASTNode init = n.getInitializer();
            Object constVal = null;
            if (init instanceof NodeIntegerLiteral) {
                constVal = ((NodeIntegerLiteral) init).getValue();
            } else if (init instanceof NodeDecimalLiteral) {
                constVal = ((NodeDecimalLiteral) init).getValue();
            } else if (init instanceof NodeBooleanLiteral) {
                constVal = ((NodeBooleanLiteral) init).isValue();
            } else if (init instanceof NodeCharLiteral) {
                constVal = (int) ((NodeCharLiteral) init).getValue();
            } else if (init instanceof NodeStringLiteral) {
                constVal = ((NodeStringLiteral) init).getValue();
            }
            if (constVal != null) {
                symbol.setConstantValue(constVal);
            }
        }

        // * Register in current scope
        if (!symbolTable.declare(n.getIdentifier(), symbol)) {
            errorReporter.reportError(
                    "Variable redeclaration '" + n.getIdentifier() + "' in the same scope",
                    n.getLine(), n.getColumn());
        }

        return null;
    }

    @Override
    public Void visitArrayDeclaration(NodeArrayDeclaration n) {
        // Validate element type if explicitly specified
        if (n.getElementType() != null && !typeTable.exists(n.getElementType())) {
            errorReporter.reportError(
                    "Unknow Type: '" + n.getElementType() + "'",
                    n.getLine(), n.getColumn());
        }

        // * Visit expression of size (T-T)
        if (n.getSizeExpression() != null)
            n.getSizeExpression().accept(this);

        // Visit initial values
        for (ASTNode value : n.getInitialValues()) {
            value.accept(this);
        }

        // * Regiter in symbol table
        ArraySymbol symbol = new ArraySymbol(
                n.getIdentifier(),
                n.getElementType() != null ? "SERIES_" + n.getElementType() : null,
                0,
                n.getElementType(),
                n.getLine(), n.getColumn());
        if (!symbolTable.declare(n.getIdentifier(), symbol)) {
            errorReporter.reportError(
                    "Redeclaration of array '" + n.getIdentifier() + "' in the same scope",
                    n.getLine(), n.getColumn());
        }

        return null;
    }

    @Override
    public Void visitStructDefinition(NodeStructDefinition n) {
        StructType structType = new StructType(n.getStructName());

        // Register fields
        for (ASTNode field : n.getFields()) {
            if (field instanceof NodeVariableDeclaration fieldDecl) {
                if (!typeTable.exists(fieldDecl.getType())) {
                    errorReporter.reportError(
                            "Unknown type in field '" + fieldDecl.getIdentifier() + "': '" + fieldDecl.getType() + "'",
                            fieldDecl.getLine(), fieldDecl.getColumn());
                }
                structType.addField(fieldDecl.getIdentifier(), fieldDecl.getType());
            }
        }

        if (!typeTable.registerStruct(n.getStructName(), structType)) {
            errorReporter.reportError(
                    "Redeclaration of struct '" + n.getStructName() + "'",
                    n.getLine(), n.getColumn());
        }

        return null;
    }

    // ============================================================
    // FUNCTIONS
    // ============================================================

    @Override
    public Void visitFunction(NodeFunction n) {

        // Validate return type
        if (n.getReturnType() != null && !typeTable.exists(n.getReturnType())) {
            errorReporter.reportError(
                    "Unknown return type: '" + n.getReturnType() + "'",
                    n.getLine(), n.getColumn());
        }

        // Register signature in Scope Global
        FunctionSymbol funcSymbol = new FunctionSymbol(
                n.getFunctionName(), n.getReturnType(),
                n.getLine(), n.getColumn(), n.getReturnType());

        for (NodeParameter param : n.getParameters()) {
            funcSymbol.addParameter(new ParameterSymbol(
                    param.getParameterName(), param.getDataType(), param.getLine(), param.getColumn()));
        }
        if (!symbolTable.declare(n.getFunctionName(), funcSymbol)) {
            errorReporter.reportError(
                    "Function redeclaration '" + n.getFunctionName() + "'",
                    n.getLine(), n.getColumn());
        }

        // New scope for the function body
        symbolTable.pushScope("function " + n.getFunctionName());

        // * Register parameters in the local scope
        for (NodeParameter param : n.getParameters()) {
            ParameterSymbol parameterSymbol = new ParameterSymbol(
                    param.getParameterName(), param.getDataType(), param.getLine(), param.getColumn());
            symbolTable.declare(param.getParameterName(), parameterSymbol);
        }

        for (ASTNode localDecl : n.getLocalVariables()) {
            localDecl.accept(this);
        }

        // Visit the body
        if (n.getBody() != null) {
            n.getBody().accept(this);
        }

        // Pop scope
        symbolTable.popScope();

        return null;
    }

    @Override
    public Void visitParameter(NodeParameter n) {

        // The parameters are recorded within visitFunction.
        return null;
    }

    // ============================================================
    // INSTRUCTIONS
    // ============================================================

    @Override
    public Void visitAssignment(NodeAssignment n) {
        n.getLvalue().accept(this);
        if (n.getExpression() != null) {
            n.getExpression().accept(this);
        }
        return null;
    }

    @Override
    public Void visitRead(NodeRead n) {
        n.getTarget().accept(this);
        return null;
    }

    @Override
    public Void visitPrint(NodePrint n) {
        for (ASTNode item : n.getPrintItems()) {
            item.accept(this);
        }
        return null;
    }

    @Override
    public Void visitIf(NodeIf n) {
        n.getCondition().accept(this);
        n.getThenBlock().accept(this);
        for (ElseIfClause elseIf : n.getElseIfClauses()) {
            elseIf.getCondition().accept(this);
            elseIf.getBlock().accept(this);
        }
        if (n.getElseBlock() != null) {
            n.getElseBlock().accept(this);
        }
        return null;
    }

    @Override
    public Void visitWhile(NodeWhile n) {
        n.getCondition().accept(this);
        n.getBlock().accept(this);
        return null;
    }

    @Override
    public Void visitDoWhile(NodeDoWhile n) {
        n.getBlock().accept(this);
        n.getCondition().accept(this);
        return null;
    }

    @Override
    public Void visitFor(NodeFor n) {

        // // The for loop's init clause can declare a variable (creating a new implicit
        // scope for the loop)
        symbolTable.pushScope("for block");

        if (n.getInitialization() != null) {
            n.getInitialization().accept(this);
        }
        if (n.getCondition() != null) {
            n.getCondition().accept(this);
        }
        if (n.getUpdate() != null) {
            n.getUpdate().accept(this);
        }
        if (n.getBlock() != null) {
            n.getBlock().accept(this);
        }

        symbolTable.popScope();
        return null;
    }

    @Override
    public Void visitContinue(NodeContinue n) {
        return null;
    }

    @Override
    public Void visitBreak(NodeBreak n) {
        return null;
    }

    @Override
    public Void visitReturn(NodeReturn n) {
        if (n.getExpression() != null) {
            n.getExpression().accept(this);
        }
        return null;
    }

    @Override
    public Void visitBlock(NodeBlock n) {
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
    public Void visitLvalue(NodeLvalue n) {

        // Validate that the base identifier exists
        Symbol symbol = symbolTable.lookup(n.getIdentifier());
        if (symbol == null) {
            boolean looksLikeTypedArrayCreation = typeTable.exists(n.getIdentifier())
                    && n.getSuffixes().size() == 1
                    && n.getSuffixes().get(0) instanceof NodeIndexAccess;

            if (looksLikeTypedArrayCreation) {
                return null;
            }

            errorReporter.reportError(
                    "Undeclared identifier: '" + n.getIdentifier() + "'",
                    n.getLine(), n.getColumn());
        }

        // Suffixes are validated in the TypeChecker.
        for (ASTNode suffix : n.getSuffixes()) {
            suffix.accept(this);
        }
        return null;
    }

    @Override
    public Void visitFieldAccess(NodeFieldAccess n) {
        return null;
    }

    @Override
    public Void visitIndexAccess(NodeIndexAccess n) {
        if (n.getIndexExpression() != null) {
            n.getIndexExpression().accept(this);
        }
        return null;
    }

    // ============================================================
    // EXPRESSIONS
    // ============================================================

    @Override
    public Void visitBooleanExpression(NodeBooleanExpression n) {
        if (n.getExpression() != null) {
            n.getExpression().accept(this);
        }
        return null;
    }

    @Override
    public Void visitNumericExpression(NodeNumericExpression n) {
        if (n.getExpression() != null) {
            n.getExpression().accept(this);
        }
        return null;
    }

    @Override
    public Void visitStringExpression(NodeStringExpression n) {
        if (n.getExpression() != null) {
            n.getExpression().accept(this);
        }
        return null;
    }

    @Override
    public Void visitIntegerLiteral(NodeIntegerLiteral n) {
        return null;
    }

    @Override
    public Void visitDecimalLiteral(NodeDecimalLiteral n) {
        return null;
    }

    @Override
    public Void visitStringLiteral(NodeStringLiteral n) {
        return null;
    }

    @Override
    public Void visitCharLiteral(NodeCharLiteral n) {
        return null;
    }

    @Override
    public Void visitBooleanLiteral(NodeBooleanLiteral n) {
        return null;
    }

    @Override
    public Void visitIdentifier(NodeIdentifier n) {
        Symbol symbol = symbolTable.lookup(n.getId());
        if (symbol == null) {
            errorReporter.reportError(
                    "Undeclared identifier: '" + n.getId() + "'",
                    n.getLine(), n.getColumn());
        }
        return null;
    }

    @Override
    public Void visitAttributeAccess(NodeAttributeAccess n) {
        if (n.getBase() != null) {
            n.getBase().accept(this);
        }
        return null;
    }

    @Override
    public Void visitFunctionCall(NodeFunctionCall n) {

        // If it has an explicit name, validate that the function exists
        if (n.getFunctionName() != null) {
            Symbol symbol = symbolTable.lookupGlobal(n.getFunctionName());
            if (symbol == null) {
                errorReporter.reportError(
                        "Undeclared function: '" + n.getFunctionName() + "'",
                        n.getLine(), n.getColumn());
            } else if (!(symbol instanceof FunctionSymbol)) {
                errorReporter.reportError(
                        "'" + n.getFunctionName() + "' it is not a function",
                        n.getLine(), n.getColumn());
            }
        }

        // Validate arguments
        for (ASTNode arg : n.getArguments()) {
            arg.accept(this);
        }
        return null;
    }

    @Override
    public Void visitBinaryOperation(NodeBinaryOperation n) {
        if (n.getLeft() != null)
            n.getLeft().accept(this);
        if (n.getRight() != null)
            n.getRight().accept(this);
        return null;
    }

    @Override
    public Void visitUnaryOperation(NodeUnaryOperation n) {
        if (n.getOperand() != null)
            n.getOperand().accept(this);
        return null;
    }

    @Override
    public Void visitIncrementDecrement(NodeIncrementDecrement n) {
        if (n.getOperand() != null)
            n.getOperand().accept(this);
        return null;
    }

    @Override
    public Void visitStructLiteral(NodeStructLiteral n) {
        // Validate that the struct type exists.
        if (n.getStructName() != null && !typeTable.exists(n.getStructName())) {
            errorReporter.reportError(
                    "Unknown struct type: '" + n.getStructName() + "'",
                    n.getLine(), n.getColumn());
        }
        for (NodeStructFieldInitializer init : n.getFieldInitializers()) {
            init.accept(this);
        }
        return null;
    }

    @Override
    public Void visitStructFieldInitializer(NodeStructFieldInitializer n) {
        if (n.getValue() != null) {
            n.getValue().accept(this);
        }
        return null;
    }

    @Override
    public Void visitArrayCreation(NodeArrayCreation n) {
        if (n.getSizeExpression() != null) {
            n.getSizeExpression().accept(this);
        }
        return null;
    }

    @Override
    public Void visitArrayLiteral(NodeArrayLiteral n) {
        for (ASTNode elem : n.getValues()) {
            elem.accept(this);
        }
        return null;
    }
}
