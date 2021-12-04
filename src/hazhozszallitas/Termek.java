package hazhozszallitas;


/**
 *
 * @author patrikgergye
 * @author kornelnatz
 */
public class Termek extends Etlap implements BruttoAr {
    private String nev;
    private int ar;
    private int elkeszitesiido;

    public Termek(String nev, int ar, int elkeszitesiido) {
        this.nev = nev;
        this.ar = setAr(ar);
        this.elkeszitesiido = elkeszitesiido;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getElkeszitesiido() {
        return elkeszitesiido;
    }

    public void setElkeszitesiido(int elkeszitesiido) {
        this.elkeszitesiido = elkeszitesiido;
    }
    
    public int getAr() {
        return ar;
    }
    
    public int setAr(int ar) {
        return this.ar = (int) (ar * 1.27);
    }

    @Override
    public String toString() {
        return "Termék Neve: " + nev + ", Ára: Br. " + ar + " HUF, az elkészítési ideje: " + elkeszitesiido + " perc";
    }
    
    
    
    
}
