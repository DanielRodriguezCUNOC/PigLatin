package com.paboomi.backend.model.nodes.literal;

import com.paboomi.backend.model.nodes.principal.ASTNode;
import com.paboomi.backend.model.visitor.Visitor;
import lombok.Getter;
import lombok.Setter;

/**
 * Represent an integer literal production:
 * INTEGER
 */
@Getter
@Setter
public class NodeIntegerLiteral extends ASTNode {

    //* Integer value
    private int value;

    public NodeIntegerLiteral() {
        this(0, 0, 0);
    }

    public NodeIntegerLiteral(int line, int column) {
        this(0, line, column);
    }

    public NodeIntegerLiteral(int value, int line, int column) {
        super(line, column);
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @Override
    public String getTipoNodo() {
        return "Integer Literal";
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visitIntegerLiteral(this);
    }
}
