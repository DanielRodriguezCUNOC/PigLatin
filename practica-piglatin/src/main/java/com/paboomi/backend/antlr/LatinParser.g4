parser grammar LatinParser;

options { tokenVocab = LatinLexer; }

// Start Program
program
       : (VARIABILES_INIT globalDeclarations)?
         (MUNERA_INIT functionDefinitions)?
         MAIOR_INIT mainInstructions FINIS SEMICOLON? EOF
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
    : ESTO ID COLON type typedExpression SEMICOLON                          #DeclarationTyped
    | ESTO ID COLON expression SEMICOLON                                    #DeclarationInferred
    ;

typedExpression
    : NUMERUS numericExpression                                             #TypedExpressionNumerus
    | DECIMALS numericExpression                                            #TypedExpressionDecimals
    | TEXTUM stringExpression                                               #TypedExpressionTextum
    | LITTERA stringExpression                                              #TypedExpressionLittera
    ;

arrayDeclaration
    : SERIES ID LEFT_CLASP INTEGER RIGHT_CLASP COLON type (LEFT_BRACE arrayValues RIGHT_BRACE)? SEMICOLON
    ;

arrayValues
    : expression (COMMA expression)*
    ;

structDefinition
    : STRUCTURA ID LEFT_BRACE structFieldDeclaration+ RIGHT_BRACE FINIS SEMICOLON
    ;

structFieldDeclaration
    : ESTO ID COLON type SEMICOLON
    | SERIES ID COLON type SEMICOLON
    ;

structLiteral
    : LEFT_BRACE structFieldInitializer (COMMA structFieldInitializer)* RIGHT_BRACE
    ;

structFieldInitializer
    : ID COLON value
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
    : PER LEFT_PAREN forInit SEMICOLON forCondition SEMICOLON forUpdate? RIGHT_PAREN block   #ForStandard
    ;

jumpStatement
    : PERGE SEMICOLON           #JumpStatementContinue
    | INTERRUMPE SEMICOLON      #JumpStatementReturn
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
    : ESTO ID COLON type numericExpression                                                  #ForInitWithDeclaration
    | ID                                                                                    #ForInitWithID
    ;

forCondition
    : booleanExpression
    ;

forUpdate
    : expression
    ;

block
    : LEFT_BRACE instruction* RIGHT_BRACE
    ;

value
    : expression
    | structLiteral
    | arrayCreation
    | arrayLiteral
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
    | DECIMALS                                                              #TypeDecimals
    | LITTERA                                                               #TypeLittera
    ;

readStatement
    : (ID)? LEERE
    ;


/**Allows:
  >> "Holaaaaa";
  >> mi_string;
  >> mi_string >> mi_textum;

*/
printStatement
    : IMPREMERE printItem (IMPREMERE printItem)* SEMICOLON
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
    : lvalue ASSIGN expression SEMICOLON
    ;

// Aritmetic expression
expression
    : booleanExpression
    | numericExpression
    | stringExpression
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
    : numericExpression ( (IDENTIC | DIFF | MINOR | MAJOR | MINORTO | MAJORTO) numericExpression )?
    | booleanLiteral
    | LEFT_PAREN booleanExpression RIGHT_PAREN
    ;

// Numeric Expression
numericExpression
    : additiveExpression
    ;

additiveExpression
    : multiplicativeExpression ( (PLUS | MINUS) multiplicativeExpression )*
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

multSplitExpression
    : MULT                                                                      #MultSplitExpressionMult
    | SPLIT                                                                     #MultSplitExpressionSplit
    ;

// String Expression
stringExpression
    : stringAdditiveExpression
    ;

stringAdditiveExpression
    : stringPrimary (PLUS stringAdditiveItem)*
    ;

stringAdditiveItem
    : stringPrimary
    | numericExpression
    ;

stringPrimary
    : STRING
    | CHAR
    | ID (DOT ID | LEFT_CLASP expression RIGHT_CLASP | LEFT_PAREN argumentList? RIGHT_PAREN)*
    ;

primaryNumeric
    : numericLiteral
    | ID (DOT ID | LEFT_CLASP expression RIGHT_CLASP | LEFT_PAREN argumentList? RIGHT_PAREN)*
    | LEFT_PAREN numericExpression RIGHT_PAREN
    ;
numericLiteral
    : INTEGER
    | DECIMAL
    ;

booleanLiteral
    : VERUM
    | FALSUS
    ;

