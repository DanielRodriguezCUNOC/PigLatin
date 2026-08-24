package com.paboomi.backend.translate;

import com.paboomi.backend.model.nodes.declaration.NodeDeclaration;
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

import java.util.List;

/**
 * Code generator that traverses the AST (again -_-) and produces PigLatin source code.
 */
public class PigLatinCodeGenerator implements Visitor<Void> {

    private final StringBuilder sb;
    private int indentLevel;

    public PigLatinCodeGenerator() {
        this.sb = new StringBuilder();
        this.indentLevel = 0;
    }

    public String generate(NodeProgram program) {
        sb.setLength(0);
        indentLevel = 0;
        program.accept(this);
        return sb.toString();
    }

    // ============================================================
    // OUTPUT HELPERS
    // ============================================================

    private void append(String text) {
        sb.append(text);
    }

    private void appendKeyword(String keyword) {
        sb.append(PigLatinTranslator.toPigLatin(keyword));
    }

    private void appendIdentifier(String id) {
        sb.append(PigLatinTranslator.toPigLatin(id));
    }

    private void appendType(String type) {
        sb.append(PigLatinTranslator.toPigLatin(type));
    }

    private void indent() {
        sb.append("    ".repeat(indentLevel));
    }

    private void increaseIndent() {
        indentLevel++;
    }

    private void decreaseIndent() {
        indentLevel--;
    }

    private void newLine() {
        sb.append("\n");
    }

    private void endStatement() {

        sb.append(";");
        newLine();
    }

    // ============================================================
    // PROGRAM
    // ============================================================

    @Override
    public Void visitProgram(NodeProgram n) {
        List<NodeDeclaration> globals = n.getGlobalDeclarations();
        List<ASTNode> functions = n.getFunctionDefinitions();
        List<ASTNode> main = n.getMainInstructions();

        if (!globals.isEmpty()) {
            appendKeyword("VARIABILES");
            append(">\n");
            increaseIndent();
            for (ASTNode decl : globals) {
                indent();
                decl.accept(this);
                endStatement();
            }
            decreaseIndent();
            newLine();
        }

        if (!functions.isEmpty()) {
            appendKeyword("MUNERA");
            append(">\n");
            increaseIndent();
            for (ASTNode func : functions) {
                indent();
                func.accept(this);
                newLine();
            }
            decreaseIndent();
            newLine();
        }

        if (!main.isEmpty()) {
            appendKeyword("MAIOR");
            append(">\n");
            increaseIndent();
            for (ASTNode inst : main) {
                indent();
                inst.accept(this);
                endStatement();
            }
            decreaseIndent();
            appendKeyword("FINIS");
            append(";");
            newLine();
        }

        return null;
    }

    // ============================================================
    // DECLARATIONS
    // ============================================================

    @Override
    public Void visitVariableDeclaration(NodeVariableDeclaration n) {
        appendKeyword("ESTO");
        append(" ");
        appendIdentifier(n.getIdentifier());
        if (n.getType() != null) {
            append(" : ");
            appendType(n.getType());
        }
        if (n.getInitializer() != null) {
            append(" = ");
            n.getInitializer().accept(this);
        }
        return null;
    }

    @Override
    public Void visitArrayDeclaration(NodeArrayDeclaration n) {
        appendKeyword("SERIES");
        append(" ");
        appendIdentifier(n.getIdentifier());
        append("[");
        if (n.getSizeExpression() != null) {
            n.getSizeExpression().accept(this);
        } else {
            append(String.valueOf(n.getSize()));
        }
        append("]");
        if (n.getElementType() != null) {
            append(" : ");
            appendType(n.getElementType());
        }
        if (!n.getInitialValues().isEmpty()) {
            append(" = {");
            for (int i = 0; i < n.getInitialValues().size(); i++) {
                n.getInitialValues().get(i).accept(this);
                if (i < n.getInitialValues().size() - 1) append(", ");
            }
            append("}");
        }
        return null;
    }

    @Override
    public Void visitStructDefinition(NodeStructDefinition n) {
        appendKeyword("STRUCTURA");
        append(" ");
        appendIdentifier(n.getStructName());
        append(" {\n");
        increaseIndent();
        List<ASTNode> fields = n.getFields();
        for (int i = 0; i < fields.size(); i++) {
            indent();
            fields.get(i).accept(this);
            if (i < fields.size() - 1) {
                append(";");
            }
            newLine();
        }
        decreaseIndent();
        indent();
        append("} ");
        appendKeyword("FINIS");
        return null;
    }

    // ============================================================
    // FUNCTIONS
    // ============================================================

