/**
 *
 * @author Nátz Kornél JOO2S6
 * @author Gergye Patrik RAF7BE
 */

package hazhozszallitas;

public class Ital extends Termek{
    private boolean szensavas;

    public Ital(String nev, boolean szensavas, int ar, int elkeszitesiido) {
        super(nev, ar, elkeszitesiido);
        this.szensavas = szensavas;
    }
}
