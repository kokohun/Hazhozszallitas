/**
 *
 * @author Nátz Kornél JOO2S6
 * @author Gergye Patrik RAF7BE
 */

package hazhozszallitas;

import java.util.ArrayList;

public class Etlap {
    public ArrayList<Termek> Termekek = new ArrayList<Termek>();

    public Etlap() {
    
    }
    
    public void TermekHozzad(Termek t) {
        Termekek.add(t);
    }
    
    public void TermekTorol(Termek t) {
        Termekek.remove(t);
    }
    
    
}
