/*
Copyright Ann Barcomb and Emily Marasco, 2021
Licensed under GPL v3
See LICENSE.txt for more information.
*/

package edu.ucalgary.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIDemoWithEvent implements ActionListener{
    
    public static void main(String args[]) {

        EventQueue.invokeLater(() -> {
            JFrame frame = new JFrame("My First Frame");
            frame.setSize(400, 400);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            JPanel buttonsPanel = new JPanel();
            JButton myButton = new JButton("Click here!");

            GUIDemoWithEvent buttonListener = new GUIDemoWithEvent();
            myButton.addActionListener(buttonListener);
            buttonsPanel.add(myButton);
            frame.getContentPane().add(BorderLayout.NORTH, buttonsPanel);
            frame.setVisible(true);
        });
    }
        
    public void actionPerformed(ActionEvent event){
        JOptionPane.showMessageDialog(null, "This button has been pushed");
        }
    }    
