package hazhozszallitas;

/**
 *
 * @author patrikgergye
 * @author kornelnatz
 */
public class Foetel extends Termek {
    private Koret koret;

    public Foetel(String nev, Koret koret, int ar, int elkeszitesiido) {
        super(nev, ar, elkeszitesiido);
        this.koret = koret;
    }
    
    
}
