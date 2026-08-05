package com.paboomi.utils;

import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Color;
import javax.swing.UIManager;

/**
 *
 * @author clare
 */
public class UIConfiguration {
    
    public UIConfiguration(){}
    
    public void customUI(){
        try {
            // Configure base theme
            FlatDarkLaf.setup();
            
            // Customize global accent colors 
            UIManager.put("Component.focusColor", new Color(0, 180, 216));       // Border on input focus
            UIManager.put("TabbedPane.selectedBackground", new Color(30, 41, 59)); // Active tab background
            UIManager.put("TabbedPane.selectedForeground", new Color(56, 189, 248));// Active tab text (Cian)
            UIManager.put("TabbedPane.underlineColor", new Color(56, 189, 248));   // Tab indicator line
            UIManager.put("ScrollBar.thumb", new Color(71, 85, 105));             // Scrollbar color
            
        } catch (Exception e) {
            System.err.println("Error to aply Flatlaf: " + e.getMessage());
        }
    }
}
