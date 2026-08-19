package com.paboomi.backend.model.nodes.instruction;

import com.paboomi.backend.model.nodes.expression.NodeBooleanExpression;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ElseIfClause {

    private NodeBooleanExpression condition;
    private NodeBlock block;

    public ElseIfClause(NodeBooleanExpression condition, NodeBlock block) {
        this.condition = condition;
        this.block = block;
    }
}
