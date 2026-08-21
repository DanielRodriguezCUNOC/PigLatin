package com.paboomi.backend.model.nodes.expression;

import com.paboomi.backend.model.nodes.principal.ASTNode;
import com.paboomi.backend.model.visitor.Visitor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Represents an attribute access expression
 */

@Getter
@Setter
public class NodeAttributeAccess extends ASTNode {

    //* The base expression that the attribute is accessed
    private ASTNode base;

    //* The type of attribute access
    private String accessType;

    //* For field, index, function access.
    private Object attribute;

    public NodeAttributeAccess() {
        this(null, null, null, 0, 0);
    }

    public NodeAttributeAccess(int line, int column) {
        this(null, null, null, line, column);
    }

    //* Constructor for field access
    public NodeAttributeAccess(ASTNode base, String fieldName, int line, int column) {
        super(line, column);
        this.base = base;
        this.accessType = "FIELD";
        this.attribute = fieldName;
    }

    //* Constructor for index access
    public NodeAttributeAccess(ASTNode base, ASTNode indexExpression, int line, int column) {
        super(line, column);
        this.base = base;
        this.accessType = "INDEX";
        this.attribute = indexExpression;
    }

    //* Constructor for function call
    public NodeAttributeAccess (String functionName, List<ASTNode> arguments, int line, int column) {
        super(line, column);
        this.accessType = "CALL";
        this.attribute = new FunctionCallInfo(functionName, arguments);
    }

    public NodeAttributeAccess(ASTNode base, String accessType, Object attribute, int line, int column) {
        super(line, column);
        this.base = base;
        this.accessType = accessType;
        this.attribute = attribute;
    }

    /**
     * Helper method to check if this is a field access.
     *
     * @return true if field access, false otherwise
     */
    public boolean isFieldAccess() {
        return "FIELD".equals(accessType);
    }

    /**
     * Helper method to check if this is an index access.
     *
     * @return true if index access, false otherwise
     */
    public boolean isIndexAccess() {
        return "INDEX".equals(accessType);
    }

    /**
     * Helper method to check if this is a function call.
     *
     * @return true if function call, false otherwise
     */
    public boolean isCall() {
        return "CALL".equals(accessType);
    }

    /**
     * Gets the field name if this is a field access.
     *
     * @return The field name, or null if not a field access
     */
    public String getFieldName() {
        return isFieldAccess() ? (String) attribute : null;
    }

    /**
     * Gets the index expression if this is an index access.
     *
     * @return The index expression, or null if not an index access
     */
    public ASTNode getIndexExpression() {
        return isIndexAccess() ? (ASTNode) attribute : null;
    }

    /**
     * Gets the function call info if this is a function call.
     *
     * @return The function call info, or null if not a function call
     */
    public FunctionCallInfo getFunctionCallInfo() {
        return isCall() ? (FunctionCallInfo) attribute : null;
    }

    @Override
    public String toString() {

        if (isFieldAccess()) {
            return base.toString() + "." + getFieldName();
        }else if (isIndexAccess()) {
            return base.toString() + "[" + getIndexExpression().toString() + "]";
        } else if (isCall()) {
            FunctionCallInfo info = getFunctionCallInfo();
            return info.toString();
        }
        return "";
    }

    @Override
    public String getTipoNodo() {
        return "Attribute Access";
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visitAttributeAccess(this);
    }
}
