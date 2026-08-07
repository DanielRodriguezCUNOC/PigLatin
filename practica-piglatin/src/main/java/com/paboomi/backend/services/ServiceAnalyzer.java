package com.paboomi.backend.services;

import com.paboomi.backend.dtos.ParserResultDTO;
import com.paboomi.backend.listeners.CustomErrorListener;
// Replace these imports with your ANTLR generated classes
import com.paboomi.backend.antlr.YourGrammarLexer;
import com.paboomi.backend.antlr.YourGrammarParser;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class ServiceAnalyzer {

    public ParserResultDTO executeAnalysis(String sourceCode) {
        CustomErrorListener errorListener = new CustomErrorListener();

        // Create CharStream and Lexer
        YourGrammarLexer lexer = new YourGrammarLexer(CharStreams.fromString(sourceCode));
        lexer.removeErrorListeners();
        lexer.addErrorListener(errorListener);

        // Create TokenStream and Parser
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        YourGrammarParser parser = new YourGrammarParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(errorListener);

        // Start parsing from your root rule (replace 'startRule' with your actual root rule, e.g., 'program')
        ParseTree parseTree = parser.startRule();

        return new ParserResultDTO(parseTree, errorListener.getErrorsList());
    }
}