/**
 *
 * @author Nátz Kornél JOO2S6
 * @author Gergye Patrik RAF7BE
 */

package hazhozszallitas;

public class Desszert extends Termek {
    private boolean glmentes;
    private boolean lkzmentes;

    public Desszert(String nev, boolean glmentes, boolean lkzmentes, int ar, int elkeszitesiido) {
        super(nev, ar, elkeszitesiido);
        this.glmentes = glmentes;
        this.lkzmentes = lkzmentes;
    }
    
    
}
