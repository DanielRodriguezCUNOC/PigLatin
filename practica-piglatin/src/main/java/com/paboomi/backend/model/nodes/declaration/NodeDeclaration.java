package com.paboomi.backend.model.nodes.declaration;

import com.paboomi.backend.model.nodes.principal.ASTNode;

/**
 * This class allows that other nodes declare identifier (variables)
 */
public abstract class NodeDeclaration extends ASTNode {

    public NodeDeclaration() {super();}

    public NodeDeclaration(int line, int column) {super(line,column);}
}
