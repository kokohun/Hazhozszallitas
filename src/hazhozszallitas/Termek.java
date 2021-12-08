/**
 *
 * @author Nátz Kornél JOO2S6
 * @author Gergye Patrik RAF7BE
 */

package hazhozszallitas;

public class Termek {
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
        this.ar = ar;
    }

    @Override
    public String toString() {
        return "\nTermék Neve: " + nev + ", Ára: Nt. " + ar + " HUF, az elkészítési ideje: " + elkeszitesiido + " perc\n";
    }
    
    
    
    
}
