package com.paboomi.frontend.facade.dto;

import com.paboomi.backend.dtos.CustomErrorDTO;
import com.paboomi.backend.dtos.ParserStackStateDTO;
import com.paboomi.backend.semantic.symboltable.SymbolTable;
import com.paboomi.backend.semantic.types.TypeTable;
import lombok.Getter;
import lombok.Setter;

import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author clare
 * Transfer code, errors, and the tree model to the GUI
 */
@Getter
@Setter
public class AnalysisResultDTO {

    private final boolean isValid;
    private final TreeModel treeModel;
    private final List<CustomErrorDTO> errorsList;
    private final List<ParserStackStateDTO> stackStateList;
    private final SymbolTable symbolTable;
    private final TypeTable typeTable;

    public AnalysisResultDTO(boolean isValid,
                             DefaultTreeModel treeModel,
                             List<CustomErrorDTO> errorsList,
                             List<ParserStackStateDTO> parserStackStateList,
                             SymbolTable symbolTable, TypeTable typeTable) {
        this.isValid = isValid;
        this.treeModel = treeModel;
        this.errorsList = errorsList !=  null ? errorsList : Collections.emptyList();
        this.stackStateList = parserStackStateList != null ? parserStackStateList : Collections.emptyList();
        this.symbolTable = symbolTable;
        this.typeTable = typeTable;
    }

}
