package com.paboomi.backend.listeners;

import com.paboomi.backend.dtos.CustomErrorDTO;
import lombok.Getter;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import java.util.ArrayList;
import java.util.List;

@Getter
public class CustomErrorListener extends BaseErrorListener {
    private final List<CustomErrorDTO> errorsList = new ArrayList<>();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                            int line, int charPositionInLine, String msg,
                            RecognitionException e) {

        errorsList.add(new CustomErrorDTO(line, charPositionInLine, msg));
    }

    public boolean hasErrors() {
        return !errorsList.isEmpty();
    }

    public void clear(){
        errorsList.clear();
    }
}
