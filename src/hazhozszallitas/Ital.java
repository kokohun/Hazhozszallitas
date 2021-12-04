package hazhozszallitas;

/**
 *
 * @author patrikgergye
 * @author kornelnatz
 */
public class Ital extends Termek{
    private boolean szensavas;

    public Ital(boolean szensavas, String nev, int ar, int elkeszitesiido) {
        super(nev, ar, elkeszitesiido);
        this.szensavas = szensavas;
    }
    
    
}
