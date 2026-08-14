parser grammar LatinParser;

options { tokenVocab = LatinLexer; }

// Start Program
program
       : (VARIABILES_INIT globalDeclarations)?
         (MUNERA_INIT functionDefinitions)?
         MAIOR_INIT mainInstructions FINIS_EOF SEMICOLON? EOF
       ;

globalDeclarations
    : ( globalDeclaration )*
    ;

// Allows the declaration of global variables, arrays, and structures
globalDeclaration
    : declaration                                                           #GlobalDeclarationDeclaration
    | arrayDeclaration                                                      #GlobalDeclarationArrayDeclaration
    | structDefinition                                                      #GlobalDeclarationStructDefinition
    ;

functionDefinitions
    : functionDefinition*
    ;

mainInstructions
    : instruction*
    ;

instruction
    : assignment                                                            #InstructionAssignment
    | readStatement                                                         #InstructionAssignment
    | printStatement                                                        #InstructionAssignment
    | ifStatement                                                           #InstructionAssignment
    | whileStatement                                                        #InstructionAssignment
    | doWhileStatement                                                      #InstructionAssignment
    | forStatement                                                          #InstructionAssignment
    | jumpStatement                                                         #InstructionAssignment
    | returnStatement                                                       #InstructionAssignment
    | expression SEMICOLON                                                  #InstructionAssignment
    ;

// Variable Declaration
declaration
    : ESTO ID (COLON)? (type)? expression SEMICOLON?
    ;

arrayDeclaration
    : SERIES ID LEFT_CLASP INTEGER RIGHT_CLASP COLON (type)? (LEFT_BRACE arrayValues RIGHT_BRACE)? SEMICOLON?
    ;

arrayValues
    : expression (COMMA expression)*
    ;

structDefinition
    : STRUCTURA ID LEFT_BRACE structFieldDeclaration (structFieldSeparator structFieldDeclaration)* RIGHT_BRACE FINIS SEMICOLON
    ;

structFieldDeclaration
    : ESTO ID COLON type                                                  #StructFieldDeclarationVariables
    | SERIES ID COLON type                                                #StructFieldDeclarationSeries
    ;

structLiteral
    : (ID)? LEFT_BRACE (structFieldInitializer (COMMA structFieldInitializer)*)? RIGHT_BRACE
    ;

structFieldInitializer
    : ID COLON expression
    ;

structFieldSeparator
    : COMMA                                             #StructFieldSeparatorComma
    | SEMICOLON                                         #StructFieldSeparatorSemicolon
    ;

ifStatement
    : SI LEFT_PAREN booleanExpression RIGHT_PAREN block (elseIfClause)* (elseClause)? FINIS SEMICOLON
    ;

elseIfClause
    : ALITER LEFT_PAREN booleanExpression RIGHT_PAREN block
    ;

elseClause
    : ALITER block
    ;

whileStatement
    : DUM LEFT_PAREN booleanExpression RIGHT_PAREN block FINIS SEMICOLON
    ;

doWhileStatement
    : FACERE block DUM LEFT_PAREN booleanExpression RIGHT_PAREN SEMICOLON
    ;

forStatement
    : PER LEFT_PAREN forInit SEMICOLON forCondition SEMICOLON forUpdate? RIGHT_PAREN block  #ForStandard
    ;

jumpStatement
    : PERGE SEMICOLON                                                                       #JumpStatementContinue
    | INTERRUMPE SEMICOLON                                                                  #JumpStatementReturn
    ;

functionDefinition
    : ACTIO ID LEFT_PAREN parameterList? RIGHT_PAREN functionBody FINIS SEMICOLON           #FunctionDefinitionVoid
    | RATIO type ID LEFT_PAREN parameterList? RIGHT_PAREN functionBody FINIS SEMICOLON      #FunctionDefinitionReturn
    ;

functionBody
    : LEFT_BRACE varSection? instruction* RIGHT_BRACE
    ;

parameter
    : ESTO ID COLON type
    ;

parameterList
    : parameter (COMMA parameter)*
    ;

argumentList
    : expression (COMMA expression)*
    ;

returnStatement
    : REDDERE expression SEMICOLON
    ;

varSection
    : VARIABILES LEFT_CLASP (declaration)* RIGHT_CLASP
    ;

forInit
    : ESTO ID (COLON)? (type)? expression                                       #ForInitWithDeclaration
    | lvalue ASSIGN expression                                                  #ForInitWithAssign
    | ID                                                                        #ForInitWithID
    ;

forCondition
    : booleanExpression
    ;

forUpdate
    : expression                            #ForUpdateExpression
    | lvalue ASSIGN expression              #ForUpdateLvalue
    ;

block
    : LEFT_BRACE instruction* RIGHT_BRACE
    ;

arrayCreation
    : type LEFT_CLASP expression RIGHT_CLASP
    ;

arrayLiteral
    : LEFT_BRACE expression (COMMA expression)* RIGHT_BRACE
    ;

// Data types
type
    : NUMERUS                                                               #TypeNumerus
    | TEXTUM                                                                #TypeTextum
    | DECIMALIS                                                             #TypeDecimalis
    | LITTERA                                                               #TypeLittera
    | VERUM                                                                 #TypeVerum
    | FALSUS                                                                #TypeFalsus
    | ID                                                                    #TypeID
    ;

