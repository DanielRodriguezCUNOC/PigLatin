#!/bin/bash

ANTLR_JAR="/home/clare/antlr4/antlr-4.13.2-complete.jar"

GRAMMAR_PARSER="LatinLexer.g4"

GRAMMAR_LEXER="LatinParser.g4"

PACKAGE="com.paboomi.backend.antlr.generated"

OUTPUT_DIR="generated"

echo "======================================"
echo " Generando parser :)"
echo "======================================"

java -jar "$ANTLR_JAR" \
    -visitor \
    -listener \
    -long-messages \
    -package "$PACKAGE" \
    -o "$OUTPUT_DIR" \
    "$GRAMMAR_LEXER" \
    "$GRAMMAR_PARSER"


echo ""
echo "Parser generado correctamente."