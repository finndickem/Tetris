/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tetris;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author Finn
 */
public class FI {
    private String nom;
    private FileInputStream fic;
    private BufferedInputStream fic2;
    private ObjectInputStream reader;

    public FI(String n) {
        nom = n;
    }

    public void obrir() {
        try {
            fic = new FileInputStream(nom);
            fic2= new BufferedInputStream(fic);
            reader = new ObjectInputStream(fic2);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public Partida llegirObjecte() {
        Partida res = null;
        try {
            res = (Partida)reader.readObject();
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return res;
    }

    public void tancar() {
        try {
            reader.close();
            fic.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                fic.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
