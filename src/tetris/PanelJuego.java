package tetris;

import tetris.Tablero.TableroTetris;

import javax.swing.*;
import java.awt.*;

public class PanelJuego extends JPanel {
    private TableroTetris tablero;
    public PanelJuego(){
        setLayout(new BorderLayout());

        setBackground(Color.black);

        tablero = new TableroTetris();
        add(tablero, BorderLayout.CENTER);
    }

    public static void main(String [] args){
        JFrame frame2Test = new JFrame();
        PanelJuego pj = new PanelJuego();

        frame2Test.add(pj);

        frame2Test.setLocationRelativeTo(null);
        frame2Test.setSize(700,500);
        frame2Test.setDefaultCloseOperation(3);
        frame2Test.setVisible(true);
    }

}
