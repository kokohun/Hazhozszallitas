package hazhozszallitas;


import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;



/**
 *
 * @author patrikgergye
 * @author kornelnatz
 */
public class Rendeles implements BruttoAr {
    //lista ami termékeket tárol
    
    public HashMap<Termek, Integer> Termekek = new HashMap<>();
    public HashMap<Rendeles, Integer> Rendelesek = new HashMap<>();
    private String rendelesiido;
    private int vegosszeg;
    private int kiszallitasiido;
    private FizetesiMod fizetesimod;
    private Vevo vevo;
    private int db;

    public Rendeles(Vevo vevo, FizetesiMod fizetesimod){
        this.vevo = vevo;
        this.rendelesiido = new SimpleDateFormat("yyyy.MM.dd. HH:mm:ss").format(Calendar.getInstance().getTime());
        this.fizetesimod = fizetesimod; 
    }

    public int getVegosszeg() {
        return vegosszeg;
    }
    
    public void TermekHozzaad(Termek t, int db) {
        Termekek.put(t, db);
    }
    
    public void TermekTorol(Termek t) {
        Termekek.remove(t);
    }
    
    public void TermekDbSzamMod(Termek t, int db) {
        Termekek.replace(t, db);
    }
    
    public void setVegosszeg(int vegosszeg) {
        this.vegosszeg = (int) (vegosszeg * 1.27);
    }
    
    //vegosszeghez merten SZEP-kartya elfogadas
    public void VegOsszeg() throws Exception{
        vegosszeg = 0;
        for (Map.Entry<Termek, Integer> termek : Termekek.entrySet()) {
            vegosszeg += termek.getKey().getAr()*(termek.getValue());
        }
        this.setVegosszeg(vegosszeg);
        
        if(vegosszeg>10000 && fizetesimod==fizetesimod.SZEPKARTYA)
        {
            throw new Exception("SZÉP-kártyát csak 10 000 HUF alatt lehet használni!");
        }
        
    }
    
    
    public void kiszallitasiIdo() {
        kiszallitasiido = 0;
        kiszallitasiido += vevo.getTavolsag() * 2;
        int maxido = 0;
        for (Map.Entry<Termek, Integer> termek : Termekek.entrySet()) {
            if (maxido < termek.getKey().getElkeszitesiido()) {
                maxido = termek.getKey().getElkeszitesiido();
            }
        }
        kiszallitasiido += maxido;
    }
    
    public void blokk(){
        System.out.println("-----------Blokk------------");
        System.out.println("Vevő neve: "+vevo.getNev());
        System.out.println("Dátum: "+rendelesiido);
        System.out.println("\nTermékek:");
        for (Map.Entry<Termek, Integer> termek : Termekek.entrySet()) {
            System.out.print(termek.getKey().getNev()+" ");
            System.out.print(termek.getKey().getAr()+" HUF "+termek.getValue()+" db \n");   
        }
        System.out.println("\nVégösszeg áfával: "+vegosszeg);
        System.out.println("Fizetési mód: "+fizetesimod);
        System.out.println("----------------------------");
    }
    
    //public void fajlbaIr() {
    //    FileWriter fajl = null;
    //    try {
    //        for (Map.Entry<Rendeles, Integer> rendeles : Rendelesek.entrySet()) {
    //            fajl = new FileWriter("megrendelesek.txt");
    //            fajl.write("Vevő neve: " + vevo.getNev());
    //            fajl.write("\nCíme: " + vevo.getCim());
    //            fajl.write("\nTelefonszám: " + vevo.getTelefonszam());
    //            fajl.write("\nÖsszérték: " + vegosszeg + " HUF");
    //            fajl.write("\nFizetés módja: " + fizetesimod + "\n\n"); 
    //        }
    //    } 
    //    catch (Exception e) {
    //        e.printStackTrace();
    //    }   
    //    finally {
    //        try {
    //            if (fajl != null) {
    //                fajl.flush();
    //               fajl.close();				
    //            }
    //        } catch (IOException e) {
    //            e.printStackTrace();
    //        }
    //	}
    //}
    
    
    @Override
    public String toString() {
        return "----------RENDELÉS----------\n----------------------------\nTermekek: "
                + Termekek + "\n\nRendelési idő: "
                + rendelesiido + "\nVégösszeg: Br. " 
                + vegosszeg + " HUF\nKiszállítási idő: "
                + kiszallitasiido + "\nFizetési mód: " 
                + fizetesimod + "\n" +
                vevo + "\n----------------------------";
    }

    
}