readStatement
    : lvalue LEERE SEMICOLON?
    ;


/**Allows:
  >> "Holaaaaa";
  >> mi_string;
  >> mi_string >> mi_textum;

*/
printStatement
    : IMPREMERE printItem (IMPREMERE printItem)* SEMICOLON?
    ;

printItem
    : STRING                                                                #PrintItemString
    | ID                                                                    #PrintItemID
    | expression                                                            #PrintItemExpression
    ;

lvalue
    : ID lvalueSufix*
    ;

// DOT ID -> mi_selva.animales[1]
// LEFT_CLASP expression RIGHT_CLASP -> nombres[0] = "Capitán Espárragos";
lvalueSufix
    : DOT ID                                                                #FieldAccess
    | LEFT_CLASP expression RIGHT_CLASP                                     #IndexAccess
    ;

/* Allows: mi_selva.animales[1] = {
               nombre:"Perro",
               apodo:"Canis"
           }
*/
assignment
    : lvalue ASSIGN expression SEMICOLON?
    ;

// Aritmetic expression
expression
    : booleanExpression                                                     #ExpressionBooleanExpression
    | numericExpression                                                     #ExpressionNumericExpression
    | stringExpression                                                      #ExpressionStringExpression
    | structLiteral                                                         #ExpressionStructLiteral
    | arrayCreation                                                         #ExpressionArrayCreation
    | arrayLiteral                                                          #ExpressionArrayLiteral
    ;

booleanExpression
    : booleanOrExpression
    ;

booleanOrExpression
    : booleanAndExpression (OR booleanAndExpression)*
    ;

booleanAndExpression
    : comparisonExpression (AND comparisonExpression)*
    ;

comparisonExpression
    : NOT comparisonExpression                                                  #ComparisonExpressionNot
    | comparisonOperand ( relationalLiteral comparisonOperand )?                #ComparisonExpressionComparisonOperand
    | LEFT_PAREN booleanExpression RIGHT_PAREN                                  #ComparisonExpressionBooleanExpresion
    ;

comparisonOperand
    : numericExpression
    | booleanLiteral
    | stringExpression
    ;

// Numeric Expression
numericExpression
    : additiveExpression
    ;

additiveExpression
    : multiplicativeExpression ( plusMinusExpression multiplicativeExpression )*
    ;

multiplicativeExpression
    : unaryExpression ( multSplitExpression unaryExpression )*
    ;

unaryExpression
    : (addSubExpression) unaryExpression                                        #UnaryExpressionAddSub
    | primaryNumeric                                                            #UnaryExpressionNumeric
    ;

addSubExpression
    : PLUS                                                                      #AddSubExpressionPlus
    | MINUS                                                                     #AddSubExpressionMinus
    | ADD                                                                       #AddSubExpressionAdd
    | SUB                                                                       #AddSubExpressionSub
    ;

incrementDecrementLiteral
    : ADD                                                                       #IncrementDecrementLiteralAdd
    | SUB                                                                       #IncrementDecrementLiteralSub
    ;

multSplitExpression
    : MULT                                                                      #MultSplitExpressionMult
    | SPLIT                                                                     #MultSplitExpressionSplit
    ;

plusMinusExpression
    : PLUS                                                                      #PlusMinusExpressionPlus
    | MINUS                                                                     #PlusMinusExpressionMinus
    ;

// String Expression
stringExpression
    : stringAdditiveExpression
    ;

stringAdditiveExpression
    : stringPrimary (PLUS stringAdditiveItem)*
    ;

stringAdditiveItem
    : stringPrimary                                                             #StringAdditiveItemStringPrimary
    | numericExpression                                                         #StringAdditiveItemNumericExpression
    ;

stringPrimary
    : STRING                                                                    #StringPrimaryString
    | CHAR                                                                      #StringPrimaryChar
    | ID (atributeAccessExpresion)*                                             #StringPrimaryAtributeAccessExpression
    ;

primaryNumeric
    : numericLiteral                                                            #PrimaryNumericNumericLiteral
    | ID (atributeAccessExpresion)* (incrementDecrementLiteral)?                                           #PrimaryNumericAtributeAccessExpression
    | LEFT_PAREN numericExpression RIGHT_PAREN                                  #PrimaryNumericNumericExpression
    ;
numericLiteral
    : INTEGER                                                                   #NumericLiteralInteger
    | DECIMAL                                                                   #NumericLiteralDecimal
    ;

booleanLiteral
    : VERUM                                                                     #BooleanLiteralVerum
    | FALSUS                                                                    #BooleanLiteralFalsus
    ;
relationalLiteral
    : IDENTIC                                                                   #RelationalLiteralIdentic
    | DIFF                                                                      #RelationalLiteralDiff
    | MINOR                                                                     #RelationalLiteralMinor
    | MAJOR                                                                     #RelationalLiteralMajor
    | MINORTO                                                                   #RelationalLiteralMinorTo
    | MAJORTO                                                                   #RelationalLiteralMajorTo
    ;

atributeAccessExpresion
    : DOT ID                                                                    #AtributeAccessExpressionDitID
    | LEFT_CLASP expression RIGHT_CLASP                                         #AtributeAccessExpressionClaspExpression
    | LEFT_PAREN argumentList? RIGHT_PAREN                                      #AtributeAccessExpressionParenExpression
    ;

