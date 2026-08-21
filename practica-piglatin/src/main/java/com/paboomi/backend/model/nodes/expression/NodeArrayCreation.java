package com.paboomi.backend.model.nodes.expression;

import com.paboomi.backend.model.nodes.principal.ASTNode;
import com.paboomi.backend.model.visitor.Visitor;
import lombok.Getter;
import lombok.Setter;

/**
 * Represents an array creation expression production
 * type [ expression ]
 */
@Getter
@Setter
public class NodeArrayCreation extends ASTNode {

    //* The type of elements in the array
    private String elementType;

    //* The size expression that determines the array lenght
    private ASTNode sizeExpression;

    public NodeArrayCreation() {
        this(null, null, 0, 0);
    }

    public NodeArrayCreation(int line, int column) {
        this(null, null, line, column);
    }

    public NodeArrayCreation(String elementType, ASTNode sizeExpression, int line, int column) {
        super(line, column);
        this.elementType = elementType;
        this.sizeExpression = sizeExpression;
    }

    @Override
    public String toString() {
        return elementType + "[" + sizeExpression.toString() + "]";
    }

    @Override
    public String getTipoNodo() {
        return "Array Creation";
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visitArrayCreation(this);
    }
}
