/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hazhozszallitas;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Natz Kornel
 */
public class Fajl {
    private Vevo vevo;
    private Rendeles rendeles;

    public Vevo getVevo() {
        return vevo;
    }

    public void setVevo(Vevo vevo) {
        this.vevo = vevo;
    }

    public Rendeles getRendeles() {
        return rendeles;
    }

    public void setRendeles(Rendeles rendeles) {
        this.rendeles = rendeles;
    }
    
    public void fajlbaIr(ArrayList<Rendeles> rendeleslista) {
        FileWriter fajl = null;
        try {
            fajl = new FileWriter("megrendelesek.txt");
            for (int i = 0; i < rendeleslista.size(); i++) {
                fajl.write("\nVevő neve: " + rendeleslista.get(i).getVevo().getNev());
                fajl.write("\nCíme: " + rendeleslista.get(i).getVevo().getCim());
                fajl.write("\nTelefonszám: " + rendeleslista.get(i).getVevo().getTelefonszam());
                fajl.write("\nÖsszérték: " + rendeleslista.get(i).getVegosszeg() + " HUF");
                fajl.write("\nFizetés módja: " + rendeleslista.get(i).getFizetesiMod() + "\n"); 
            
            }
        } 
        catch (Exception e) {
            e.printStackTrace();
        }   
        finally {
            try {
                if (fajl != null) {
                    fajl.flush();
                    fajl.close();				
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
    	}
    }
}
