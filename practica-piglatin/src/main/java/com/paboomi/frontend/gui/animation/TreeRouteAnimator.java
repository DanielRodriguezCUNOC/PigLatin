package com.paboomi.frontend.gui.animation;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 *
 * @author clare
 * Control the animation node by node using Timer
 */
public class TreeRouteAnimator {

    private final JTree tree;
    private Timer timer;
    private int currentIndex;
    private final List<TreePath> nodePaths = new ArrayList<>();

    public TreeRouteAnimator(JTree tree) {
        this.tree = tree;
    }

    public void startAnimation(int delayMs) {
        stopAnimation();

        if(tree.getModel() == null) return;

        DefaultMutableTreeNode root = (DefaultMutableTreeNode) tree.getModel().getRoot();
        if(root == null) return;

        // Gather the path to all nodes usin Pre-Order
        nodePaths.clear();
        collectPaths(root, new TreePath(root));

        if(nodePaths.isEmpty()) return;

        currentIndex = 0;

        // Create Timer for walk the list
        timer = new Timer(delayMs, e -> {
            if (currentIndex < nodePaths.size()) {
                TreePath path = nodePaths.get(currentIndex);
                tree.setSelectionPath(path);
                tree.scrollPathToVisible(path);
                currentIndex++;
            } else {
                stopAnimation();
            }
        });

        timer.start();
    }

    public void stopAnimation() {
        if (timer != null && timer.isRunning()) {
            timer.stop();
        }
    }

    private void collectPaths(DefaultMutableTreeNode node, TreePath currentPath) {
        nodePaths.add(currentPath);
        Enumeration<?> children = node.children();
        while (children.hasMoreElements()) {
            DefaultMutableTreeNode child = (DefaultMutableTreeNode) children.nextElement();
            collectPaths(child, currentPath.pathByAddingChild(child));
        }
    }
    
}
