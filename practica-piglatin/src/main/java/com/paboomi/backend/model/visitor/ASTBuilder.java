package com.paboomi.backend.model.visitor;

import com.paboomi.backend.antlr.generated.LatinParser;
import com.paboomi.backend.antlr.generated.LatinParserBaseVisitor;
import com.paboomi.backend.model.nodes.principal.ASTNode;
import com.paboomi.backend.model.nodes.principal.NodeProgram;

public class ASTBuilder extends LatinParserBaseVisitor<ASTNode> {

    @Override
    public ASTNode visitProgram(LatinParser.ProgramContext ctx) {
        return new NodeProgram(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
    }
}
