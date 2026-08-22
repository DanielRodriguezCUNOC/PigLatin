package com.paboomi.backend.model.nodes.expression;

import com.paboomi.backend.model.nodes.principal.ASTNode;
import com.paboomi.backend.model.visitor.Visitor;
import lombok.Getter;
import lombok.Setter;

/**
 * Represents a numeric expression production:
 * additiveExpression
 */
@Getter
@Setter
public class NodeNumericExpression extends NodeExpression {

    //* The numeric expression AST node
    private ASTNode expression;

    public NodeNumericExpression() {
        this(null, 0, 0);
    }

    public NodeNumericExpression(int line, int column) {
        this(null, line, column);
    }

    public NodeNumericExpression(ASTNode expression, int line, int column) {
        super(line, column);
        this.expression = expression;
    }

    @Override
    public String toString() {
        return expression != null ? expression.toString() : "";
    }

    @Override
    public String getTipoNodo() {
        return "Numeric Expression";
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visitNumericExpression(this);
    }
}
