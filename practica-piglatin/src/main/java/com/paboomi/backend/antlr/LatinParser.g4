parser grammar LatinParser;

options { tokenVocab = LatinLexer; }

// Start Program

program: instruction* EOF
       ;

instruction
    : declaration
    | arrayDeclaration
    | assignment
    | structDefinition
    | readStatement
    | printStatement
    | expression SEMICOLON
    ;

// Variable Declaration
declaration
    : ESTO ID COLON type expression SEMICOLON
    | ESTO ID COLON expression SEMICOLON
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

value
    : expression
    | structLiteral
    | arrayCreation
    | arrayLiteral
    ;

arrayCreation
    : type LEFT_CLASP expression RIGHT_CLASP   // ej: Animal[7]
    ;

arrayLiteral
    : LEFT_BRACE expression (COMMA expression)* RIGHT_BRACE   // {1, 2, 3}
    ;

// Data types
type
    : NUMERUS
    | TEXTUM
    | DECIMALS
    | LITTERA
    ;

readStatement
    : (ID)? LEERE SEMICOLON
    ;

printStatement
    : IMPREMERE printItem (IMPREMERE printItem)* SEMICOLON
    ;

printItem
    : STRING
    | ID
    | expression
    ;

lvalue
    : ID (DOT ID | LEFT_CLASP expression RIGHT_CLASP)*
    ;

assignment
    : lvalue ASSIGN expression SEMICOLON
    ;

// Aritmetic expression
expression
    : relationalExpression
    ;

relationalExpression
    : additiveExpression ( (IDENTIC | DIFF | MINOR| MAJOR | MINORTO | MAJORTO) additiveExpression )*
    ;

additiveExpression
    : multiplicativeExpression ( (PLUS | MINUS) multiplicativeExpression )*
    ;

multiplicativeExpression
    : unaryExpression ((MULT | SPLIT) unaryExpression)*
    ;

unaryExpression
    : (PLUS | MINUS | ADD | SUB) unaryExpression
    | primary
    ;

primary
    : literal
    | ID (DOT ID | LEFT_CLASP expression RIGHT_CLASP)*
    | LEFT_PAREN expression RIGHT_PAREN
    ;

literal
    : INTEGER | DECIMAL | STRING | CHAR | VERUM| FALSUS
    ;

