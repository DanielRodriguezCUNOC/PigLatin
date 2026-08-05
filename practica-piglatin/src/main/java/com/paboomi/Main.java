package com.paboomi;

import com.formdev.flatlaf.FlatDarkLaf;
import com.paboomi.frontend.gui.PrincipalWindow;
import com.paboomi.utils.UIConfiguration;
import java.awt.EventQueue;
import javax.swing.SwingUtilities;

/**
 *
 * @author clare
 */
public class Main {

    public static void main(String[] args) {
        
        UIConfiguration config = new UIConfiguration();
        config.customUI();
        EventQueue.invokeLater(() ->{
            new PrincipalWindow().setVisible(true);
        });
        
    }
}
