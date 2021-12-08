/**
 *
 * @author Nátz Kornél JOO2S6
 * @author Gergye Patrik RAF7BE
 */

package hazhozszallitas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Rendezes {
    
    public void vegosszegCsokkenobe(ArrayList<Rendeles> rendeleslista) {
        Collections.sort(rendeleslista, Comparator.comparingInt(Rendeles::getVegosszeg).reversed());
    
        for (int i = 0; i < rendeleslista.size(); i++) {
            System.out.println(rendeleslista.get(i));   
        }
    }
    
    
}
