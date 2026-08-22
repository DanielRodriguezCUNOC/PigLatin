package com.paboomi.backend.semantic.types;


import lombok.Getter;
import lombok.Setter;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Global type's table
 */


@Getter
@Setter
public class TypeTable {

    private final Map<String, StructType> types;

    public TypeTable() {
        this.types = new HashMap<>();
    }

    /**
     * Precharge primitives types
     */

    private void preloadPrimitives(){
        types.put("NUMERUS", null);
        types.put("DECIMALIS", null);
        types.put("TEXTUM", null);
        types.put("LITTERA", null);
        types.put("BOOLEAN", null);
    }

    public boolean registerStruct(String name, StructType struct){
        if (types.containsKey(name)) return false;
        types.put(name, struct);
        return true;
    }

    public boolean exists(String name){
        return types.containsKey(name);
    }


    public boolean isPrimitive(String typeName) {
        return exists(typeName) && types.get(typeName) == null;
    }

    /**
     * Verified if is an struct defined for by user.
     */
    public boolean isStruct(String typeName) {
        return exists(typeName) && types.get(typeName) != null;
    }

    public StructType getStruct(String name) {
        return types.get(name);
    }

    public String getFieldType(String structName, String fieldName) {
        StructType struct = types.get(structName);
        if (struct == null) return null;
        return struct.getFieldType(fieldName);
    }

    public Set<String> getAllTypeNames() {
        return Collections.unmodifiableSet(types.keySet());
    }

    public Map<String, StructType> getAllStructs() {
        Map<String, StructType> structs = new HashMap<>();
        for (Map.Entry<String, StructType> entry : types.entrySet()) {
            if (entry.getValue() != null) {
                structs.put(entry.getKey(), entry.getValue());
            }
        }
        return Collections.unmodifiableMap(structs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== Type's Table ===\n");

        for (String typeName : types.keySet()) {
            StructType struct = types.get(typeName);
            if (struct == null) sb.append(" [primitive] ").append(typeName).append("\n");
            else sb.append(" [struct] ").append(struct.toString()).append("\n");
        }
        return sb.toString();
    }
}
