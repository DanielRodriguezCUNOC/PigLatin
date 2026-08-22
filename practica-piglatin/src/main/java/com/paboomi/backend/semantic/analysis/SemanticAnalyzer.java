package com.paboomi.backend.semantic.analysis;

import com.paboomi.backend.dtos.CustomErrorDTO;
import com.paboomi.backend.dtos.ParserResultDTO;
import com.paboomi.backend.model.nodes.principal.NodeProgram;
import com.paboomi.backend.semantic.errors.SemanticErrorReporter;
import com.paboomi.backend.semantic.symboltable.SymbolTable;
import com.paboomi.backend.semantic.types.TypeTable;

import java.util.List;

public class SemanticAnalyzer {

    public List<CustomErrorDTO> analyze(NodeProgram ast) {

        if (ast == null) return List.of();

        TypeTable typeTable = new TypeTable();
        SemanticErrorReporter errorReporter = new SemanticErrorReporter();

        //* First pass. Symbol Table, sequentiality, struct/functions register
        SymbolTableBuilder symbolTableBuilder = new SymbolTableBuilder(typeTable, errorReporter);
        ast.accept(symbolTableBuilder);

        //* Second pass. Types checher
        TypeChecker typeChecker = new TypeChecker(typeTable, errorReporter);
        ast.accept(typeChecker);

        return errorReporter.getErrors();
    }
}
