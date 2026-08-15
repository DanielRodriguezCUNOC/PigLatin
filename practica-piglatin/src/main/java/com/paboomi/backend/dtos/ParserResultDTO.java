package com.paboomi.backend.dtos;

import lombok.Getter;
import lombok.Setter;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.Collections;
import java.util.List;

@Getter
@Setter
public class ParserResultDTO {
    private final ParseTree parseTree;
    private final List<CustomErrorDTO> errorsList;
    private final List<ParserStackStateDTO> stackStateDTO;
    public ParserResultDTO(ParseTree parseTree,
                           List<CustomErrorDTO> errorsList,
                           List<ParserStackStateDTO> stackStateDTOs) {
        this.parseTree = parseTree;
        this.errorsList = errorsList != null ? errorsList : Collections.emptyList();
        this.stackStateDTO = stackStateDTOs != null ? stackStateDTOs : Collections.emptyList();
    }

}
