/**
 *
 * @author Nátz Kornél JOO2S6
 * @author Gergye Patrik RAF7BE
 */

package hazhozszallitas;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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
    
    public void fajlbaIr(ArrayList<Vevo> vevolista, ArrayList<Rendeles> rendeleslista) {
        FileWriter fajl = null;
        try {
            fajl = new FileWriter("megrendelesek.txt");
            for (int i = 0; i < vevolista.size(); i++) {
                fajl.write("\nVevő neve: " + vevolista.get(i).getNev());
                fajl.write("\nCíme: " + vevolista.get(i).getCim());
                fajl.write("\nTelefonszám: " + vevolista.get(i).getTelefonszam());
                fajl.write("\nÖsszérték: " + rendeleslista.get(i).getVegosszeg() + " HUF");
                fajl.write("\nFizetés módja: " + rendeleslista.get(i).getFizetesiMod()); 
                fajl.write("\nTávolság: " + vevolista.get(i).getTavolsag()+ "\n"); 
            
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
    
    public void tavolsagNovekvobe(ArrayList<Vevo> vevolista) {
        Collections.sort(vevolista, Comparator.comparingInt(Vevo::getTavolsag));
        
        //for (int i = 0; i < vevolista.size(); i++) {
            //System.out.println(vevolista.get(i));   
        //}
    }
}
