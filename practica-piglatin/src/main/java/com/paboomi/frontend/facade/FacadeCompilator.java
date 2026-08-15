package com.paboomi.frontend.facade;

import com.paboomi.backend.services.ServiceAnalyzer;
import com.paboomi.backend.services.TreeMapperService;
import com.paboomi.frontend.facade.dto.AnalysisResultDTO;

/**
 *
 * @author clare
 * Pattern Facade: This class is responsible for connecting the GUI to the backend
 */
public class FacadeCompilator {

    private final ServiceAnalyzer serviceAnalyzer;
    private final TreeMapperService  treeMapperService;

    public FacadeCompilator(ServiceAnalyzer serviceAnalyzer, TreeMapperService treeMapperService) {
        this.serviceAnalyzer = serviceAnalyzer;
        this.treeMapperService = treeMapperService;
    }

    /**
     *Simplified Metod for GUI. Hides the ANTLR4 Complexity
     */
    public AnalysisResultDTO codeAnalyze(String sourceCode){
        var parserResult = serviceAnalyzer.executeAnalysis(sourceCode);
        var swingModel = treeMapperService.swingFormatConversion(parserResult);
        return new AnalysisResultDTO(
                parserResult.getErrorsList().isEmpty(),
                swingModel,
                parserResult.getErrorsList(),
                parserResult.getStackStateDTO()
        );

    }

    
}
