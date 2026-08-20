package com.paboomi.backend.model.nodes.expression;

import com.paboomi.backend.model.nodes.principal.ASTNode;
import com.paboomi.backend.model.visitor.Visitor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a struct literal expression production:
 * (ID)? { (structFieldInitializer (COMMA structFieldInitializer)*)? }
 */

@Getter
@Setter
public class NodeStructLiteral extends ASTNode {

    //* The name of the struct type (optional)
    private String structName;

    //* List of field initializers for the struct
    private List<NodeStructFieldInitializer> fieldInitializers;

    public NodeStructLiteral() {
        this(null, new ArrayList<>(), 0, 0);
    }

    public NodeStructLiteral(int line, int column) {
        this(null, new ArrayList<>(), line, column);
    }

    public NodeStructLiteral(String structName, List<NodeStructFieldInitializer> fieldInitializers, int line, int column){
        super(line, column);
        this.structName = structName;
        this.fieldInitializers = fieldInitializers;
    }

    public void addFieldInitializer(NodeStructFieldInitializer fieldInitializer){
        if(this.fieldInitializers == null) this.fieldInitializers = new ArrayList<>();
        this.fieldInitializers.add(fieldInitializer);
    }

    public boolean hasFieldInitializer(NodeStructFieldInitializer fieldInitializer){
        return this.fieldInitializers != null && this.fieldInitializers.contains(fieldInitializer);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        if(structName != null && !structName.isEmpty()) sb.append("{ ");

        if (fieldInitializers != null && !fieldInitializers.isEmpty()) {
            for (int i = 0; i < fieldInitializers.size(); i++) {
                sb.append(fieldInitializers.get(i).toString());
                if (i != fieldInitializers.size() - 1) sb.append(", ");
            }
        }
        sb.append(" }");
        return sb.toString();
    }

    @Override
    public String getTipoNodo() {
        return "Struct Literal";
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visitStructLiteral(this);
    }
}
