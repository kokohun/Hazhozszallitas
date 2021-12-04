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
    
    
    public void setAr(int ar) {
        this.ar = (int)(ar * 1.27);
    }
}
