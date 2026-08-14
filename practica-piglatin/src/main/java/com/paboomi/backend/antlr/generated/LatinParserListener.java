// Generated from LatinParser.g4 by ANTLR 4.13.2
package com.paboomi.backend.antlr.generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LatinParser}.
 */
public interface LatinParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LatinParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(LatinParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(LatinParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#globalDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterGlobalDeclarations(LatinParser.GlobalDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#globalDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitGlobalDeclarations(LatinParser.GlobalDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GlobalDeclarationDeclaration}
	 * labeled alternative in {@link LatinParser#globalDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGlobalDeclarationDeclaration(LatinParser.GlobalDeclarationDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GlobalDeclarationDeclaration}
	 * labeled alternative in {@link LatinParser#globalDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGlobalDeclarationDeclaration(LatinParser.GlobalDeclarationDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GlobalDeclarationArrayDeclaration}
	 * labeled alternative in {@link LatinParser#globalDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGlobalDeclarationArrayDeclaration(LatinParser.GlobalDeclarationArrayDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GlobalDeclarationArrayDeclaration}
	 * labeled alternative in {@link LatinParser#globalDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGlobalDeclarationArrayDeclaration(LatinParser.GlobalDeclarationArrayDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GlobalDeclarationStructDefinition}
	 * labeled alternative in {@link LatinParser#globalDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGlobalDeclarationStructDefinition(LatinParser.GlobalDeclarationStructDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GlobalDeclarationStructDefinition}
	 * labeled alternative in {@link LatinParser#globalDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGlobalDeclarationStructDefinition(LatinParser.GlobalDeclarationStructDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#functionDefinitions}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinitions(LatinParser.FunctionDefinitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#functionDefinitions}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinitions(LatinParser.FunctionDefinitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#mainInstructions}.
	 * @param ctx the parse tree
	 */
	void enterMainInstructions(LatinParser.MainInstructionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#mainInstructions}.
	 * @param ctx the parse tree
	 */
	void exitMainInstructions(LatinParser.MainInstructionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InstructionAssignment}
	 * labeled alternative in {@link LatinParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstructionAssignment(LatinParser.InstructionAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InstructionAssignment}
	 * labeled alternative in {@link LatinParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstructionAssignment(LatinParser.InstructionAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(LatinParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(LatinParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterArrayDeclaration(LatinParser.ArrayDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitArrayDeclaration(LatinParser.ArrayDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#arrayValues}.
	 * @param ctx the parse tree
	 */
	void enterArrayValues(LatinParser.ArrayValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#arrayValues}.
	 * @param ctx the parse tree
	 */
	void exitArrayValues(LatinParser.ArrayValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#structDefinition}.
	 * @param ctx the parse tree
	 */
	void enterStructDefinition(LatinParser.StructDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#structDefinition}.
	 * @param ctx the parse tree
	 */
	void exitStructDefinition(LatinParser.StructDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StructFieldDeclarationVariables}
	 * labeled alternative in {@link LatinParser#structFieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStructFieldDeclarationVariables(LatinParser.StructFieldDeclarationVariablesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StructFieldDeclarationVariables}
	 * labeled alternative in {@link LatinParser#structFieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStructFieldDeclarationVariables(LatinParser.StructFieldDeclarationVariablesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StructFieldDeclarationSeries}
	 * labeled alternative in {@link LatinParser#structFieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStructFieldDeclarationSeries(LatinParser.StructFieldDeclarationSeriesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StructFieldDeclarationSeries}
	 * labeled alternative in {@link LatinParser#structFieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStructFieldDeclarationSeries(LatinParser.StructFieldDeclarationSeriesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#structLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStructLiteral(LatinParser.StructLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#structLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStructLiteral(LatinParser.StructLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#structFieldInitializer}.
	 * @param ctx the parse tree
	 */
	void enterStructFieldInitializer(LatinParser.StructFieldInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#structFieldInitializer}.
	 * @param ctx the parse tree
	 */
	void exitStructFieldInitializer(LatinParser.StructFieldInitializerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StructFieldSeparatorComma}
	 * labeled alternative in {@link LatinParser#structFieldSeparator}.
	 * @param ctx the parse tree
	 */
	void enterStructFieldSeparatorComma(LatinParser.StructFieldSeparatorCommaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StructFieldSeparatorComma}
	 * labeled alternative in {@link LatinParser#structFieldSeparator}.
	 * @param ctx the parse tree
	 */
	void exitStructFieldSeparatorComma(LatinParser.StructFieldSeparatorCommaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StructFieldSeparatorSemicolon}
	 * labeled alternative in {@link LatinParser#structFieldSeparator}.
	 * @param ctx the parse tree
	 */
	void enterStructFieldSeparatorSemicolon(LatinParser.StructFieldSeparatorSemicolonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StructFieldSeparatorSemicolon}
	 * labeled alternative in {@link LatinParser#structFieldSeparator}.
	 * @param ctx the parse tree
	 */
	void exitStructFieldSeparatorSemicolon(LatinParser.StructFieldSeparatorSemicolonContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(LatinParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(LatinParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#elseIfClause}.
	 * @param ctx the parse tree
	 */
	void enterElseIfClause(LatinParser.ElseIfClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#elseIfClause}.
	 * @param ctx the parse tree
	 */
	void exitElseIfClause(LatinParser.ElseIfClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#elseClause}.
	 * @param ctx the parse tree
	 */
	void enterElseClause(LatinParser.ElseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#elseClause}.
	 * @param ctx the parse tree
	 */
	void exitElseClause(LatinParser.ElseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(LatinParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(LatinParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(LatinParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(LatinParser.DoWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForStandard}
	 * labeled alternative in {@link LatinParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStandard(LatinParser.ForStandardContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForStandard}
	 * labeled alternative in {@link LatinParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStandard(LatinParser.ForStandardContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JumpStatementContinue}
	 * labeled alternative in {@link LatinParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpStatementContinue(LatinParser.JumpStatementContinueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JumpStatementContinue}
	 * labeled alternative in {@link LatinParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpStatementContinue(LatinParser.JumpStatementContinueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JumpStatementReturn}
	 * labeled alternative in {@link LatinParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpStatementReturn(LatinParser.JumpStatementReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JumpStatementReturn}
	 * labeled alternative in {@link LatinParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpStatementReturn(LatinParser.JumpStatementReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionDefinitionVoid}
	 * labeled alternative in {@link LatinParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinitionVoid(LatinParser.FunctionDefinitionVoidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionDefinitionVoid}
	 * labeled alternative in {@link LatinParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinitionVoid(LatinParser.FunctionDefinitionVoidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionDefinitionReturn}
	 * labeled alternative in {@link LatinParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinitionReturn(LatinParser.FunctionDefinitionReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionDefinitionReturn}
	 * labeled alternative in {@link LatinParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinitionReturn(LatinParser.FunctionDefinitionReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(LatinParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(LatinParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(LatinParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(LatinParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(LatinParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(LatinParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(LatinParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(LatinParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(LatinParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(LatinParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#varSection}.
	 * @param ctx the parse tree
	 */
	void enterVarSection(LatinParser.VarSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#varSection}.
	 * @param ctx the parse tree
	 */
	void exitVarSection(LatinParser.VarSectionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForInitWithDeclaration}
	 * labeled alternative in {@link LatinParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInitWithDeclaration(LatinParser.ForInitWithDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForInitWithDeclaration}
	 * labeled alternative in {@link LatinParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInitWithDeclaration(LatinParser.ForInitWithDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForInitWithAssign}
	 * labeled alternative in {@link LatinParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInitWithAssign(LatinParser.ForInitWithAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForInitWithAssign}
	 * labeled alternative in {@link LatinParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInitWithAssign(LatinParser.ForInitWithAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForInitWithID}
	 * labeled alternative in {@link LatinParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInitWithID(LatinParser.ForInitWithIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForInitWithID}
	 * labeled alternative in {@link LatinParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInitWithID(LatinParser.ForInitWithIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void enterForCondition(LatinParser.ForConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void exitForCondition(LatinParser.ForConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForUpdateExpression}
	 * labeled alternative in {@link LatinParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdateExpression(LatinParser.ForUpdateExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForUpdateExpression}
	 * labeled alternative in {@link LatinParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdateExpression(LatinParser.ForUpdateExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForUpdateLvalue}
	 * labeled alternative in {@link LatinParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdateLvalue(LatinParser.ForUpdateLvalueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForUpdateLvalue}
	 * labeled alternative in {@link LatinParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdateLvalue(LatinParser.ForUpdateLvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(LatinParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(LatinParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#arrayCreation}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreation(LatinParser.ArrayCreationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#arrayCreation}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreation(LatinParser.ArrayCreationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteral(LatinParser.ArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteral(LatinParser.ArrayLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeNumerus}
	 * labeled alternative in {@link LatinParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeNumerus(LatinParser.TypeNumerusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeNumerus}
	 * labeled alternative in {@link LatinParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeNumerus(LatinParser.TypeNumerusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeTextum}
	 * labeled alternative in {@link LatinParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeTextum(LatinParser.TypeTextumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeTextum}
	 * labeled alternative in {@link LatinParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeTextum(LatinParser.TypeTextumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeDecimalis}
	 * labeled alternative in {@link LatinParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeDecimalis(LatinParser.TypeDecimalisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeDecimalis}
	 * labeled alternative in {@link LatinParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeDecimalis(LatinParser.TypeDecimalisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeLittera}
	 * labeled alternative in {@link LatinParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeLittera(LatinParser.TypeLitteraContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeLittera}
	 * labeled alternative in {@link LatinParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeLittera(LatinParser.TypeLitteraContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeVerum}
	 * labeled alternative in {@link LatinParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeVerum(LatinParser.TypeVerumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeVerum}
	 * labeled alternative in {@link LatinParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeVerum(LatinParser.TypeVerumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeFalsus}
	 * labeled alternative in {@link LatinParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeFalsus(LatinParser.TypeFalsusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeFalsus}
	 * labeled alternative in {@link LatinParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeFalsus(LatinParser.TypeFalsusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeID}
	 * labeled alternative in {@link LatinParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeID(LatinParser.TypeIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeID}
	 * labeled alternative in {@link LatinParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeID(LatinParser.TypeIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#readStatement}.
	 * @param ctx the parse tree
	 */
	void enterReadStatement(LatinParser.ReadStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#readStatement}.
	 * @param ctx the parse tree
	 */
	void exitReadStatement(LatinParser.ReadStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(LatinParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(LatinParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintItemString}
	 * labeled alternative in {@link LatinParser#printItem}.
	 * @param ctx the parse tree
	 */
	void enterPrintItemString(LatinParser.PrintItemStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintItemString}
	 * labeled alternative in {@link LatinParser#printItem}.
	 * @param ctx the parse tree
	 */
	void exitPrintItemString(LatinParser.PrintItemStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintItemID}
	 * labeled alternative in {@link LatinParser#printItem}.
	 * @param ctx the parse tree
	 */
	void enterPrintItemID(LatinParser.PrintItemIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintItemID}
	 * labeled alternative in {@link LatinParser#printItem}.
	 * @param ctx the parse tree
	 */
	void exitPrintItemID(LatinParser.PrintItemIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintItemExpression}
	 * labeled alternative in {@link LatinParser#printItem}.
	 * @param ctx the parse tree
	 */
	void enterPrintItemExpression(LatinParser.PrintItemExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintItemExpression}
	 * labeled alternative in {@link LatinParser#printItem}.
	 * @param ctx the parse tree
	 */
	void exitPrintItemExpression(LatinParser.PrintItemExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void enterLvalue(LatinParser.LvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void exitLvalue(LatinParser.LvalueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FieldAccess}
	 * labeled alternative in {@link LatinParser#lvalueSufix}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess(LatinParser.FieldAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FieldAccess}
	 * labeled alternative in {@link LatinParser#lvalueSufix}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess(LatinParser.FieldAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IndexAccess}
	 * labeled alternative in {@link LatinParser#lvalueSufix}.
	 * @param ctx the parse tree
	 */
	void enterIndexAccess(LatinParser.IndexAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IndexAccess}
	 * labeled alternative in {@link LatinParser#lvalueSufix}.
	 * @param ctx the parse tree
	 */
	void exitIndexAccess(LatinParser.IndexAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(LatinParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(LatinParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionBooleanExpression}
	 * labeled alternative in {@link LatinParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionBooleanExpression(LatinParser.ExpressionBooleanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionBooleanExpression}
	 * labeled alternative in {@link LatinParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionBooleanExpression(LatinParser.ExpressionBooleanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionNumericExpression}
	 * labeled alternative in {@link LatinParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionNumericExpression(LatinParser.ExpressionNumericExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionNumericExpression}
	 * labeled alternative in {@link LatinParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionNumericExpression(LatinParser.ExpressionNumericExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionStringExpression}
	 * labeled alternative in {@link LatinParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStringExpression(LatinParser.ExpressionStringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionStringExpression}
	 * labeled alternative in {@link LatinParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStringExpression(LatinParser.ExpressionStringExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionStructLiteral}
	 * labeled alternative in {@link LatinParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStructLiteral(LatinParser.ExpressionStructLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionStructLiteral}
	 * labeled alternative in {@link LatinParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStructLiteral(LatinParser.ExpressionStructLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionArrayCreation}
	 * labeled alternative in {@link LatinParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionArrayCreation(LatinParser.ExpressionArrayCreationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionArrayCreation}
	 * labeled alternative in {@link LatinParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionArrayCreation(LatinParser.ExpressionArrayCreationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionArrayLiteral}
	 * labeled alternative in {@link LatinParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionArrayLiteral(LatinParser.ExpressionArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionArrayLiteral}
	 * labeled alternative in {@link LatinParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionArrayLiteral(LatinParser.ExpressionArrayLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpression(LatinParser.BooleanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpression(LatinParser.BooleanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#booleanOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanOrExpression(LatinParser.BooleanOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#booleanOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanOrExpression(LatinParser.BooleanOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#booleanAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanAndExpression(LatinParser.BooleanAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#booleanAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanAndExpression(LatinParser.BooleanAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonExpressionNot}
	 * labeled alternative in {@link LatinParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpressionNot(LatinParser.ComparisonExpressionNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonExpressionNot}
	 * labeled alternative in {@link LatinParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpressionNot(LatinParser.ComparisonExpressionNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonExpressionComparisonOperand}
	 * labeled alternative in {@link LatinParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpressionComparisonOperand(LatinParser.ComparisonExpressionComparisonOperandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonExpressionComparisonOperand}
	 * labeled alternative in {@link LatinParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpressionComparisonOperand(LatinParser.ComparisonExpressionComparisonOperandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonExpressionBooleanExpresion}
	 * labeled alternative in {@link LatinParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpressionBooleanExpresion(LatinParser.ComparisonExpressionBooleanExpresionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonExpressionBooleanExpresion}
	 * labeled alternative in {@link LatinParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpressionBooleanExpresion(LatinParser.ComparisonExpressionBooleanExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#comparisonOperand}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperand(LatinParser.ComparisonOperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#comparisonOperand}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperand(LatinParser.ComparisonOperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#numericExpression}.
	 * @param ctx the parse tree
	 */
	void enterNumericExpression(LatinParser.NumericExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#numericExpression}.
	 * @param ctx the parse tree
	 */
	void exitNumericExpression(LatinParser.NumericExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(LatinParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(LatinParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(LatinParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(LatinParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryExpressionAddSub}
	 * labeled alternative in {@link LatinParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionAddSub(LatinParser.UnaryExpressionAddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryExpressionAddSub}
	 * labeled alternative in {@link LatinParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionAddSub(LatinParser.UnaryExpressionAddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryExpressionNumeric}
	 * labeled alternative in {@link LatinParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionNumeric(LatinParser.UnaryExpressionNumericContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryExpressionNumeric}
	 * labeled alternative in {@link LatinParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionNumeric(LatinParser.UnaryExpressionNumericContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSubExpressionPlus}
	 * labeled alternative in {@link LatinParser#addSubExpression}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpressionPlus(LatinParser.AddSubExpressionPlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSubExpressionPlus}
	 * labeled alternative in {@link LatinParser#addSubExpression}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpressionPlus(LatinParser.AddSubExpressionPlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSubExpressionMinus}
	 * labeled alternative in {@link LatinParser#addSubExpression}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpressionMinus(LatinParser.AddSubExpressionMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSubExpressionMinus}
	 * labeled alternative in {@link LatinParser#addSubExpression}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpressionMinus(LatinParser.AddSubExpressionMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSubExpressionAdd}
	 * labeled alternative in {@link LatinParser#addSubExpression}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpressionAdd(LatinParser.AddSubExpressionAddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSubExpressionAdd}
	 * labeled alternative in {@link LatinParser#addSubExpression}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpressionAdd(LatinParser.AddSubExpressionAddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSubExpressionSub}
	 * labeled alternative in {@link LatinParser#addSubExpression}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpressionSub(LatinParser.AddSubExpressionSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSubExpressionSub}
	 * labeled alternative in {@link LatinParser#addSubExpression}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpressionSub(LatinParser.AddSubExpressionSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IncrementDecrementLiteralAdd}
	 * labeled alternative in {@link LatinParser#incrementDecrementLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIncrementDecrementLiteralAdd(LatinParser.IncrementDecrementLiteralAddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IncrementDecrementLiteralAdd}
	 * labeled alternative in {@link LatinParser#incrementDecrementLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIncrementDecrementLiteralAdd(LatinParser.IncrementDecrementLiteralAddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IncrementDecrementLiteralSub}
	 * labeled alternative in {@link LatinParser#incrementDecrementLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIncrementDecrementLiteralSub(LatinParser.IncrementDecrementLiteralSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IncrementDecrementLiteralSub}
	 * labeled alternative in {@link LatinParser#incrementDecrementLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIncrementDecrementLiteralSub(LatinParser.IncrementDecrementLiteralSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultSplitExpressionMult}
	 * labeled alternative in {@link LatinParser#multSplitExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultSplitExpressionMult(LatinParser.MultSplitExpressionMultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultSplitExpressionMult}
	 * labeled alternative in {@link LatinParser#multSplitExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultSplitExpressionMult(LatinParser.MultSplitExpressionMultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultSplitExpressionSplit}
	 * labeled alternative in {@link LatinParser#multSplitExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultSplitExpressionSplit(LatinParser.MultSplitExpressionSplitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultSplitExpressionSplit}
	 * labeled alternative in {@link LatinParser#multSplitExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultSplitExpressionSplit(LatinParser.MultSplitExpressionSplitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PlusMinusExpressionPlus}
	 * labeled alternative in {@link LatinParser#plusMinusExpression}.
	 * @param ctx the parse tree
	 */
	void enterPlusMinusExpressionPlus(LatinParser.PlusMinusExpressionPlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PlusMinusExpressionPlus}
	 * labeled alternative in {@link LatinParser#plusMinusExpression}.
	 * @param ctx the parse tree
	 */
	void exitPlusMinusExpressionPlus(LatinParser.PlusMinusExpressionPlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PlusMinusExpressionMinus}
	 * labeled alternative in {@link LatinParser#plusMinusExpression}.
	 * @param ctx the parse tree
	 */
	void enterPlusMinusExpressionMinus(LatinParser.PlusMinusExpressionMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PlusMinusExpressionMinus}
	 * labeled alternative in {@link LatinParser#plusMinusExpression}.
	 * @param ctx the parse tree
	 */
	void exitPlusMinusExpressionMinus(LatinParser.PlusMinusExpressionMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#stringExpression}.
	 * @param ctx the parse tree
	 */
	void enterStringExpression(LatinParser.StringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#stringExpression}.
	 * @param ctx the parse tree
	 */
	void exitStringExpression(LatinParser.StringExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatinParser#stringAdditiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterStringAdditiveExpression(LatinParser.StringAdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatinParser#stringAdditiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitStringAdditiveExpression(LatinParser.StringAdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringAdditiveItemStringPrimary}
	 * labeled alternative in {@link LatinParser#stringAdditiveItem}.
	 * @param ctx the parse tree
	 */
	void enterStringAdditiveItemStringPrimary(LatinParser.StringAdditiveItemStringPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringAdditiveItemStringPrimary}
	 * labeled alternative in {@link LatinParser#stringAdditiveItem}.
	 * @param ctx the parse tree
	 */
	void exitStringAdditiveItemStringPrimary(LatinParser.StringAdditiveItemStringPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringAdditiveItemNumericExpression}
	 * labeled alternative in {@link LatinParser#stringAdditiveItem}.
	 * @param ctx the parse tree
	 */
	void enterStringAdditiveItemNumericExpression(LatinParser.StringAdditiveItemNumericExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringAdditiveItemNumericExpression}
	 * labeled alternative in {@link LatinParser#stringAdditiveItem}.
	 * @param ctx the parse tree
	 */
	void exitStringAdditiveItemNumericExpression(LatinParser.StringAdditiveItemNumericExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringPrimaryString}
	 * labeled alternative in {@link LatinParser#stringPrimary}.
	 * @param ctx the parse tree
	 */
	void enterStringPrimaryString(LatinParser.StringPrimaryStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringPrimaryString}
	 * labeled alternative in {@link LatinParser#stringPrimary}.
	 * @param ctx the parse tree
	 */
	void exitStringPrimaryString(LatinParser.StringPrimaryStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringPrimaryChar}
	 * labeled alternative in {@link LatinParser#stringPrimary}.
	 * @param ctx the parse tree
	 */
	void enterStringPrimaryChar(LatinParser.StringPrimaryCharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringPrimaryChar}
	 * labeled alternative in {@link LatinParser#stringPrimary}.
	 * @param ctx the parse tree
	 */
	void exitStringPrimaryChar(LatinParser.StringPrimaryCharContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringPrimaryAtributeAccessExpression}
	 * labeled alternative in {@link LatinParser#stringPrimary}.
	 * @param ctx the parse tree
	 */
	void enterStringPrimaryAtributeAccessExpression(LatinParser.StringPrimaryAtributeAccessExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringPrimaryAtributeAccessExpression}
	 * labeled alternative in {@link LatinParser#stringPrimary}.
	 * @param ctx the parse tree
	 */
	void exitStringPrimaryAtributeAccessExpression(LatinParser.StringPrimaryAtributeAccessExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryNumericNumericLiteral}
	 * labeled alternative in {@link LatinParser#primaryNumeric}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNumericNumericLiteral(LatinParser.PrimaryNumericNumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryNumericNumericLiteral}
	 * labeled alternative in {@link LatinParser#primaryNumeric}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNumericNumericLiteral(LatinParser.PrimaryNumericNumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryNumericAtributeAccessExpression}
	 * labeled alternative in {@link LatinParser#primaryNumeric}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNumericAtributeAccessExpression(LatinParser.PrimaryNumericAtributeAccessExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryNumericAtributeAccessExpression}
	 * labeled alternative in {@link LatinParser#primaryNumeric}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNumericAtributeAccessExpression(LatinParser.PrimaryNumericAtributeAccessExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryNumericNumericExpression}
	 * labeled alternative in {@link LatinParser#primaryNumeric}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNumericNumericExpression(LatinParser.PrimaryNumericNumericExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryNumericNumericExpression}
	 * labeled alternative in {@link LatinParser#primaryNumeric}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNumericNumericExpression(LatinParser.PrimaryNumericNumericExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumericLiteralInteger}
	 * labeled alternative in {@link LatinParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteralInteger(LatinParser.NumericLiteralIntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumericLiteralInteger}
	 * labeled alternative in {@link LatinParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteralInteger(LatinParser.NumericLiteralIntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumericLiteralDecimal}
	 * labeled alternative in {@link LatinParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteralDecimal(LatinParser.NumericLiteralDecimalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumericLiteralDecimal}
	 * labeled alternative in {@link LatinParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteralDecimal(LatinParser.NumericLiteralDecimalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanLiteralVerum}
	 * labeled alternative in {@link LatinParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteralVerum(LatinParser.BooleanLiteralVerumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanLiteralVerum}
	 * labeled alternative in {@link LatinParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteralVerum(LatinParser.BooleanLiteralVerumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanLiteralFalsus}
	 * labeled alternative in {@link LatinParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteralFalsus(LatinParser.BooleanLiteralFalsusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanLiteralFalsus}
	 * labeled alternative in {@link LatinParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteralFalsus(LatinParser.BooleanLiteralFalsusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RelationalLiteralIdentic}
	 * labeled alternative in {@link LatinParser#relationalLiteral}.
	 * @param ctx the parse tree
	 */
	void enterRelationalLiteralIdentic(LatinParser.RelationalLiteralIdenticContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RelationalLiteralIdentic}
	 * labeled alternative in {@link LatinParser#relationalLiteral}.
	 * @param ctx the parse tree
	 */
	void exitRelationalLiteralIdentic(LatinParser.RelationalLiteralIdenticContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RelationalLiteralDiff}
	 * labeled alternative in {@link LatinParser#relationalLiteral}.
	 * @param ctx the parse tree
	 */
	void enterRelationalLiteralDiff(LatinParser.RelationalLiteralDiffContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RelationalLiteralDiff}
	 * labeled alternative in {@link LatinParser#relationalLiteral}.
	 * @param ctx the parse tree
	 */
	void exitRelationalLiteralDiff(LatinParser.RelationalLiteralDiffContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RelationalLiteralMinor}
	 * labeled alternative in {@link LatinParser#relationalLiteral}.
	 * @param ctx the parse tree
	 */
	void enterRelationalLiteralMinor(LatinParser.RelationalLiteralMinorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RelationalLiteralMinor}
	 * labeled alternative in {@link LatinParser#relationalLiteral}.
	 * @param ctx the parse tree
	 */
	void exitRelationalLiteralMinor(LatinParser.RelationalLiteralMinorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RelationalLiteralMajor}
	 * labeled alternative in {@link LatinParser#relationalLiteral}.
	 * @param ctx the parse tree
	 */
	void enterRelationalLiteralMajor(LatinParser.RelationalLiteralMajorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RelationalLiteralMajor}
	 * labeled alternative in {@link LatinParser#relationalLiteral}.
	 * @param ctx the parse tree
	 */
	void exitRelationalLiteralMajor(LatinParser.RelationalLiteralMajorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RelationalLiteralMinorTo}
	 * labeled alternative in {@link LatinParser#relationalLiteral}.
	 * @param ctx the parse tree
	 */
	void enterRelationalLiteralMinorTo(LatinParser.RelationalLiteralMinorToContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RelationalLiteralMinorTo}
	 * labeled alternative in {@link LatinParser#relationalLiteral}.
	 * @param ctx the parse tree
	 */
	void exitRelationalLiteralMinorTo(LatinParser.RelationalLiteralMinorToContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RelationalLiteralMajorTo}
	 * labeled alternative in {@link LatinParser#relationalLiteral}.
	 * @param ctx the parse tree
	 */
	void enterRelationalLiteralMajorTo(LatinParser.RelationalLiteralMajorToContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RelationalLiteralMajorTo}
	 * labeled alternative in {@link LatinParser#relationalLiteral}.
	 * @param ctx the parse tree
	 */
	void exitRelationalLiteralMajorTo(LatinParser.RelationalLiteralMajorToContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtributeAccessExpressionDitID}
	 * labeled alternative in {@link LatinParser#atributeAccessExpresion}.
	 * @param ctx the parse tree
	 */
	void enterAtributeAccessExpressionDitID(LatinParser.AtributeAccessExpressionDitIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtributeAccessExpressionDitID}
	 * labeled alternative in {@link LatinParser#atributeAccessExpresion}.
	 * @param ctx the parse tree
	 */
	void exitAtributeAccessExpressionDitID(LatinParser.AtributeAccessExpressionDitIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtributeAccessExpressionClaspExpression}
	 * labeled alternative in {@link LatinParser#atributeAccessExpresion}.
	 * @param ctx the parse tree
	 */
	void enterAtributeAccessExpressionClaspExpression(LatinParser.AtributeAccessExpressionClaspExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtributeAccessExpressionClaspExpression}
	 * labeled alternative in {@link LatinParser#atributeAccessExpresion}.
	 * @param ctx the parse tree
	 */
	void exitAtributeAccessExpressionClaspExpression(LatinParser.AtributeAccessExpressionClaspExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtributeAccessExpressionParenExpression}
	 * labeled alternative in {@link LatinParser#atributeAccessExpresion}.
	 * @param ctx the parse tree
	 */
	void enterAtributeAccessExpressionParenExpression(LatinParser.AtributeAccessExpressionParenExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtributeAccessExpressionParenExpression}
	 * labeled alternative in {@link LatinParser#atributeAccessExpresion}.
	 * @param ctx the parse tree
	 */
	void exitAtributeAccessExpressionParenExpression(LatinParser.AtributeAccessExpressionParenExpressionContext ctx);
}