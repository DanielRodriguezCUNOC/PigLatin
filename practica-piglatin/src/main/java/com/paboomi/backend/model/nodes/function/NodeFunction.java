package com.paboomi.backend.model.nodes.function;


import com.paboomi.backend.model.nodes.declaration.NodeDeclaration;
import com.paboomi.backend.model.nodes.instruction.NodeBlock;
import com.paboomi.backend.model.nodes.principal.ASTNode;
import com.paboomi.backend.model.visitor.Visitor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a function definition production:
 * ACTIO ID (parameterList?) functionBody FINIS;
 * RATIO type ID (parameterList?) functionBody FINIS;
 */

@Getter
@Setter
public class NodeFunction extends ASTNode {

    //* The identifier of the function
    private String functionName;

    //* The return type of the function
    private String returnType;

    //* List of parameter that this functions accepts
    private List<NodeParameter> parameters;

    //* Local variable declarations section
    private List<NodeDeclaration> localVariables;

    //* The boy of the function containig instructions
    private NodeBlock body;

    //* Indicates whether this is a void function or not
    private boolean isVoid;

    public NodeFunction(){
        this(null, null, new ArrayList<>(), new ArrayList<>(), null, false, 0, 0);
    }

    public NodeFunction(int line, int column){
        this(null, null, new ArrayList<>(), new ArrayList<>(), null, false, line, column);
    }

    public NodeFunction(
            String functionName, String returnType,
            List<NodeParameter> parameters,
            List<NodeDeclaration> localVariables,
            NodeBlock body, boolean isVoid, int line,  int column
    ){
        super(line, column);
        this.functionName = functionName;
        this.returnType = returnType;
        this.parameters = parameters;
        this.localVariables = localVariables;
        this.body = body;
        this.isVoid = isVoid;
    }

    //* Adds parameter to the function
    public void addParameter(NodeParameter parameter){
        if(parameters == null) this.parameters = new ArrayList<>();
        parameters.add(parameter);
    }

    //* Adds local variable declaration to the function
    public void addLocalVariable(NodeDeclaration declaration){
        if(localVariables == null) this.localVariables = new ArrayList<>();
        this.localVariables.add(declaration);
    }

    public boolean hasParameters() {
        return parameters != null && !parameters.isEmpty();
    }

    //* Gets the number of parameters this function accepts.
    public int getParameterCount() {
        return parameters != null ? parameters.size() : 0;
    }

    //* Checks if the function has any local variable declarations.
    public boolean hasLocalVariables() {
        return localVariables != null && !localVariables.isEmpty();
    }


    //* Gets the number of local variables in this function.
    public int getLocalVariableCount() {
        return localVariables != null ? localVariables.size() : 0;
    }


    //* Checks if the function has a body.
    public boolean hasBody() {
        return body != null;
    }

    /**
     * Gets the return type as a string.
     * Returns "void" for void functions.
     */
    public String getReturnTypeString() {
        return isVoid ? "void" : returnType;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        //* Function header
        if (isVoid) {
            sb.append("actio ");
        } else {
            sb.append("ratio ").append(returnType).append(" ");
        }

        sb.append(functionName).append("(");

        //* Parameters
        if (parameters != null && !parameters.isEmpty()) {
            for (int i = 0; i < parameters.size(); i++) {
                sb.append(parameters.get(i).toString());
                if (i < parameters.size() - 1) {
                    sb.append(", ");
                }
            }
        }

        sb.append(") ");

        //* Function body
        sb.append("{ ");

        //* Local variables section
        if (localVariables != null && !localVariables.isEmpty()) {
            sb.append("variabiles { ");
            for (int i = 0; i < localVariables.size(); i++) {
                sb.append(localVariables.get(i).toString());
                if (i < localVariables.size() - 1) {
                    sb.append(" ");
                }
            }
            sb.append("} ");
        }

        //* Instructions
        if (body != null) {
            sb.append(body.toString());
        }

        sb.append(" } finis ;");

        return sb.toString();
    }

    @Override
    public String getTipoNodo() {
        return "Function";
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visitFunction(this);
    }
}
