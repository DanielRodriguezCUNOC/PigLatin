package com.paboomi.backend.model.nodes.expression;

import com.paboomi.backend.model.nodes.principal.ASTNode;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class FunctionCallInfo {
    private String functionName;
    private List<ASTNode> arguments;

    public FunctionCallInfo(String functionName, List<ASTNode> arguments) {
        this.functionName = functionName;
        this.arguments = arguments != null ? arguments : new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(functionName).append("(");
        if (arguments != null && !arguments.isEmpty()) {
            for (int i = 0; i < arguments.size(); i++) {
                sb.append(arguments.get(i).toString());
                if (i < arguments.size() - 1) {
                    sb.append(", ");
                }
            }
        }
        sb.append(")");
        return sb.toString();
    }
}