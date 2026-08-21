package com.paboomi.backend.model.nodes.declaration;

import com.paboomi.backend.model.nodes.principal.ASTNode;
import com.paboomi.backend.model.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * This class allows the struct definition production:
 * STRUCTURA ID { structFieldDeclaration (structFieldSeparator structFieldDeclaration)* } FINIS ;
 */
public class NodeStructDefinition extends NodeDeclaration {

    //* The identifier of struct
    private final String structName;
    //* List of fields that belong to this struct
    private final List<ASTNode> fields;

    public NodeStructDefinition() {
        this(null, new ArrayList<>(), 0, 0);
    }

    public NodeStructDefinition(int line, int column){
        this(null, new ArrayList<>(), line,column);
    }

    public NodeStructDefinition(String structName, List<ASTNode> fields, int line, int column) {
        super(line,column);
        this.structName = structName;
        this.fields = fields != null ? fields : new ArrayList<>();
    }

    //* Adds a field to the struct
    public void addField(ASTNode field){
        this.fields.add(field);
    }

    //* Checks if the struct has any fields defined
    public boolean hasFields(){
        return !fields.isEmpty();
    }

    //* Gets the number of fields in this struct
    public int getFieldCount(){
        return fields.size();
    }


    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("structura ").append(structName).append(" { ");

        if(fields != null && !fields.isEmpty()){
            for (int i = 0; i < fields.size(); i++) {
                ASTNode field = fields.get(i);

                //* check if field is a variable declaration
                if(field instanceof NodeVariableDeclaration varDecl){
                    sb.append("esto ").append(varDecl.getIdentifier()).
                            append(" : ").append(varDecl.getType());
                }
                //* Check if the field iss an array declaration
                else if (field instanceof NodeArrayDeclaration arrayDecl) {

                    sb.append("series ").append(arrayDecl.getIdentifier()).
                            append("[").append(arrayDecl.getSize()).
                            append("]").append(" : ").append(arrayDecl.getElementType());
                }else{
                    sb.append(field.toString());
                }

                if (i < fields.size() - 1) {
                    sb.append(", ");
                }
            }
        }
        sb.append("}");
        return sb.toString();
    }

    @Override
    public String getTipoNodo() {
        return "Struct Definition";
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visitStructDefinition(this);
    }
}
