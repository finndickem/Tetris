/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tetris.Menus;

/**
 *
 * @author Finn y Sebastià
 */
import tetris.Acciones;

import javax.swing.*;
import java.awt.*;

public class PanelBotonesMenu extends JPanel {
    static Acciones acc;
    public PanelBotonesMenu(Acciones acc){
        this.acc = acc;

        setLayout(new BorderLayout());

        //BOTONES//
        setLayout(new GridLayout(5,1));

        JButton botonNuevaPartida = new JButton("NUEVA PARTIDA");
        add(botonNuevaPartida);
        //Color del boton
        botonNuevaPartida.setBackground(Color.BLACK);
        botonNuevaPartida.setForeground(Color.WHITE);
        //Accion del botón
        botonNuevaPartida.addActionListener(acc.nuevaPartida);

        JButton botonConfiguracion = new JButton("CONFIGURACIÓN");
        add(botonConfiguracion);
        //Color del boton
        botonConfiguracion.setBackground(Color.BLACK);
        botonConfiguracion.setForeground(Color.WHITE);
        //Accion del botón
        botonConfiguracion.addActionListener(acc.configuracion);

        JButton botonHistorial = new JButton("HISTORIAL");
        add(botonHistorial);
        //Color del boton
        botonHistorial.setBackground(Color.BLACK);
        botonHistorial.setForeground(Color.WHITE);
        //Accion del botón
        botonHistorial.addActionListener(acc.historial);

        JButton botonInformacion = new JButton("INFORMACIÓN");
        add(botonInformacion);
        //Color del boton
        botonInformacion.setBackground(Color.BLACK);
        botonInformacion.setForeground(Color.WHITE);
        //Accion del botón
        botonInformacion.addActionListener(acc.informacion);

        JButton botonSalir = new JButton("SALIR");
        add(botonSalir);
        //Color del boton
        botonSalir.setBackground(Color.BLACK);
        botonSalir.setForeground(Color.WHITE);
        //Accion del botón
        botonSalir.addActionListener(acc.Salir);
        //FIN PANEL BOTONES//
    }
}
