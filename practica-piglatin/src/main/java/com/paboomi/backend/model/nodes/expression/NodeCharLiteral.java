package com.paboomi.backend.model.nodes.expression;

import com.paboomi.backend.model.nodes.principal.ASTNode;
import com.paboomi.backend.model.visitor.Visitor;
import lombok.Getter;
import lombok.Setter;

/**
 * Represents a character literal production:
 * CHAR
 */
@Getter
@Setter
public class NodeCharLiteral extends ASTNode {

    //* Character value
    private char value;

    public NodeCharLiteral() {
        this('\0', 0, 0);
    }

    public NodeCharLiteral(int line, int column) {
        this('\0', line, column);
    }

    public NodeCharLiteral(char value, int line, int column) {
        super(line, column);
        this.value = value;
    }

    @Override
    public String toString() {
        return "'" + value + "'";
    }

    @Override
    public String getTipoNodo() {
        return "Char Literal";
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visitCharLiteral(this);
    }
}
