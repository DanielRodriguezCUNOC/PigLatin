package com.paboomi.backend.model.nodes.lvalue;

import com.paboomi.backend.model.nodes.principal.ASTNode;
import com.paboomi.backend.model.visitor.Visitor;
import lombok.Getter;
import lombok.Setter;

/**
 * Represents a field access suffix production:
 * DOT ID
 */

@Getter
@Setter
public class NodeFieldAccess extends ASTNode {

    //* The name of the field being accessed
    private String fieldName;

    public NodeFieldAccess(){
        this(null, 0, 0);
    }

    public NodeFieldAccess(int line, int column){
        this(null, line, column);
    }

    public NodeFieldAccess(String fieldName, int line, int column){
        super(line, column);
        this.fieldName = fieldName;
    }

    @Override
    public String toString() {
        return "." + fieldName;
    }

    @Override
    public String getTipoNodo() {
        return "Field Access";
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visitFieldValue(this);
    }
}
