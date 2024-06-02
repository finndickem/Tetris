package tetris3.pkg0;

import Paneles.*;
import java.awt.*;
import java.io.IOException;
import javax.swing.*;

/**
 * Main frame for the Tetris 3.0 application.
 * 
 */
public class mainFrame extends JFrame {

    private CardLayout cardLayout;
    private JPanel mainPanel;
    private Acciones acc;

    public mainFrame() {
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);
        acc = new Acciones(cardLayout, mainPanel);

        // Menu Bar
        JPanel menuPanel= new JPanel();
        menuPanel.setLayout(new GridLayout(2, 1));
        
        JMenuBar barraMenu = new JMenuBar();
        barraMenu.setBackground(Color.BLACK);

        JMenu menu = new JMenu("Menu");
        menu.setForeground(Color.WHITE);

        JMenuItem itemNuevaPartida = new JMenuItem("Nueva partida");
        JMenuItem itemConfiguracion = new JMenuItem("Configuracion");
        JMenuItem itemHistorial = new JMenuItem("Historial");
        JMenuItem itemInformacion = new JMenuItem("Informacion");
        JMenuItem itemSalir = new JMenuItem("Salir");

        itemNuevaPartida.addActionListener(acc.nuevaPartida);
        itemConfiguracion.addActionListener(acc.configuracion);
        itemHistorial.addActionListener(acc.historial);
        itemInformacion.addActionListener(acc.informacion);
        itemSalir.addActionListener(acc.salir);

        menu.add(itemNuevaPartida);
        menu.add(itemConfiguracion);
        menu.add(itemHistorial);
        menu.add(itemInformacion);
        menu.add(itemSalir);

        barraMenu.add(menu);
        menuPanel.add(barraMenu);

        // Icon Bar
        JPanel panelimg = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelimg.setBackground(Color.BLACK);

        JButton nuevaPartida = new JButton(new ImageIcon("iconos/iconoNuevaPartida.jpg"));
        JButton configuracion = new JButton(new ImageIcon("iconos/iconoConfiguracion.jpg"));
        JButton historial = new JButton(new ImageIcon("iconos/iconoHistorial.jpg"));
        JButton informacion = new JButton(new ImageIcon("iconos/iconoInformacion.jpg"));
        JButton salir = new JButton(new ImageIcon("iconos/iconoSalir.jpg"));

        nuevaPartida.setBackground(Color.BLACK);
        configuracion.setBackground(Color.BLACK);
        historial.setBackground(Color.BLACK);
        informacion.setBackground(Color.BLACK);
        salir.setBackground(Color.BLACK);

        nuevaPartida.addActionListener(acc.nuevaPartida);
        configuracion.addActionListener(acc.configuracion);
        historial.addActionListener(acc.historial);
        informacion.addActionListener(acc.informacion);
        salir.addActionListener(acc.salir);

        panelimg.add(nuevaPartida);
        panelimg.add(configuracion);
        panelimg.add(historial);
        panelimg.add(informacion);
        panelimg.add(salir);
        
        menuPanel.add(panelimg);

        // Left Panel
        JPanel panelizq = new JPanel();
        panelizq.setLayout(new GridLayout(5, 1));

        JButton botonNuevaPartida = new JButton("NUEVA PARTIDA");
        JButton botonConfiguracion = new JButton("CONFIGURACIÓN");
        JButton botonHistorial = new JButton("HISTORIAL");
        JButton botonInformacion = new JButton("INFORMACIÓN");
        JButton botonSalir = new JButton("SALIR");

        botonNuevaPartida.setBackground(Color.BLACK);
        botonNuevaPartida.setForeground(Color.WHITE);
        botonConfiguracion.setBackground(Color.BLACK);
        botonConfiguracion.setForeground(Color.WHITE);
        botonHistorial.setBackground(Color.BLACK);
        botonHistorial.setForeground(Color.WHITE);
        botonInformacion.setBackground(Color.BLACK);
        botonInformacion.setForeground(Color.WHITE);
        botonSalir.setBackground(Color.BLACK);
        botonSalir.setForeground(Color.WHITE);

        botonNuevaPartida.addActionListener(acc.nuevaPartida);
        botonConfiguracion.addActionListener(acc.configuracion);
        botonHistorial.addActionListener(acc.historial);
        botonInformacion.addActionListener(acc.informacion);
        botonSalir.addActionListener(acc.salir);

        panelizq.add(botonNuevaPartida);
        panelizq.add(botonConfiguracion);
        panelizq.add(botonHistorial);
        panelizq.add(botonInformacion);
        panelizq.add(botonSalir);
        

        // Initialize the starting panel (PanelInicio)
        try {
            JPanel panelInicio = new PanelInicio();
            mainPanel.add(panelInicio, "PanelInicio");
            mainPanel.add(new PanelHistorial(), "PanelHistorial");
            mainPanel.add(new PanelInfo(), "PanelInfo");
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // Setup the main frame layout
        
        
        setLayout(new BorderLayout());
        add(menuPanel, BorderLayout.NORTH); 
        add(panelizq, BorderLayout.WEST);
        add(mainPanel, BorderLayout.CENTER);
        
         JSplitPane pane1 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, panelizq, mainPanel);
        pane1.setDividerLocation(150); // Set initial divider location
        pane1.setOneTouchExpandable(true);
        
        JSplitPane pane2 = new JSplitPane(JSplitPane.VERTICAL_SPLIT, menuPanel, pane1);
        pane2.setDividerLocation(100); // Set initial divider location
        pane2.setOneTouchExpandable(true);
        
        setLayout(new BorderLayout());
        add(pane2, BorderLayout.CENTER);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 600); // Adjusted size for better visibility
        this.setVisible(true);

    }

    public static void main(String[] args) {
        new mainFrame();
    }
}
