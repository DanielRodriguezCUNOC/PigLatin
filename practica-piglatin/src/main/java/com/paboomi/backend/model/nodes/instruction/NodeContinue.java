package com.paboomi.backend.model.nodes.instruction;

import com.paboomi.backend.model.nodes.principal.ASTNode;
import com.paboomi.backend.model.visitor.Visitor;
import lombok.Getter;
import lombok.Setter;

/**
 * Represents a continue statement production:
 * PERGE ;
 */

@Getter
@Setter
public class NodeContinue extends ASTNode {

    public NodeContinue(){
        super(0, 0);
    }

    public NodeContinue(int line, int column) {
        super(line, column);
    }


    @Override
    public String toString() {
        return "perge;";
    }

    @Override
    public String getTipoNodo() {
        return "Continue";
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visitContinue(this);
    }
}
