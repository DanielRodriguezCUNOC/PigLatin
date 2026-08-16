package com.paboomi.frontend.gui.components;

import javax.swing.*;
import java.awt.*;

public class RoundedPanel extends JPanel {

    private final Color bgColor;
    private final int cornerRadius;

    public RoundedPanel(LayoutManager layout, int radius, Color bgColor) {
        super(layout);
        this.bgColor = bgColor;
        this.cornerRadius = radius;
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(bgColor);
        g2d.fillRoundRect(0, 0, getWidth(), getHeight(), cornerRadius, cornerRadius);

        //* Border
        g2d.setColor(new Color(210, 200, 180));
        g2d.drawRoundRect(0,0, getWidth() - 1, getHeight() - 1, cornerRadius, cornerRadius);
    }
}
