/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paneles;

import IO.FI;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import tetris3.pkg0.Partida;

public class PanelHistorial extends JPanel {

    public PanelHistorial() {
        setLayout(new BorderLayout());

        JTextArea textArea = new JTextArea();
        textArea.setBackground(Color.DARK_GRAY);
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);

        FI lec = new FI("files/partidasTetrisUIB.dat");
        lec.obrir();
        Partida partida = lec.llegirObjecte();
        
        while (partida != null) {
            textArea.append(partida.toString() + "\n");
            partida = lec.llegirObjecte();
        }
        
        lec.tancar();

    }

}
