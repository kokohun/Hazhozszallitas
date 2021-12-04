package hazhozszallitas;

/**
 *
 * @author patrikgergye
 * @author kornelnatz
 */
public class Savanyusag extends Termek {
    private boolean friss;

    public Savanyusag(boolean friss, String nev, int ar, int elkeszitesiido) {
        super(nev, ar, elkeszitesiido);
        this.friss = friss;
    }
    
    
}
