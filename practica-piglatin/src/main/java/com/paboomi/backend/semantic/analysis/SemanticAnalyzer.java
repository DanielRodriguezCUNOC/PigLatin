package com.paboomi.backend.semantic.analysis;

import com.paboomi.backend.dtos.CustomErrorDTO;
import com.paboomi.backend.model.nodes.principal.NodeProgram;
import com.paboomi.backend.semantic.errors.SemanticErrorReporter;
import com.paboomi.backend.semantic.symboltable.SymbolTable;
import com.paboomi.backend.semantic.types.TypeTable;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SemanticAnalyzer {

    private SymbolTable symbolTable;
    private TypeTable typeTable;

    public List<CustomErrorDTO> analyze(NodeProgram ast) {

        if (ast == null) return List.of();

        this.typeTable = new TypeTable();
        SemanticErrorReporter errorReporter = new SemanticErrorReporter();

        //* First pass. Symbol Table, sequentiality, struct/functions register
        SymbolTableBuilder symbolTableBuilder = new SymbolTableBuilder(this.typeTable, errorReporter);
        ast.accept(symbolTableBuilder);

        //* Extract the symbol table builded
        this.symbolTable = symbolTableBuilder.getSymbolTable();

        //* Second pass. Types checher
        TypeChecker typeChecker = new TypeChecker(this.typeTable, errorReporter);
        ast.accept(typeChecker);

        return errorReporter.getErrors();
    }
}