    @Override
    public Void visitFunction(NodeFunction n) {
        if (n.isVoid()) {
            appendKeyword("ACTIO");
        } else {
            appendKeyword("RATIO");
            append(" ");
            appendType(n.getReturnType());
        }
        append(" ");
        appendIdentifier(n.getFunctionName());
        append("(");
        List<NodeParameter> params = n.getParameters();
        for (int i = 0; i < params.size(); i++) {
            params.get(i).accept(this);
            if (i < params.size() - 1) append(", ");
        }
        append(") {\n");
        increaseIndent();

        if (n.getBody() != null) {
            n.getBody().accept(this);
        }

        decreaseIndent();
        indent();
        append("} ");
        appendKeyword("FINIS");
        return null;
    }

    @Override
    public Void visitParameter(NodeParameter n) {
        appendKeyword("ESTO");
        append(" ");
        appendIdentifier(n.getParameterName());
        append(" : ");
        appendType(n.getDataType());
        return null;
    }

    // ============================================================
    // INSTRUCTIONS
    // ============================================================

    @Override
    public Void visitAssignment(NodeAssignment n) {
        n.getLvalue().accept(this);
        append(" = ");
        if (n.getExpression() != null) {
            n.getExpression().accept(this);
        }
        return null;
    }

    @Override
    public Void visitRead(NodeRead n) {
        append("%OINK_OINK");
        append(" ");
        n.getTarget().accept(this);
        return null;
    }

    @Override
    public Void visitPrint(NodePrint n) {
        append("%OINK");
        append(" ");
        List<ASTNode> items = n.getPrintItems();
        for (int i = 0; i < items.size(); i++) {
            items.get(i).accept(this);
            if (i < items.size() - 1) {
                append(" %OINK ");
            }
        }
        return null;
    }

    @Override
    public Void visitIf(NodeIf n) {
        appendKeyword("SI");
        append(" (");
        n.getCondition().accept(this);
        append(") {\n");
        increaseIndent();
        n.getThenBlock().accept(this);
        decreaseIndent();
        indent();
        append("}");

        for (ElseIfClause elseIf : n.getElseIfClauses()) {
            append(" ");
            appendKeyword("ALITER");
            append(" (");
            elseIf.getCondition().accept(this);
            append(") {\n");
            increaseIndent();
            elseIf.getBlock().accept(this);
            decreaseIndent();
            indent();
            append("}");
        }

        if (n.getElseBlock() != null) {
            append(" ");
            appendKeyword("ALITER");
            append(" {\n");
            increaseIndent();
            n.getElseBlock().accept(this);
            decreaseIndent();
            indent();
            append("}");
        }

        append(" ");
        appendKeyword("FINIS");
        return null;
    }

    @Override
    public Void visitWhile(NodeWhile n) {
        appendKeyword("DUM");
        append(" (");
        n.getCondition().accept(this);
        append(") {\n");
        increaseIndent();
        n.getBlock().accept(this);
        decreaseIndent();
        indent();
        append("} ");
        appendKeyword("FINIS");
        return null;
    }

    @Override
    public Void visitDoWhile(NodeDoWhile n) {
        appendKeyword("FACERE");
        append(" {\n");
        increaseIndent();
        n.getBlock().accept(this);
        decreaseIndent();
        indent();
        append("} ");
        appendKeyword("DUM");
        append(" (");
        n.getCondition().accept(this);
        append(")");
        return null;
    }

    @Override
    public Void visitFor(NodeFor n) {
        appendKeyword("PER");
        append(" (");
        if (n.getInitialization() != null) {
            n.getInitialization().accept(this);
        }
        append("; ");
        if (n.getCondition() != null) {
            n.getCondition().accept(this);
        }
        append("; ");
        if (n.getUpdate() != null) {
            n.getUpdate().accept(this);
        }
        append(") {\n");
        increaseIndent();
        if (n.getBlock() != null) {
            n.getBlock().accept(this);
        }
        decreaseIndent();
        indent();
        append("} ");
        appendKeyword("FINIS");
        return null;
    }

    @Override
    public Void visitContinue(NodeContinue n) {
        appendKeyword("PERGE");
        return null;
    }

    @Override
    public Void visitBreak(NodeBreak n) {
        appendKeyword("INTERRUMPE");
        return null;
    }

    @Override
    public Void visitReturn(NodeReturn n) {
        appendKeyword("REDDERE");
        if (n.getExpression() != null) {
            append(" ");
            n.getExpression().accept(this);
        }
        return null;
    }

    @Override
    public Void visitBlock(NodeBlock n) {
        for (ASTNode inst : n.getInstructions()) {
            indent();
            inst.accept(this);
            endStatement();
        }
        return null;
    }

    // ============================================================
    // LVALUE
    // ============================================================

    @Override
    public Void visitLvalue(NodeLvalue n) {
        appendIdentifier(n.getIdentifier());
        for (ASTNode suffix : n.getSuffixes()) {
            suffix.accept(this);
        }
        return null;
    }

    @Override
    public Void visitFieldAccess(NodeFieldAccess n) {
        append(".");
        appendIdentifier(n.getFieldName());
        return null;
    }

