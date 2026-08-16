package com.paboomi.backend.listeners;

import com.paboomi.backend.antlr.generated.LatinParser;
import com.paboomi.backend.antlr.generated.LatinParserBaseListener;
import com.paboomi.backend.dtos.ParserStackStateDTO;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;

/**
 * This class catchs events in real time, while the parser works
 */

public class ParseTraceListener extends LatinParserBaseListener {

    private final Deque<String> symbolStack = new ArrayDeque<>();
    private final List<ParserStackStateDTO> states = new ArrayList<>();
    private int stepCounter = 0;

    public ParseTraceListener(LatinParser parser){}

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        String rulenName = LatinParser.ruleNames[ctx.getRuleIndex()];
        int childCount = ctx.getChildCount();

        //* Simulates REDUCE: remove as many symbols as the rule had children
        for (int i = 0; i < childCount && !symbolStack.isEmpty(); i++) {
            symbolStack.pop();
        }
        symbolStack.push(rulenName);
        int line = (ctx.getStop() != null) ? ctx.getStop().getLine() : 0;
        int col =  (ctx.getStop() != null) ? ctx.getStop().getCharPositionInLine() : 0;
        addState("REDUCE", rulenName, line, col);

        //* Remove from the active stack
        if(!symbolStack.isEmpty()){
        symbolStack.pop();
        }
    }

    @Override
    public void visitTerminal(TerminalNode node){
        Token token = node.getSymbol();
        String text = token.getText();
        symbolStack.push(text);
        addState("SHIFT", text, token.getLine(), token.getCharPositionInLine());
    }

    public List<ParserStackStateDTO> getStates(){
        return Collections.unmodifiableList(states);
    }

    public void addAcceptState(){
        addState("ACCEPT", "program", 0,0);
    }

    public void addState(String operation, String detail, int line, int column){
        stepCounter++;

        //* bottom of the stack first, top last
        List<String> snapshot = new ArrayList<>(symbolStack);
        Collections.reverse(snapshot);

        states.add(new ParserStackStateDTO(stepCounter, operation, detail, snapshot, line, column));
    }
}
