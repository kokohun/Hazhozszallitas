package hazhozszallitas;

/**
 *
 * @author patrikgergye
 * @author kornelnatz
 */
public class Ital extends Termek{
    private boolean szensavas;

    public Ital(String nev, boolean szensavas, int ar, int elkeszitesiido) {
        super(nev, ar, elkeszitesiido);
        this.szensavas = szensavas;
    }
    
    
}