    @Override
    public Void visitIndexAccess(NodeIndexAccess n) {
        append("[");
        if (n.getIndexExpression() != null) {
            n.getIndexExpression().accept(this);
        }
        append("]");
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
        append(String.valueOf(n.getValue()));
        return null;
    }

    @Override
    public Void visitDecimalLiteral(NodeDecimalLiteral n) {
        append(String.valueOf(n.getValue()));
        return null;
    }

    @Override
    public Void visitStringLiteral(NodeStringLiteral n) {
        append("\"" + n.getValue() + "\"");
        return null;
    }

    @Override
    public Void visitCharLiteral(NodeCharLiteral n) {
        append("'");
        append(String.valueOf(n.getValue()));
        append("'");
        return null;
    }

    @Override
    public Void visitBooleanLiteral(NodeBooleanLiteral n) {
        if (n.isValue()) {
            appendKeyword("VERUM");
        } else {
            appendKeyword("FALSUS");
        }
        return null;
    }

    @Override
    public Void visitIdentifier(NodeIdentifier n) {
        appendIdentifier(n.getId());
        return null;
    }

    @Override
    public Void visitAttributeAccess(NodeAttributeAccess n) {
        /*if (n.getBase() != null) {
            n.getBase().accept(this);
        }
        if (n.getFieldName() != null) {
            append(".");
            appendIdentifier(n.getFieldName());
        }
        return null;
         */

            // Visit the base expression first
            if (n.getBase() != null) {
                n.getBase().accept(this);
            }

            // Field access: object.field
            if (n.isFieldAccess()) {

                append(".");
                appendIdentifier(n.getFieldName());

                // Index access: array[index]
            } else if (n.isIndexAccess()) {

                append("[");

                if (n.getIndexExpression() != null) {
                    n.getIndexExpression().accept(this);
                }

                append("]");

                // Function call: function(arg1, arg2)
            } else if (n.isCall()) {

                FunctionCallInfo info = n.getFunctionCallInfo();

                if (info != null) {

                    appendIdentifier(info.getFunctionName());
                    append("(");

                    List<ASTNode> arguments = info.getArguments();

                    for (int i = 0; i < arguments.size(); i++) {

                        if (i > 0) {
                            append(", ");
                        }

                        if (arguments.get(i) != null) {
                            arguments.get(i).accept(this);
                        }
                    }

                    append(")");
                }
            }
            return null;
    }

    @Override
    public Void visitFunctionCall(NodeFunctionCall n) {
        if (n.getFunctionName() != null) {
            appendIdentifier(n.getFunctionName());
        }
        append("(");
        List<ASTNode> args = n.getArguments();
        for (int i = 0; i < args.size(); i++) {
            args.get(i).accept(this);
            if (i < args.size() - 1) append(", ");
        }
        append(")");
        return null;
    }

    @Override
    public Void visitBinaryOperation(NodeBinaryOperation n) {
        append("(");
        if (n.getLeft() != null) n.getLeft().accept(this);
        append(" ");
        append(n.getOperator());
        append(" ");
        if (n.getRight() != null) n.getRight().accept(this);
        append(")");
        return null;
    }

    @Override
    public Void visitUnaryOperation(NodeUnaryOperation n) {
        append(n.getOperator());
        if (n.getOperand() != null) {
            n.getOperand().accept(this);
        }
        return null;
    }

    @Override
    public Void visitIncrementDecrement(NodeIncrementDecrement n) {
        if (n.getOperand() != null) {
            n.getOperand().accept(this);
        }
        append(n.getOperation());
        return null;
    }

    @Override
    public Void visitStructLiteral(NodeStructLiteral n) {
        if (n.getStructName() != null) {
            appendIdentifier(n.getStructName());
        }
        append(" {");
        List<NodeStructFieldInitializer> inits = n.getFieldInitializers();
        for (int i = 0; i < inits.size(); i++) {
            inits.get(i).accept(this);
            if (i < inits.size() - 1) append(", ");
        }
        append("}");
        return null;
    }

    @Override
    public Void visitStructFieldInitializer(NodeStructFieldInitializer n) {
        appendIdentifier(n.getFieldName());
        append(" : ");
        if (n.getValue() != null) {
            n.getValue().accept(this);
        }
        return null;
    }

    @Override
    public Void visitArrayCreation(NodeArrayCreation n) {
        appendType(n.getElementType());
        append("[");
        if (n.getSizeExpression() != null) {
            n.getSizeExpression().accept(this);
        }
        append("]");
        return null;
    }

    @Override
    public Void visitArrayLiteral(NodeArrayLiteral n) {
        append("{");
        List<ASTNode> elems = n.getValues();
        for (int i = 0; i < elems.size(); i++) {
            elems.get(i).accept(this);
            if (i < elems.size() - 1) append(", ");
        }
        append("}");
        return null;
    }


}
