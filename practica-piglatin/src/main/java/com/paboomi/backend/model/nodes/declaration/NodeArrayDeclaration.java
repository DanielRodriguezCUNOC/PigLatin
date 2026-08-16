package com.paboomi.backend.model.nodes.declaration;

import com.paboomi.backend.model.nodes.principal.ASTNode;
import com.paboomi.backend.model.visitor.Visitor;

public class NodeArrayDeclaration extends ASTNode {


    @Override
    public String toString() {
        return "";
    }

    @Override
    public String getTipoNodo() {
        return "";
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return null;
    }
}
