package com.paboomi.backend.model.nodes.expression;

import com.paboomi.backend.model.nodes.principal.ASTNode;
import com.paboomi.backend.model.visitor.Visitor;
import lombok.Getter;
import lombok.Setter;

/**
 * Represents a string expression production:
 * stringAdditiveExpression
 */

@Getter
@Setter
public class NodeStringExpression extends NodeExpression {

    //* String expression AST node
    private ASTNode expression;

    public NodeStringExpression() {
        this(null, 0, 0);
    }

    public NodeStringExpression(int line, int column) {
        this(null, line, column);
    }

    public NodeStringExpression(ASTNode expression, int line, int column) {
        super(line, column);
        this.expression = expression;
    }

    @Override
    public String toString() {
        return expression != null ? expression.toString() : "";
    }

    @Override
    public String getTipoNodo() {
        return "String Expression";
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visitStringExpression(this);
    }
}
