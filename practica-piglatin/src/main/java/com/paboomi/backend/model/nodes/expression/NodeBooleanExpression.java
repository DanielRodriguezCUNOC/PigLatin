package com.paboomi.backend.model.nodes.expression;

import com.paboomi.backend.model.nodes.principal.ASTNode;
import com.paboomi.backend.model.visitor.Visitor;
import lombok.Getter;
import lombok.Setter;

/**
 * Represents a boolean expression production;
 * booleanOrExpression
 */
@Getter
@Setter
public class NodeBooleanExpression extends NodeExpression {

    //* Boolean expression AST node
    private ASTNode expression;

    public NodeBooleanExpression(ASTNode expression) {
        this(null, 0, 0);
    }

    public NodeBooleanExpression(int line, int column) {
        this(null, line, column);
    }

    public NodeBooleanExpression(ASTNode expression, int line, int column) {
        super(line, column);
        this.expression = expression;
    }

    @Override
    public String toString() {
        return expression != null ? expression.toString() : "";
    }

    @Override
    public String getTipoNodo() {
        return "Boolean Expression";
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visitBooleanExpression(this);
    }
}
