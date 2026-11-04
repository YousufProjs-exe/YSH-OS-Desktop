
package com.ysh.os;

import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import java.awt.Dimension;

public class main {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            JFrame frame = new JFrame("YSH OS");

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setMinimumSize(new Dimension(900, 600));
            frame.setSize(1200, 750);
            frame.setLocationRelativeTo(null);

            frame.setVisible(true);
        });
    }
}
