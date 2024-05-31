/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tetris;

/**
 *
 * @author Finn
 */
import javax.swing.*;
import java.awt.*;

public class PanelMenu extends JPanel {

    Color color = Color.BLACK;

    public PanelMenu() {

        Acciones acc = new Acciones();

        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel.setBackground(color);

        setLayout(new GridLayout(2, 1));
        setBackground(color);

        //BARRA MENU//
        JMenuBar barraMenu = new JMenuBar();
        barraMenu.setBackground(color);

        ImageIcon iconoNuevaPartida = new ImageIcon("iconos/iconoNuevaPartida.jpg");
        ImageIcon iconoConfiguracion = new ImageIcon("iconos/iconoConfiguracion.jpg");
        ImageIcon iconoHistorial = new ImageIcon("iconos/iconoHistorial.jpg");
        ImageIcon iconoInformacion = new ImageIcon("iconos/iconoInformacion.jpg");
        ImageIcon iconoSalir = new ImageIcon("iconos/iconoSalir.jpg");

        JButton nuevaPartida = new JButton(iconoNuevaPartida);
        nuevaPartida.setBackground(color);
        
        JButton configuracion = new JButton(iconoConfiguracion);
        configuracion.setBackground(color);
        
        JButton historial = new JButton(iconoHistorial);
        historial.setBackground(color);
        
        JButton informacion = new JButton(iconoInformacion);
        informacion.setBackground(color);
        
        JButton salir = new JButton(iconoSalir);
        salir.setBackground(color);

        salir.addActionListener(acc.Salir);

        panel.add(nuevaPartida);
        panel.add(configuracion);
        panel.add(historial);
        panel.add(informacion);
        panel.add(salir);

        JMenu menu = new JMenu("Menu");
        menu.setBackground(color);
        menu.setForeground(Color.WHITE);
        
        JMenuItem itemNuevaPartida = new JMenuItem("Nueva partida");
        itemNuevaPartida.setForeground(Color.white);
        itemNuevaPartida.setBackground(color);
        
        JMenuItem itemConfiguracion = new JMenuItem("Configuracion");
        itemConfiguracion.setForeground(Color.white);
        itemConfiguracion.setBackground(color);
        
        JMenuItem itemHistorial = new JMenuItem("Historial");
        itemHistorial.setForeground(Color.white);
        itemHistorial.setBackground(color);
        
        JMenuItem itemInformacion = new JMenuItem("Informacion");
        itemInformacion.setForeground(Color.white);
        itemInformacion.setBackground(color);
        
        JMenuItem itemSalir = new JMenuItem("Salir");
        itemSalir.setForeground(Color.white);
        itemSalir.setBackground(color);
        itemSalir.addActionListener(acc.Salir);

        menu.add(itemNuevaPartida);
        menu.add(itemConfiguracion);
        menu.add(itemHistorial);
        menu.add(itemInformacion);
        menu.add(itemSalir);

        barraMenu.add(menu);

        add(barraMenu);
        add(panel);

        //FIN BARRA MENU//
    }
}
