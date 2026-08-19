package com.paboomi.backend.model.nodes.instruction;

import com.paboomi.backend.model.nodes.expression.NodeBooleanExpression;
import com.paboomi.backend.model.nodes.principal.ASTNode;
import com.paboomi.backend.model.visitor.Visitor;
import lombok.Getter;
import lombok.Setter;

/**
 * Represents a do-while statement poduction:
 * FACERE block DUM (booleanExpression) ;
 */
@Getter
@Setter
public class NodeDoWhile extends ASTNode {

    //* Block of instructions to execute in each iteration
    private NodeBlock block;

    //* Condition that determines whether to continue looping
    private NodeBooleanExpression condition;

    public NodeDoWhile() {
        this(null, null, 0, 0);
    }

    public NodeDoWhile(int line, int column) {
        this(null, null, line, column);
    }

    public NodeDoWhile(NodeBlock block,
                       NodeBooleanExpression condition,
                       int line, int column) {
        super(line, column);
        this.block = block;
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "facere " + block.toString() + "dum (" +  condition.toString() + ");";
    }

    @Override
    public String getTipoNodo() {
        return "Do-While Statement";
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visitDoWhile(this);
    }
}
