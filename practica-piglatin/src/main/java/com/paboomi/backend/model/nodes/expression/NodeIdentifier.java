package com.paboomi.backend.model.nodes.expression;

import com.paboomi.backend.model.nodes.principal.ASTNode;
import com.paboomi.backend.model.visitor.Visitor;
import lombok.Getter;
import lombok.Setter;

/**
 * Represent the name of a identifier production:
 * ID
 */
@Getter
@Setter
public class NodeIdentifier extends ASTNode {

    //* The identifier name
    private String id;

    public NodeIdentifier() {
        this("", 0, 0);
    }

    public NodeIdentifier(int line, int column) {
        this("", line, column);
    }

    public NodeIdentifier(String id, int line, int column) {
        super(line, column);
        this.id = id;
    }

    @Override
    public String toString() {
        return id;
    }

    @Override
    public String getTipoNodo() {
        return "Identifier";
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visitIdentifier(this);
    }
}
