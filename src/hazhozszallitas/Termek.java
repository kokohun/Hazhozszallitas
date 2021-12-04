package hazhozszallitas;


/**
 *
 * @author patrikgergye
 * @author kornelnatz
 */
public class Termek implements BruttoAr {
    private String nev;
    private int ar;
    private int elkeszitesiido;

    public Termek(String nev, int ar, int elkeszitesiido) {
        this.nev = nev;
        this.ar = ar;
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
    
    public void setAr(int ar) {
        this.ar = (int)(ar * 1.27);
    }

    @Override
    public String toString() {
        return "Termek Nev: " + nev + ", Ára: " + ar + ", az elkészítési ideje: " + elkeszitesiido;
    }
    
    
    
    
}
