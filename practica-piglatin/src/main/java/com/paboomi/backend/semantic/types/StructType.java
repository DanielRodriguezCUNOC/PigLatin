package com.paboomi.backend.semantic.types;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Represents the definition of type struct defined for the user
 * Store the struct name and the map its fields
 */

@Getter
@Setter
public class StructType {

    private final String name;
    private final Map<String, String> fields;

    public StructType(String name) {
        this.name = name;
        this.fields = new LinkedHashMap<>();
    }

    public boolean addField(String fieldName, String fieldType) {
        if (fields.containsKey(fieldName)) return false;

        fields.put(fieldName, fieldType);
        return true;
    }

    public String getFieldType(String fieldName) {
        return fields.get(fieldName);
    }

    public boolean hasField(String fieldName) {
        return fields.containsKey(fieldName);
    }

    public int getFieldCount(){
        return fields.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("STRUCTURA ").append(name).append(" { ");
        int i = 0;
        for (Map.Entry<String, String> entry : fields.entrySet()) {
            sb.append(entry.getKey()).append(" : ").append(entry.getValue());
            if (i < fields.size() - 1) sb.append(", ");
            i++;
        }
        sb.append(" }");
        return sb.toString();
    }
}
