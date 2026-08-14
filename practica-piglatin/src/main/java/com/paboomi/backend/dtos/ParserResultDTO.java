package com.paboomi.backend.dtos;

import lombok.Getter;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;

@Getter
public class ParserResultDTO {
    private final ParseTree parseTree;
    private final List<CustomErrorDTO> errorsList;

    public ParserResultDTO(ParseTree parseTree, List<CustomErrorDTO> errorsList) {
        this.parseTree = parseTree;
        this.errorsList = errorsList;
    }

}
