package hazhozszallitas;

import java.util.ArrayList;

/**
 *
 * @author patrikgergye
 * @author kornelnatz
 */
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
