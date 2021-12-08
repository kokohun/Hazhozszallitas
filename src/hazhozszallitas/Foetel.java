/**
 *
 * @author Nátz Kornél JOO2S6
 * @author Gergye Patrik RAF7BE
 */

package hazhozszallitas;

public class Foetel extends Termek {
    private Koret koret;

    public Foetel(String nev, Koret koret, int ar, int elkeszitesiido) {
        super(nev, ar, elkeszitesiido);
        this.koret = koret;
    }
}
