package com.paboomi.backend.model.nodes.lvalue;

import com.paboomi.backend.model.nodes.principal.ASTNode;
import com.paboomi.backend.model.visitor.Visitor;
import lombok.Getter;
import lombok.Setter;

/**
 * Represents an index access suffix production
 * LEFT_CLASP expression Right_CLASP
 */
@Getter
@Setter
public class NodeIndexAccess extends ASTNode {

    //* The expression that evaluates to the index
    private ASTNode indexExpression;

    public NodeIndexAccess() {
        this(null, 0, 0);
    }

    public NodeIndexAccess(int line, int column) {
        super(line, column);
    }

    public NodeIndexAccess(ASTNode indexExpression, int line, int column) {
        super(line, column);
        this.indexExpression = indexExpression;
    }

    @Override
    public String toString() {
        return "[" + indexExpression.toString() + "]";
    }

    @Override
    public String getTipoNodo() {
        return "Index Access";
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visitIndexAccess(this);
    }
}
