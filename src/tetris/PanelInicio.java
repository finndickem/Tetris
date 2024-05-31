/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tetris;

/**
 *
 * @author Finn y Sebastià
 */
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PanelInicio extends JPanel {
    public int estadoPanel = 0; //0 = Fin Partida, 1 = Iniciando partida
    public static final String RUTA_FONDO_DE_PANTALLA = "imagenes/TETRIS_UIB.jpg";
    BufferedImage imagenFondo;
    public PanelInicio() throws IOException {
        imagenFondo = ImageIO.read(new File(RUTA_FONDO_DE_PANTALLA));
    }

    @Override
    public void paint(Graphics g) {
        super.paintComponent(g);
        switch (estadoPanel){
            case 0:
                repaint();
                g.drawImage(imagenFondo, 0, 0, getWidth(), getHeight(), this);
                break;
            case 1:
                System.out.println("a");
                setBackground(Color.BLACK);


                break;
            default:
                break;

        }
    }



}
