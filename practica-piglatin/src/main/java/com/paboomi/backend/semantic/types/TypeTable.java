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
        preloadPrimitives();
    }

    /**
     * Precharge primitives types
     */

    private void preloadPrimitives(){
        types.put("NUMERUS", null);
        types.put("DECIMALIS", null);
        types.put("TEXTUM", null);
        types.put("LITTERA", null);
        types.put("BOOL", null);
    }

    public String resolveType(String typeName){
        if(typeName == null) return null;
        if(typeName.equals("bool")) return "BOOL";
        return typeName;
    }

    public boolean exists(String name){

        if (name == null) return false;
        String resolved = resolveType(name);
        if (resolved.startsWith("SERIES_")){
            String base = resolved.substring(7);
            return exists(base);
        }
        return types.containsKey(resolved);
    }

    public boolean registerStruct(String name, StructType struct){
        if (types.containsKey(name)) return false;
        types.put(name, struct);
        return true;
    }

    public boolean isPrimitive(String typeName) {
        if (typeName == null) return false;
        String resolved = resolveType(typeName);
        if (resolved.startsWith("SERIES_")) return false;
        return exists(resolved) && types.get(resolved) == null;
    }

    /**
     * Verified if is a struct defined for by user.
     */
    public boolean isStruct(String typeName) {
        if (typeName == null) return false;
        String resolved = resolveType(typeName);
        if (resolved.startsWith("SERIES_")) return false;
        return exists(resolved) && types.get(resolved) != null;
    }

    public StructType getStruct(String name) {
        if (name == null) return null;
        String resolved = resolveType(name);
        if (resolved.startsWith("SERIES_")) return null;
        return types.get(resolved);
    }

    public String getFieldType(String structName, String fieldName) {
        if (structName == null || fieldName == null) return null;
        String resolved = resolveType(structName);
        if (resolved.startsWith("SERIES_")) return null;
        StructType struct = types.get(resolved);
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

    public String getArrayElementType(String arrayType) {
        if (arrayType == null || !arrayType.startsWith("SERIES_")) return null;
        return resolveType(arrayType.substring(7));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== Type's Table ===\n");

        for (String typeName : types.keySet()) {
            StructType struct = types.get(typeName);
            if (struct == null) sb.append(" [primitive] ").append(typeName).append("\n");
            else sb.append(" [struct] ").append(struct).append("\n");
        }
        return sb.toString();
    }
}
