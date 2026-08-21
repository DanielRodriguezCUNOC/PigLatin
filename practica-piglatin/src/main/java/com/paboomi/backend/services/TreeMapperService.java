package com.paboomi.backend.services;

import com.paboomi.backend.dtos.ParserResultDTO;
import com.paboomi.backend.model.nodes.principal.NodeProgram;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class TreeMapperService {



    public NodeProgram buildAST(ParserResultDTO parserResult) {

        if (parserResult == null || parserResult.getParseTree() == null) {
            return null;
        }
        return null;
    }

    /**
     * Converts a ParserResultDTO containing an ANTLR ParseTree to a Swing DefaultTreeModel.
     */
    public DefaultTreeModel swingFormatConversion(ParserResultDTO parserResult) {
        if (parserResult == null || parserResult.getParseTree() == null) {
            return new DefaultTreeModel(new DefaultMutableTreeNode("Empty Tree"));
        }

        DefaultMutableTreeNode rootSwingNode = buildTreeNode(parserResult.getParseTree());
        return new DefaultTreeModel(rootSwingNode);
    }

    /**
     * Recursively traverses the ANTLR ParseTree and converts each node to DefaultMutableTreeNode.
     */
    private DefaultMutableTreeNode buildTreeNode(ParseTree antlrNode) {
        String nodeText;

        if (antlrNode instanceof TerminalNode) {
            // Leaf node (Tokens like numbers, identifiers, symbols)
            nodeText = antlrNode.getText();
        } else {
            // Rule node (Grammar contexts like ExpressionContext, AssignmentContext)
            String fullClassName = antlrNode.getClass().getSimpleName();
            // Removes 'Context' suffix for cleaner GUI display
            nodeText = fullClassName.endsWith("Context")
                    ? fullClassName.substring(0, fullClassName.length() - 7)
                    : fullClassName;
        }

        DefaultMutableTreeNode swingNode = new DefaultMutableTreeNode(nodeText);

        // Recurse through children
        for (int i = 0; i < antlrNode.getChildCount(); i++) {
            ParseTree antlrChild = antlrNode.getChild(i);
            swingNode.add(buildTreeNode(antlrChild));
        }

        return swingNode;
    }
}