/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hazhozszallitas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Natz Kornel
 */
public class Rendezes {
    
    public void vegosszegCsokkenobe(ArrayList<Rendeles> rendeleslista) {
        Collections.sort(rendeleslista, Comparator.comparingInt(Rendeles::getVegosszeg).reversed());
    
        for (int i = 0; i < rendeleslista.size(); i++) {
            System.out.println(rendeleslista.get(i));   
        }
    }
    
    
}
