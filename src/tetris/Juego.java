/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tetris;

/**
 * @author Finn y Sebastià
 */
import tetris.Menus.PanelBotonesMenu;
import tetris.Menus.PanelMenu;
import tetris.Tablero.TableroTetris;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Juego extends JFrame {
    private static final int HORIZONTAL=1200,VERTICAL=840;
    private PanelBotonesMenu botonesMenu;
    private PanelMenu barraMenu;
    public PanelInicio home;
    public Acciones acciones;
    public Juego() throws IOException {
        setSize(HORIZONTAL,VERTICAL);
        setTitle("PRACTICA PROG 2");
        setLocationRelativeTo(null);

        home = new PanelInicio();
        add(home,BorderLayout.CENTER);

        acciones = new Acciones(home);

        barraMenu = new PanelMenu(acciones);
        add(barraMenu, BorderLayout.NORTH);

        botonesMenu = new PanelBotonesMenu(acciones);
        add(botonesMenu, BorderLayout.WEST);

        JSplitPane pane1= new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, botonesMenu, home);
        pane1.setEnabled(false);
        
        JSplitPane pane2= new JSplitPane(JSplitPane.VERTICAL_SPLIT, barraMenu, pane1 );
        pane2.setEnabled(false);
        add(pane2);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }
    
    public void info(){
        JDialog info = new JDialog(this, "INFORMACIÓN", true);
        info.setSize(300, 200);
        info.add(new JLabel("This is a custom dialog"));
        info.setVisible(true);
    }

    public static void main(String [] args) throws Exception {
        new Juego();
    }
}