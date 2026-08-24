package com.paboomi.backend.semantic.expression;

import com.paboomi.backend.model.nodes.declaration.NodeArrayDeclaration;
import com.paboomi.backend.model.nodes.declaration.NodeStructDefinition;
import com.paboomi.backend.model.nodes.declaration.NodeVariableDeclaration;
import com.paboomi.backend.model.nodes.expression.*;
import com.paboomi.backend.model.nodes.function.NodeFunction;
import com.paboomi.backend.model.nodes.function.NodeParameter;
import com.paboomi.backend.model.nodes.instruction.*;
import com.paboomi.backend.model.nodes.literal.*;
import com.paboomi.backend.model.nodes.lvalue.NodeFieldAccess;
import com.paboomi.backend.model.nodes.lvalue.NodeIndexAccess;
import com.paboomi.backend.model.nodes.lvalue.NodeLvalue;
import com.paboomi.backend.model.nodes.principal.ASTNode;
import com.paboomi.backend.model.nodes.principal.NodeProgram;
import com.paboomi.backend.model.visitor.Visitor;
import com.paboomi.backend.semantic.errors.SemanticErrorReporter;
import com.paboomi.backend.semantic.symboltable.SymbolTable;
import com.paboomi.backend.semantic.symboltable.symbols.Symbol;
import com.paboomi.backend.semantic.symboltable.symbols.VariableSymbol;

/**
 * This class evaluate expressions just in time using the visitor (again -_-)
 */

public class ConstantFolder implements Visitor<Object> {

    private final SemanticErrorReporter errorReporter;
    private final SymbolTable symbolTable;

    public ConstantFolder(SemanticErrorReporter errorReporter,  SymbolTable symbolTable) {
        this.errorReporter = errorReporter;
        this.symbolTable = symbolTable;
    }

    //* Method for evaluate a node
    public Object evaluate(ASTNode node) {
        return node.accept(this);
    }

    @Override
    public Object visitProgram(NodeProgram n) {
        return null;
    }

    @Override
    public Object visitVariableDeclaration(NodeVariableDeclaration n) {
        return null;
    }

    @Override
    public Object visitArrayDeclaration(NodeArrayDeclaration n) {
        return null;
    }



    @Override
    public Object visitStructDefinition(NodeStructDefinition n) {
        return null;
    }

    @Override
    public Object visitFunction(NodeFunction n) {
        return null;
    }

    @Override
    public Object visitParameter(NodeParameter n) {
        return null;
    }

    @Override
    public Object visitAssignment(NodeAssignment n) {
        return null;
    }

    @Override
    public Object visitRead(NodeRead n) {
        return null;
    }

    @Override
    public Object visitPrint(NodePrint n) {
        return null;
    }

    @Override
    public Object visitIf(NodeIf n) {
        return null;
    }

    @Override
    public Object visitWhile(NodeWhile n) {
        return null;
    }

    @Override
    public Object visitDoWhile(NodeDoWhile n) {
        return null;
    }

    @Override
    public Object visitFor(NodeFor n) {
        return null;
    }

    @Override
    public Object visitContinue(NodeContinue n) {
        return null;
    }

    @Override
    public Object visitBreak(NodeBreak n) {
        return null;
    }

    @Override
    public Object visitReturn(NodeReturn n) {
        return null;
    }

    @Override
    public Object visitBlock(NodeBlock n) {
        return null;
    }

    @Override
    public Object visitBooleanExpression(NodeBooleanExpression n) {
        return null;
    }

    @Override
    public Object visitNumericExpression(NodeNumericExpression n) {
        return null;
    }

    @Override
    public Object visitStringExpression(NodeStringExpression n) {
        return null;
    }



    @Override
    public Object visitIntegerLiteral(NodeIntegerLiteral n) {
        return n.getValue();
    }

    @Override
    public Object visitDecimalLiteral(NodeDecimalLiteral n) {
        return n.getValue();
    }

    @Override
    public Object visitStringLiteral(NodeStringLiteral n) {
        return n.getValue();
    }

    @Override
    public Object visitCharLiteral(NodeCharLiteral n) {
        return (int) n.getValue();
    }

    @Override
    public Object visitBooleanLiteral(NodeBooleanLiteral n) {
        return n.isValue();
    }

    @Override
    public Object visitIdentifier(NodeIdentifier n) {
        Symbol sym = symbolTable.lookup(n.getId());
        if (sym instanceof VariableSymbol) {
            Object constVal = sym.getConstantValue();
            if (constVal != null) {
                return constVal;
            }
        }
        return null;
    }

