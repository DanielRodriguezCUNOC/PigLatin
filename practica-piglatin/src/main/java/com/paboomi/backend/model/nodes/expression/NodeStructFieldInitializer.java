package com.paboomi.backend.model.nodes.expression;

import com.paboomi.backend.model.nodes.principal.ASTNode;
import com.paboomi.backend.model.visitor.Visitor;
import lombok.Getter;
import lombok.Setter;

/**
 *Represents a struct field initializer production:
 * ID : expression
 */
@Getter
@Setter
public class NodeStructFieldInitializer extends ASTNode {

    //* The name of the field being initialized
    private String fieldName;

    //* The value expression assigned to the field
    private ASTNode value;

    public NodeStructFieldInitializer() {
        this(null, null, 0, 0);
    }

    public NodeStructFieldInitializer(int line, int column) {
        this(null, null, line, column);
    }

    public NodeStructFieldInitializer(String fieldName, ASTNode value, int line, int column) {
        super(line, column);
        this.fieldName = fieldName;
        this.value = value;
    }

    @Override
    public String toString() {
        return fieldName + ": " + value.toString();
    }

    @Override
    public String getTipoNodo() {
        return "Struct Field";
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visitStructFieldInitializer(this);
    }
}
