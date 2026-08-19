package com.paboomi.backend.model.visitor;

import com.paboomi.backend.model.nodes.declaration.NodeArrayDeclaration;
import com.paboomi.backend.model.nodes.declaration.NodeStructDefinition;
import com.paboomi.backend.model.nodes.declaration.NodeVariableDeclaration;
import com.paboomi.backend.model.nodes.expression.*;
import com.paboomi.backend.model.nodes.function.NodeFunction;
import com.paboomi.backend.model.nodes.function.NodeParameter;
import com.paboomi.backend.model.nodes.instruction.*;
import com.paboomi.backend.model.nodes.lvalue.NodeFieldAccess;
import com.paboomi.backend.model.nodes.lvalue.NodeIndexAccess;
import com.paboomi.backend.model.nodes.lvalue.NodeLvalue;
import com.paboomi.backend.model.nodes.principal.NodeProgram;

public interface Visitor<T> {

        T visitProgram(NodeProgram n);
        T visitVariableDeclaration(NodeVariableDeclaration n);
        T visitArrayDeclaration(NodeArrayDeclaration n);
        T visitStructDefinition(NodeStructDefinition n);
        T visitFunction(NodeFunction n);
        T visitParameter(NodeParameter n);
        T visitAssignment(NodeAssignment n);
        T visitRead(NodeRead n);
        T visitPrint(NodePrint n);
        T visitIf(NodeIf n);
        T visitWhile(NodeWhile n);
        T visitDoWhile(NodeDoWhile n);
        T visitFor(NodeFor n);
        T visitContinue(NodeContinue n);
        T visitBreak(NodeBreak n);
        T visitReturn(NodeReturn n);
        T visitBlock(NodeBlock n);
        T visitBooleanExpression(NodeBooleanExpression n);
        T visitNumericExpression(NodeNumericExpression n);
        T visitStringExpression(NodeStringExpression n);
        T visitIntegerLiteral(NodeIntegerLiteral n);
        T visitDecimalLiteral(NodeDecimalLiteral n);
        T visitStringLiteral(NodeStringLiteral n);
        T visitCharLiteral(NodeCharLiteral n);
        T visitBooleanLiteral(NodeBooleanLiteral n);
        T visitIdentifier(NodeIdentifier n);
        T visitAttributeAccess(NodeAttributeAccess n);
        T visitIndexAccess(NodeIndexAccess n);
        T visitFunctionCall(NodeFunctionCall n);
        T visitBinaryOperation(NodeBinaryOperation n);
        T visitUnaryOperation(NodeUnaryOperation n);
        T visitIncrementDecrement(NodeIncrementDecrement n);
        T visitStructLiteral(NodeStructLiteral n);
        T visitArrayCreation(NodeArrayCreation n);
        T visitArrayLiteral(NodeArrayLiteral n);
        T visitLvalue(NodeLvalue n);
        T visitFieldValue(NodeFieldAccess n);


}
