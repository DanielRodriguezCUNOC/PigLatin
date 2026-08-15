package com.paboomi.backend.listeners;

import com.paboomi.backend.antlr.generated.LatinParser;
import com.paboomi.backend.antlr.generated.LatinParserBaseListener;
import com.paboomi.backend.dtos.ParserStackStateDTO;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;

/**
 * This class catchs events in real time, while the parser works
 */

public class ParseTraceListener extends LatinParserBaseListener {

    private final Deque<String> activeRules = new ArrayDeque<>();
    private final List<ParserStackStateDTO> states = new ArrayList<>();
    private int stepCounter = 0;

    public ParseTraceListener(LatinParser parser){}

    @Override
    public void enterEveryRule(ParserRuleContext ctx){
        String ruleName = LatinParser.ruleNames[ctx.getRuleIndex()];
        activeRules.push(ruleName);
        addState("ENTER", ruleName, ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());

    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        String rulenName = LatinParser.ruleNames[ctx.getRuleIndex()];
        // Save rule state
        int line = (ctx.getStop() != null) ? ctx.getStop().getLine() : 0;
        int col =  (ctx.getStop() != null) ? ctx.getStop().getCharPositionInLine() : 0;
        addState("EXIT", rulenName, line, col);

        // Remove from the active stack
        if(!activeRules.isEmpty()){
        activeRules.pop();
        }
    }

    @Override
    public void visitTerminal(TerminalNode node){
        var token = node.getSymbol();
        addState("CONSUME", token.getText(), token.getLine(), token.getCharPositionInLine());
    }

    public List<ParserStackStateDTO> getStates(){
        return Collections.unmodifiableList(states);
    }

    public void addAcceptState(){
        addState("ACCEPT", "program", 0,0);
    }

    public void addState(String operation, String detail, int line, int column){
        stepCounter++;

        // Copy of stack: de top of ArrayDeque is at the end of the list
        List<String> snapshot = new ArrayList<>();
        Collections.reverse(snapshot);

        states.add(new ParserStackStateDTO(stepCounter, operation, detail, snapshot, line, column));
    }
}
