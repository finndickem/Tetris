/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tetris;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author Finn
 */
public class FO {
    
    
    private String nom;
    private FileOutputStream fic;
    private BufferedOutputStream fic2;
    private ObjectOutputStream writer;
    
    public FO(String n) {
        nom = n;
    }

    public void obrir() {
        try {
            fic = new FileOutputStream(nom);
            fic2= new BufferedOutputStream(fic);
            writer = new ObjectOutputStream(fic2);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void GravarObjectee(Partida p) {
        try {
            writer.writeObject(p);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void tancar() {
        try {
            writer.close();
            fic.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                fic.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
