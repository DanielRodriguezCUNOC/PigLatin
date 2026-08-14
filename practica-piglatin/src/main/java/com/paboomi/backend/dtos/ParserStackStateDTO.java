package com.paboomi.backend.dtos;

import java.util.List;

/**
 * This class represents one frame of animation.
 * One frozen state in the time during parsing
 * */

public record ParserStackStateDTO(

    /** Step number*/
    int step,
    /** Enter, Exit, Consume, Accept*/
    String operation,
    /** Token or rule name*/
    String detail,
    //* Stack of rules active at this moment (programa, declaration, etc)
    List<String> ruleStack,
    //* Position in the source code
    int tokenLine,
    int tokenColumn

){
    public String getLogMessage(){
        return String.format("Step %d [%s]: %s | Stack depth: %d",
                step, operation, detail, ruleStack.size());
    }
}