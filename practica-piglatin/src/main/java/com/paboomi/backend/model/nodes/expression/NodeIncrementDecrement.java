package com.paboomi.backend.model.nodes.expression;

import com.paboomi.backend.model.nodes.principal.ASTNode;
import com.paboomi.backend.model.visitor.Visitor;
import lombok.Getter;
import lombok.Setter;

/**
 * Represents an increment or decrement operation
 */
@Getter
@Setter
public class NodeIncrementDecrement extends ASTNode {

    //* The operand that is incremented or decremented
    private ASTNode operand;

    //* The type of operation
    private String operation;

    public NodeIncrementDecrement() {
        this(null, null, 0, 0);
    }

    public NodeIncrementDecrement(int line, int column) {
        this(null, null, line, column);
    }

    public NodeIncrementDecrement(ASTNode operand, String operation, int line, int column) {
        super(line, column);
        this.operand = operand;
        this.operation = operation;
    }

    @Override
    public String toString() {
        return operand.toString() + operation;
    }

    @Override
    public String getTipoNodo() {
        return "Increment/Decrement";
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visitIncrementDecrement(this);
    }
}
