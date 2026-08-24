// Generated from LatinParser.g4 by ANTLR 4.13.2
package com.paboomi.backend.antlr.generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LatinParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LatinParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LatinParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(LatinParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#globalDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalDeclarations(LatinParser.GlobalDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GlobalDeclarationDeclaration}
	 * labeled alternative in {@link LatinParser#globalDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalDeclarationDeclaration(LatinParser.GlobalDeclarationDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GlobalDeclarationArrayDeclaration}
	 * labeled alternative in {@link LatinParser#globalDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalDeclarationArrayDeclaration(LatinParser.GlobalDeclarationArrayDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GlobalDeclarationStructDefinition}
	 * labeled alternative in {@link LatinParser#globalDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalDeclarationStructDefinition(LatinParser.GlobalDeclarationStructDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#functionDefinitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinitions(LatinParser.FunctionDefinitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#mainInstructions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainInstructions(LatinParser.MainInstructionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InstructionAssignment}
	 * labeled alternative in {@link LatinParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstructionAssignment(LatinParser.InstructionAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(LatinParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDeclaration(LatinParser.ArrayDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#arrayValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayValues(LatinParser.ArrayValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#structDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDefinition(LatinParser.StructDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StructFieldDeclarationVariables}
	 * labeled alternative in {@link LatinParser#structFieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructFieldDeclarationVariables(LatinParser.StructFieldDeclarationVariablesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StructFieldDeclarationSeries}
	 * labeled alternative in {@link LatinParser#structFieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructFieldDeclarationSeries(LatinParser.StructFieldDeclarationSeriesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#structLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructLiteral(LatinParser.StructLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#structFieldInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructFieldInitializer(LatinParser.StructFieldInitializerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StructFieldSeparatorComma}
	 * labeled alternative in {@link LatinParser#structFieldSeparator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructFieldSeparatorComma(LatinParser.StructFieldSeparatorCommaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StructFieldSeparatorSemicolon}
	 * labeled alternative in {@link LatinParser#structFieldSeparator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructFieldSeparatorSemicolon(LatinParser.StructFieldSeparatorSemicolonContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(LatinParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#elseIfClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfClause(LatinParser.ElseIfClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#elseClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseClause(LatinParser.ElseClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(LatinParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#doWhileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStatement(LatinParser.DoWhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForStandard}
	 * labeled alternative in {@link LatinParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStandard(LatinParser.ForStandardContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JumpStatementContinue}
	 * labeled alternative in {@link LatinParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpStatementContinue(LatinParser.JumpStatementContinueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JumpStatementReturn}
	 * labeled alternative in {@link LatinParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpStatementReturn(LatinParser.JumpStatementReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionDefinitionVoid}
	 * labeled alternative in {@link LatinParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinitionVoid(LatinParser.FunctionDefinitionVoidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionDefinitionReturn}
	 * labeled alternative in {@link LatinParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinitionReturn(LatinParser.FunctionDefinitionReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(LatinParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(LatinParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(LatinParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(LatinParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(LatinParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#varSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarSection(LatinParser.VarSectionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForInitWithDeclaration}
	 * labeled alternative in {@link LatinParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInitWithDeclaration(LatinParser.ForInitWithDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForInitWithAssign}
	 * labeled alternative in {@link LatinParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInitWithAssign(LatinParser.ForInitWithAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForInitWithID}
	 * labeled alternative in {@link LatinParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInitWithID(LatinParser.ForInitWithIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#forCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForCondition(LatinParser.ForConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForUpdateExpression}
	 * labeled alternative in {@link LatinParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdateExpression(LatinParser.ForUpdateExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForUpdateLvalue}
	 * labeled alternative in {@link LatinParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdateLvalue(LatinParser.ForUpdateLvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(LatinParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#arrayCreation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreation(LatinParser.ArrayCreationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#arrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteral(LatinParser.ArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeNumerus}
	 * labeled alternative in {@link LatinParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeNumerus(LatinParser.TypeNumerusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeTextum}
	 * labeled alternative in {@link LatinParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeTextum(LatinParser.TypeTextumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeDecimalis}
	 * labeled alternative in {@link LatinParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDecimalis(LatinParser.TypeDecimalisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeLittera}
	 * labeled alternative in {@link LatinParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeLittera(LatinParser.TypeLitteraContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeBool}
	 * labeled alternative in {@link LatinParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBool(LatinParser.TypeBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeID}
	 * labeled alternative in {@link LatinParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeID(LatinParser.TypeIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#readStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadStatement(LatinParser.ReadStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(LatinParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintItemString}
	 * labeled alternative in {@link LatinParser#printItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintItemString(LatinParser.PrintItemStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintItemID}
	 * labeled alternative in {@link LatinParser#printItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintItemID(LatinParser.PrintItemIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintItemExpression}
	 * labeled alternative in {@link LatinParser#printItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintItemExpression(LatinParser.PrintItemExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLvalue(LatinParser.LvalueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FieldAccess}
	 * labeled alternative in {@link LatinParser#lvalueSufix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess(LatinParser.FieldAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IndexAccess}
	 * labeled alternative in {@link LatinParser#lvalueSufix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexAccess(LatinParser.IndexAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(LatinParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionBooleanExpression}
	 * labeled alternative in {@link LatinParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionBooleanExpression(LatinParser.ExpressionBooleanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionNumericExpression}
	 * labeled alternative in {@link LatinParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionNumericExpression(LatinParser.ExpressionNumericExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionStringExpression}
	 * labeled alternative in {@link LatinParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStringExpression(LatinParser.ExpressionStringExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionStructLiteral}
	 * labeled alternative in {@link LatinParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStructLiteral(LatinParser.ExpressionStructLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionArrayCreation}
	 * labeled alternative in {@link LatinParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionArrayCreation(LatinParser.ExpressionArrayCreationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionArrayLiteral}
	 * labeled alternative in {@link LatinParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionArrayLiteral(LatinParser.ExpressionArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpression(LatinParser.BooleanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#booleanOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanOrExpression(LatinParser.BooleanOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#booleanAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanAndExpression(LatinParser.BooleanAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonExpressionNot}
	 * labeled alternative in {@link LatinParser#comparisonExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpressionNot(LatinParser.ComparisonExpressionNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonExpressionComparisonOperand}
	 * labeled alternative in {@link LatinParser#comparisonExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpressionComparisonOperand(LatinParser.ComparisonExpressionComparisonOperandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonExpressionBooleanExpresion}
	 * labeled alternative in {@link LatinParser#comparisonExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpressionBooleanExpresion(LatinParser.ComparisonExpressionBooleanExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#comparisonOperand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperand(LatinParser.ComparisonOperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#numericExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericExpression(LatinParser.NumericExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(LatinParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(LatinParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryExpressionAddSub}
	 * labeled alternative in {@link LatinParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpressionAddSub(LatinParser.UnaryExpressionAddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryExpressionNumeric}
	 * labeled alternative in {@link LatinParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpressionNumeric(LatinParser.UnaryExpressionNumericContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSubExpressionPlus}
	 * labeled alternative in {@link LatinParser#addSubExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubExpressionPlus(LatinParser.AddSubExpressionPlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSubExpressionMinus}
	 * labeled alternative in {@link LatinParser#addSubExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubExpressionMinus(LatinParser.AddSubExpressionMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSubExpressionAdd}
	 * labeled alternative in {@link LatinParser#addSubExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubExpressionAdd(LatinParser.AddSubExpressionAddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSubExpressionSub}
	 * labeled alternative in {@link LatinParser#addSubExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubExpressionSub(LatinParser.AddSubExpressionSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IncrementDecrementLiteralAdd}
	 * labeled alternative in {@link LatinParser#incrementDecrementLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrementDecrementLiteralAdd(LatinParser.IncrementDecrementLiteralAddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IncrementDecrementLiteralSub}
	 * labeled alternative in {@link LatinParser#incrementDecrementLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrementDecrementLiteralSub(LatinParser.IncrementDecrementLiteralSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultSplitExpressionMult}
	 * labeled alternative in {@link LatinParser#multSplitExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultSplitExpressionMult(LatinParser.MultSplitExpressionMultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultSplitExpressionSplit}
	 * labeled alternative in {@link LatinParser#multSplitExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultSplitExpressionSplit(LatinParser.MultSplitExpressionSplitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PlusMinusExpressionPlus}
	 * labeled alternative in {@link LatinParser#plusMinusExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusMinusExpressionPlus(LatinParser.PlusMinusExpressionPlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PlusMinusExpressionMinus}
	 * labeled alternative in {@link LatinParser#plusMinusExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusMinusExpressionMinus(LatinParser.PlusMinusExpressionMinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#stringExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpression(LatinParser.StringExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatinParser#stringAdditiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAdditiveExpression(LatinParser.StringAdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringAdditiveItemStringPrimary}
	 * labeled alternative in {@link LatinParser#stringAdditiveItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAdditiveItemStringPrimary(LatinParser.StringAdditiveItemStringPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringAdditiveItemNumericExpression}
	 * labeled alternative in {@link LatinParser#stringAdditiveItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAdditiveItemNumericExpression(LatinParser.StringAdditiveItemNumericExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringPrimaryString}
	 * labeled alternative in {@link LatinParser#stringPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringPrimaryString(LatinParser.StringPrimaryStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringPrimaryChar}
	 * labeled alternative in {@link LatinParser#stringPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringPrimaryChar(LatinParser.StringPrimaryCharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringPrimaryAtributeAccessExpression}
	 * labeled alternative in {@link LatinParser#stringPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringPrimaryAtributeAccessExpression(LatinParser.StringPrimaryAtributeAccessExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryNumericNumericLiteral}
	 * labeled alternative in {@link LatinParser#primaryNumeric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNumericNumericLiteral(LatinParser.PrimaryNumericNumericLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryNumericAtributeAccessExpression}
	 * labeled alternative in {@link LatinParser#primaryNumeric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNumericAtributeAccessExpression(LatinParser.PrimaryNumericAtributeAccessExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryNumericNumericExpression}
	 * labeled alternative in {@link LatinParser#primaryNumeric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNumericNumericExpression(LatinParser.PrimaryNumericNumericExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumericLiteralInteger}
	 * labeled alternative in {@link LatinParser#numericLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericLiteralInteger(LatinParser.NumericLiteralIntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumericLiteralDecimal}
	 * labeled alternative in {@link LatinParser#numericLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericLiteralDecimal(LatinParser.NumericLiteralDecimalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumericLiteralChar}
	 * labeled alternative in {@link LatinParser#numericLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericLiteralChar(LatinParser.NumericLiteralCharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanLiteralVerum}
	 * labeled alternative in {@link LatinParser#booleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteralVerum(LatinParser.BooleanLiteralVerumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanLiteralFalsus}
	 * labeled alternative in {@link LatinParser#booleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteralFalsus(LatinParser.BooleanLiteralFalsusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RelationalLiteralIdentic}
	 * labeled alternative in {@link LatinParser#relationalLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalLiteralIdentic(LatinParser.RelationalLiteralIdenticContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RelationalLiteralDiff}
	 * labeled alternative in {@link LatinParser#relationalLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalLiteralDiff(LatinParser.RelationalLiteralDiffContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RelationalLiteralMinor}
	 * labeled alternative in {@link LatinParser#relationalLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalLiteralMinor(LatinParser.RelationalLiteralMinorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RelationalLiteralMajor}
	 * labeled alternative in {@link LatinParser#relationalLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalLiteralMajor(LatinParser.RelationalLiteralMajorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RelationalLiteralMinorTo}
	 * labeled alternative in {@link LatinParser#relationalLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalLiteralMinorTo(LatinParser.RelationalLiteralMinorToContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RelationalLiteralMajorTo}
	 * labeled alternative in {@link LatinParser#relationalLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalLiteralMajorTo(LatinParser.RelationalLiteralMajorToContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtributeAccessExpressionDitID}
	 * labeled alternative in {@link LatinParser#atributeAccessExpresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtributeAccessExpressionDitID(LatinParser.AtributeAccessExpressionDitIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtributeAccessExpressionClaspExpression}
	 * labeled alternative in {@link LatinParser#atributeAccessExpresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtributeAccessExpressionClaspExpression(LatinParser.AtributeAccessExpressionClaspExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtributeAccessExpressionParenExpression}
	 * labeled alternative in {@link LatinParser#atributeAccessExpresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtributeAccessExpressionParenExpression(LatinParser.AtributeAccessExpressionParenExpressionContext ctx);
}