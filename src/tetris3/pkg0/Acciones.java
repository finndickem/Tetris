/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tetris3.pkg0;

import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Finn y Sebastià
 */


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Acciones extends JPanel {

    private CardLayout cardLayout;
    private JPanel mainPanel;

    public Acciones(CardLayout cardLayout, JPanel mainPanel) {
        this.cardLayout = cardLayout;
        this.mainPanel = mainPanel;
    }

    public ActionListener salir = e -> {
        System.exit(0);
    };

    public ActionListener nuevaPartida = e -> {
        cardLayout.show(mainPanel, "Panel1");
    };

    public ActionListener configuracion = e -> {
        System.out.println("CONFIGURACIÓN");
        // Optionally, you can change to a configuration panel if it exists
        // cardLayout.show(mainPanel, "ConfiguracionPanel");
    };

    public ActionListener historial = e -> {
        cardLayout.show(mainPanel, "PanelHistorial");
    };

    public ActionListener informacion = e -> {
        cardLayout.show(mainPanel, "PanelInfo");
    };
}
