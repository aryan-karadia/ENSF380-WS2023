/*
Copyright Ann Barcomb and Emily Marasco, 2021
Licensed under GPL v3
See LICENSE.txt for more information.
*/

package edu.ucalgary.oop;

import javax.swing.*;
import java.awt.*;

public class GUIDemoWithButton {
    public static void main(String args[]) {

        EventQueue.invokeLater(() -> {
            JFrame frame = new JFrame("My First Frame");
            frame.setSize(400, 400);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            JPanel buttonsPanel = new JPanel();
            JButton myButton = new JButton("Click here!");
            buttonsPanel.add(myButton);
            frame.getContentPane().add(BorderLayout.NORTH, buttonsPanel);
            frame.setVisible(true);
        });
    }
}
