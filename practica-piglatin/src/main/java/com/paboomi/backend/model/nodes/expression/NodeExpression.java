package com.paboomi.backend.model.nodes.expression;

import com.paboomi.backend.model.nodes.principal.ASTNode;
import com.paboomi.backend.model.visitor.Visitor;

public abstract class NodeExpression extends ASTNode {

    public NodeExpression(){
        super();
    }

    public NodeExpression(int line,  int column){
        super(line, column);
    }
}
