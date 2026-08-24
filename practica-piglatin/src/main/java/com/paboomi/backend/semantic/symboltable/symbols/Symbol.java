package com.paboomi.backend.semantic.symboltable.symbols;


import lombok.Getter;
import lombok.Setter;

/**
 * Base class for all symbols registered in the symbol table
 */
@Getter
@Setter
public abstract class Symbol {

    protected String name;
    protected String type;
    protected int line;
    protected int column;
    protected Object constantValue;

    public Symbol(String name, String type, int line, int column) {
        this.name = name;
        this.type = type;
        this.line = line;
        this.column = column;
    }

    //* For error messages
    public abstract String getCategory();

    @Override
    public String toString() {
        return getCategory() + " '" +
                name + "' : " + type +
                " (line" + line + ", column " +  column + ")";
    }
}
