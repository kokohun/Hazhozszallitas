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

    public Rendeles(Vevo vevo, FizetesiMod fizetesimod) {
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
    
    public void VegOsszeg() {
        vegosszeg = 0;
        for (Map.Entry<Termek, Integer> termek : Termekek.entrySet()) {
            vegosszeg += termek.getKey().getAr()*(termek.getValue());
        }
        this.setVegosszeg(vegosszeg);
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

    @Override
    public String toString() {
        return "Rendeles:\nTermekek: " + Termekek + "\nRendelési idő: "
                + rendelesiido + "\nVégösszeg: " + vegosszeg + "\nKiszállítási idő: "
                + kiszallitasiido + "\nFizetési mód: " + fizetesimod + "\nVevő: " +
                vevo;
    }

    
}
