/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paneles;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Finn
 */
public class PanelInfo extends JPanel{
    
    public PanelInfo(){
        setLayout(new BorderLayout());

        JTextArea textArea = new JTextArea();
        textArea.setBackground(Color.DARK_GRAY);
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);
        
        textArea.append("HOLA HOLA");
    }
    
}
