package com.paboomi.backend.model.nodes.declaration;

import com.paboomi.backend.model.nodes.principal.ASTNode;
import com.paboomi.backend.model.visitor.Visitor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a array declaration production:
 * SERIES ID [entero] (: tipo)? ({valores})?
 */

@Getter
@Setter
public class NodeArrayDeclaration extends NodeDeclaration {

    private String identifier;
    private int size;
    private String elementType;
    private final List<ASTNode> initialValues;

    public NodeArrayDeclaration(){
        this(null, 0, null, new ArrayList<>(), 0, 0);
    }

    public NodeArrayDeclaration(int line, int column) {
        this(null, 0, null, new ArrayList<>(), line, column);
    }

    public NodeArrayDeclaration(String identifier, int size, String elementType, List<ASTNode> initialValues ,int line, int column) {
        super(line, column);
        this.identifier = identifier;
        this.size = size;
        this.elementType = elementType;
        this.initialValues = initialValues != null ? initialValues : new ArrayList<>();
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("series ").append(identifier).
                append("[").append(size).append("]");

        if (elementType != null) sb.append(" : ").append(elementType);
        if (initialValues.isEmpty()) {
            sb.append(" = {");

            for (int i = 0; i < initialValues.size(); i++) {
                sb.append(initialValues.get(i).toString());
                if (i < initialValues.size() - 1) sb.append(", ");
            }
            sb.append("}");
        }
        return sb.toString();
    }

    @Override
    public String getTipoNodo() {
        return "Array Declaration";
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visitArrayDeclaration(this);
    }
}
