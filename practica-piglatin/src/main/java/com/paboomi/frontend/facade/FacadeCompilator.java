package com.paboomi.frontend.facade;

import com.paboomi.backend.dtos.CustomErrorDTO;
import com.paboomi.backend.dtos.ParserResultDTO;
import com.paboomi.backend.model.nodes.principal.NodeProgram;
import com.paboomi.backend.semantic.analysis.SemanticAnalyzer;
import com.paboomi.backend.semantic.symboltable.SymbolTable;
import com.paboomi.backend.semantic.types.TypeTable;
import com.paboomi.backend.services.ServiceAnalyzer;
import com.paboomi.backend.services.TreeMapperService;
import com.paboomi.backend.translate.PigLatinCodeGenerator;
import com.paboomi.frontend.facade.dto.AnalysisResultDTO;
import lombok.Getter;
import lombok.Setter;

import javax.swing.tree.DefaultTreeModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author clare
 * Pattern Facade: This class is responsible for connecting the GUI to the backend
 */
@Getter
@Setter
public class FacadeCompilator {

    private final ServiceAnalyzer serviceAnalyzer;
    private final TreeMapperService  treeMapperService;
    private NodeProgram lastAST;

    public FacadeCompilator(ServiceAnalyzer serviceAnalyzer, TreeMapperService treeMapperService) {
        this.serviceAnalyzer = serviceAnalyzer;
        this.treeMapperService = treeMapperService;
    }

    /**
     *Simplified Metod for GUI. Hides the ANTLR4 Complexity
     */
    public AnalysisResultDTO codeAnalyze(String sourceCode){

        ParserResultDTO parserResult = serviceAnalyzer.executeAnalysis(sourceCode);

        List<CustomErrorDTO> allErrors = new ArrayList<>();
        allErrors.addAll(parserResult.getErrorsList());

        NodeProgram ast = treeMapperService.buildAST(parserResult);

        SymbolTable symbolTable = new SymbolTable();
        TypeTable typeTable = new TypeTable();

        if (ast != null && parserResult.getErrorsList().isEmpty()){
            SemanticAnalyzer semanticAnalyzer = new SemanticAnalyzer();
            List<CustomErrorDTO> semanticErrors = semanticAnalyzer.analyze(ast);
            allErrors.addAll(semanticErrors);

            symbolTable = semanticAnalyzer.getSymbolTable();
            typeTable = semanticAnalyzer.getTypeTable();
        }

        DefaultTreeModel swingModel = treeMapperService.swingFormatConversion(parserResult);

        boolean isValid = allErrors.isEmpty();

        if (isValid) lastAST = ast;

        return new AnalysisResultDTO(
                isValid,
                swingModel,
                allErrors,
                parserResult.getStackStateDTO(),
                symbolTable,
                typeTable
        );

    }

    //* Translate the last AST nalyzede to PigLatin code
    public String generatePigLatinCode(){

        if (lastAST == null) return "No AST available. Please compile first uwu";

        PigLatinCodeGenerator generator = new PigLatinCodeGenerator();
        return generator.generate(lastAST);
    }
    
}
