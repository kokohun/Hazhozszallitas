package hazhozszallitas;

import java.text.SimpleDateFormat;
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
            throw new Exception("SZÉP-kártyát csak 10000 forint alatt lehet használni!");
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
        System.out.println("------Blokk------------");
        System.out.println("Vevő neve: "+vevo.getNev());
        System.out.println("Dátum: "+rendelesiido);
        System.out.println("Termékek:");
         for (Map.Entry<Termek, Integer> termek : Termekek.entrySet()) {
            System.out.print(termek.getKey().getNev()+" ");
            System.out.print(termek.getKey().getAr()+"ft "+termek.getValue()+"db \n");   
        }
        System.out.println("Végösszeg áfával: "+vegosszeg);
        System.out.println("Fizetési mód: "+fizetesimod);
        System.out.println("-----------------------");
    }
    
    
    
    
    @Override
    public String toString() {
        return "Rendeles:\nTermekek: " + Termekek + "\nRendelési idő: "
                + rendelesiido + "\nVégösszeg: " + vegosszeg + "\nKiszállítási idő: "
                + kiszallitasiido + "\nFizetési mód: " + fizetesimod + "\nVevő: " +
                vevo;
    }

    
}
