/**
 *
 * @author Nátz Kornél JOO2S6
 * @author Gergye Patrik RAF7BE
 */

package hazhozszallitas;

public class Savanyusag extends Termek {
    private boolean friss;

    public Savanyusag(String nev, boolean friss, int ar, int elkeszitesiido) {
        super(nev, ar, elkeszitesiido);
        this.friss = friss;
    }
    
    
}
