package com.paboomi.backend.semantic.errors;

import com.paboomi.backend.dtos.CustomErrorDTO;
import com.paboomi.backend.model.nodes.principal.ASTNode;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class SemanticErrorReporter {

    private final List<CustomErrorDTO> errors;

    public SemanticErrorReporter() {
        this.errors = new ArrayList<>();
    }

    public void reportError(String message, int line, int column) {
        errors.add(new CustomErrorDTO(line, column, message));
    }

    //* Overcharged method for use in the visitor
    public void reportError(String message, ASTNode node) {
        errors.add(new CustomErrorDTO(node.getLine(), node.getColumn(), message));
    }

    public  boolean hasErrors(){
        return !errors.isEmpty();
    }

    public int getErrorsCount(){
        return errors.size();
    }

    public void clear(){
        errors.clear();
    }

    @Override
    public String toString() {

        if(errors.isEmpty())return "No semantic errors founded";

        StringBuilder sb = new StringBuilder();
        sb.append("Semantic Errors: (").append(errors.size()).append(")\n");
        for (CustomErrorDTO error : errors) {
            sb.append(" [").append(error.line())
                    .append(":").append(error.column())
                    .append("] ").append(error.message()).append("\n");
        }
        return sb.toString();
    }
}
