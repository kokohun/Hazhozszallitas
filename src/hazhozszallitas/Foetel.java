package hazhozszallitas;

/**
 *
 * @author patrikgergye
 * @author kornelnatz
 */
public class Foetel extends Termek {
    private Koret koret;

    public Foetel(Koret koret, String nev, int ar, int elkeszitesiido) {
        super(nev, ar, elkeszitesiido);
        this.koret = koret;
    }
    
    
}
