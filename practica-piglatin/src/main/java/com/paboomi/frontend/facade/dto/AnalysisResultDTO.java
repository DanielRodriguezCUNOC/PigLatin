package com.paboomi.frontend.facade.dto;

import com.paboomi.backend.dtos.CustomErrorDTO;
import lombok.Getter;

import javax.swing.tree.DefaultTreeModel;
import java.util.List;

/**
 *
 * @author clare
 * Transfer code, errors, and the tree model to the GUI
 */
@Getter
public class AnalysisResultDTO {


    private final boolean isValid;
    private final DefaultTreeModel treeModel;
    private final List<CustomErrorDTO> errorsList;
    public AnalysisResultDTO(boolean isValid, DefaultTreeModel treeModel, List<CustomErrorDTO> errorsList) {
        this.isValid = isValid;
        this.treeModel = treeModel;
        this.errorsList = errorsList;
    }

}