    @Override
    public Object visitAttributeAccess(NodeAttributeAccess n) {
        return null;
    }

    @Override
    public Object visitIndexAccess(NodeIndexAccess n) {
        return null;
    }

    @Override
    public Object visitFunctionCall(NodeFunctionCall n) {
        return null;
    }

    //* Binary operations
    @Override
    public Object visitBinaryOperation(NodeBinaryOperation n) {
        Object left = n.getLeft().accept(this);
        Object right = n.getRight().accept(this);

        // If any of them is not constant, we return null
        if (left == null || right == null) return null;

        // We evaluate based on the operator.
        String op = n.getOperator();

        // Aritmetic
        if ("+".equals(op) || "-".equals(op) || "*".equals(op) || "/".equals(op)) {
            return evaluateArithmetic(op, left, right, n);
        }

        // Relational
        if ("==".equals(op) || "!=".equals(op) || "<".equals(op) ||
                ">".equals(op) || "<=".equals(op) || ">=".equals(op)) {
            return evaluateRelational(op, left, right, n);
        }

        // Logics
        if ("&&".equals(op) || "||".equals(op)) {
            if (!(left instanceof Boolean) || !(right instanceof Boolean)) return null;
            boolean bLeft = (Boolean) left;
            boolean bRight = (Boolean) right;
            switch (op) {
                case "&&": return bLeft && bRight;
                case "||": return bLeft || bRight;
                default: return null;
            }
        }

        return null;
    }

    @Override
    public Object visitUnaryOperation(NodeUnaryOperation n) {
        Object operand = n.getOperand().accept(this);
        if (operand == null) return null;
        String op = n.getOperator();

        if ("+".equals(op)) {
            /**
             * If it is a number, return it unchanged
             * if it is a boolean, return an error
             */

            return operand;
        } else if ("-".equals(op)) {
            double val = toDouble(operand);
            return -val;
        } else if ("!".equals(op)) {
            if (operand instanceof Boolean) {
                return !(Boolean) operand;
            }
            return null;
        }
        return null;
    }

    @Override
    public Object visitIncrementDecrement(NodeIncrementDecrement n) {
        return null;
    }

    @Override
    public Object visitStructLiteral(NodeStructLiteral n) {
        return null;
    }

    @Override
    public Object visitArrayCreation(NodeArrayCreation n) {
        return null;
    }

    @Override
    public Object visitArrayLiteral(NodeArrayLiteral n) {
        return null;
    }

    @Override
    public Object visitLvalue(NodeLvalue n) {
        return null;
    }

    @Override
    public Object visitFieldAccess(NodeFieldAccess n) {
        return null;
    }

    @Override
    public Object visitStructFieldInitializer(NodeStructFieldInitializer n) {
        return null;
    }


    private Object evaluateArithmetic(String op, Object left, Object right, ASTNode node) {
        //* Convert to numbers
        double l = toDouble(left);
        double r = toDouble(right);

        //* Detect division by zero
        if ("/".equals(op) && r == 0.0) {
            errorReporter.reportError("Division by zero in constant expression",
                    node.getLine(), node.getColumn());
            return null;
        }

        double result;
        switch (op) {
            case "+": result = l + r; break;
            case "-": result = l - r; break;
            case "*": result = l * r; break;
            case "/": result = l / r; break;
            default: return null;
        }

        if (isInteger(left) && isInteger(right)) {
            return (int) result;
        } else {
            return result;
        }
    }


    private Object evaluateRelational(String op, Object left, Object right, ASTNode node) {

        double l = toDouble(left);
        double r = toDouble(right);
        switch (op) {
            case "==": return l == r;
            case "!=": return l != r;
            case "<":  return l < r;
            case ">":  return l > r;
            case "<=": return l <= r;
            case ">=": return l >= r;
            default: return null;
        }
    }

    //* Auxiliary methods to convert to double
    private double toDouble(Object obj) {
        if (obj instanceof Integer) return ((Integer) obj).doubleValue();
        if (obj instanceof Double) return (Double) obj;
        if (obj instanceof Boolean) return ((Boolean) obj) ? 1.0 : 0.0;

        //* For chars
        if (obj instanceof Character) return (double) (Character) obj;
        return 0.0;
    }

    private boolean isInteger(Object obj) {
        return obj instanceof Integer;
    }
}
