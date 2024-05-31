/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tetris.Tablero;

/**
 *
 * @author Finn
 */
import tetris.Tablero.CasillaTetris;

import javax.swing.*;
import java.awt.*;

public class TableroTetris extends JPanel {
    private static final int numCasillas = 20;
    private CasillaTetris[][] casillas = new CasillaTetris[numCasillas][numCasillas];

    public TableroTetris(){
        for (int fila = 0; fila < numCasillas; fila++) {
            int x = 0;
            int y = fila*40;
            for (int columna = 0; columna < numCasillas; columna++) {
                casillas[fila][columna]=new CasillaTetris(x,y);
                x+=40;
            }
        }
    }

    public void paint(Graphics g){
        g.setColor(Color.BLACK);
        for (int fila=0; fila <numCasillas; fila++) {
            g.drawLine(0, (int)casillas[fila][0].getY()
                    ,getWidth(), (int)casillas[fila][0].getY());
        }
        g.drawLine((int)0, (int)casillas[numCasillas-1][0].getY()+40
                ,getWidth(), (int)casillas[numCasillas-1][0].getY()+40);

        for (int columna=0;columna<numCasillas;columna++) {
            g.drawLine((int)casillas[0][columna].getX(), 0
                    ,(int)casillas[0][columna].getX(), getHeight());
        }
        g.drawLine((int)casillas[0][numCasillas-1].getX()+40, 0
                , (int)casillas[0][numCasillas-1].getX()+40,getHeight());
    }
}
