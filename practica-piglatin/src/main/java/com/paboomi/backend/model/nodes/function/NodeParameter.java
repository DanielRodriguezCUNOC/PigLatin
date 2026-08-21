package com.paboomi.backend.model.nodes.function;

import com.paboomi.backend.model.nodes.principal.ASTNode;
import com.paboomi.backend.model.visitor.Visitor;
import lombok.Getter;
import lombok.Setter;


/**
 * Represetns a function paraemter production:
 * ESTO ID COLON type
 */
@Getter
@Setter
public class NodeParameter extends ASTNode {

    //* The identifier of the parameter
    private String parameterName;

    //* The data type of the parameter
    private String dataType;

    public NodeParameter() {
        this(null, null, 0, 0);
    }

    public NodeParameter(int line, int column) {
        this(null, null, line, column);
    }

    public NodeParameter(String parameterName,
                         String dataType,
                         int line, int column) {
        super(line, column);
        this.parameterName = parameterName;
        this.dataType = dataType;

    }

    @Override
    public String toString() {
        return "esto " + parameterName + " : " + dataType;
    }

    @Override
    public String getTipoNodo() {
        return "Parameter";
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visitParameter(this);
    }
}
