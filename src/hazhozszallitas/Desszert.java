package hazhozszallitas;

/**
 *
 * @author patrikgergye
 * @author kornelnatz
 */
public class Desszert extends Termek {
    private boolean glmentes;
    private boolean lkzmentes;

    public Desszert(String nev, boolean glmentes, boolean lkzmentes, int ar, int elkeszitesiido) {
        super(nev, ar, elkeszitesiido);
        this.glmentes = glmentes;
        this.lkzmentes = lkzmentes;
    }
    
    
}
