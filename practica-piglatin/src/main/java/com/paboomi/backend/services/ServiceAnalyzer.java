package com.paboomi.backend.services;

import com.paboomi.backend.dtos.ParserResultDTO;
import com.paboomi.backend.listeners.CustomErrorListener;
// Replace these imports with your ANTLR generated classes
import com.paboomi.backend.antlr.generated.LatinLexer;
import com.paboomi.backend.antlr.generated.LatinParser;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class ServiceAnalyzer {

    public ParserResultDTO executeAnalysis(String sourceCode) {
        CustomErrorListener errorListener = new CustomErrorListener();

        // Create CharStream and Lexer
        LatinLexer lexer = new LatinLexer(CharStreams.fromString(sourceCode));
        lexer.removeErrorListeners();
        lexer.addErrorListener(errorListener);

        // Create TokenStream and Parser
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LatinParser parser = new LatinParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(errorListener);

        // Start parsing from your root rule (replace 'startRule' with your actual root rule, e.g., 'program')
        ParseTree parseTree = parser.program();

        return new ParserResultDTO(parseTree, errorListener.getErrorsList());
    }
}