package hazhozszallitas;

/**
 *
 * @author patrikgergye
 * @author kornelnatz
 */
public class Savanyusag extends Termek {
    private boolean friss;

    public Savanyusag(String nev, boolean friss, int ar, int elkeszitesiido) {
        super(nev, ar, elkeszitesiido);
        this.friss = friss;
    }
    
    
}
