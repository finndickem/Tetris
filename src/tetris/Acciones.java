/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tetris;

import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Finn y Sebastià
 */


public class Acciones extends JPanel {

    private PanelInicio panelInicio;

    public Acciones(PanelInicio panelInicio){
        this.panelInicio = panelInicio;
    }
    public ActionListener Salir = e -> {
            System.exit(0);
    };

    public ActionListener nuevaPartida = e -> {
        panelInicio.estadoPanel = 1;
        panelInicio.repaint();
    };

    public ActionListener configuracion = e -> {
        System.out.println("CONFIGURACIÓN");
    };

    public ActionListener historial = e -> {
        System.out.println("HISTORIAL");
    };

    public ActionListener informacion = e -> {
        System.out.println("INFORMACIÓN");
    };



}
