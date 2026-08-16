package com.paboomi.backend.model.nodes.principal;

import com.paboomi.backend.model.visitor.Visitor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class NodeProgram extends ASTNode{

    private List<ASTNode> globalDeclarations;
    private List<ASTNode> functionDefinitions;
    private List<ASTNode> mainInstructions;

    public NodeProgram() {
        this(new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), 0, 0);
    }

    public NodeProgram(int line, int column) {
        this(new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), line, column);
    }

    public NodeProgram(List<ASTNode> globalDeclarations,
                       List<ASTNode> functionDefinitions,
                       List<ASTNode> mainInstructions,
                       int line, int column) {
        super(line, column);
        this.globalDeclarations = globalDeclarations != null ? globalDeclarations : new ArrayList<>();
        this.functionDefinitions = functionDefinitions != null ? functionDefinitions : new ArrayList<>();
        this.mainInstructions = mainInstructions != null ? mainInstructions : new ArrayList<>();
    }

   public void addGlobalDeclaration(ASTNode declaration) {
        if(declaration != null) this.globalDeclarations.add(declaration);
   }

   public void addFunctionDefinition(ASTNode declaration) {
        if(declaration != null) this.functionDefinitions.add(declaration);
   }

   public void addMainInstruction(ASTNode instruction) {
        if(instruction != null) this.mainInstructions.add(instruction);
   }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append(" === Global Declarations ===\n");
        for(ASTNode statement : globalDeclarations) {
            sb.append(statement.toString()).append("\n");
        }

        sb.append(" === Function Definitions ===\n");
        for(ASTNode statement : functionDefinitions) {
            sb.append(statement.toString()).append("\n");
        }

        sb.append(" === Main Instructions ===\n");
        for(ASTNode statement : mainInstructions) {
            sb.append(statement.toString()).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String getTipoNodo() {
        return "Program";
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visitProgram(this);
    }
}
