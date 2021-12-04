/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hazhozszallitas;

import java.util.ArrayList;
import jdk.nashorn.internal.ir.TernaryNode;

/**
 *
 * @author Natz Kornel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //----------------------Név, NettóÁr, ElkIdő percben---------------
        //Termek t1 = new Termek("Gordon Bleu", 1200, 5);
        //Termek t2 = new Termek("Nagy Fatálas", 2500, 7);
        //Termek t3 = new Foetel(Koret.KROKETT, "asd", 0, 0);
        //Termek t4 = new Savanyusag(true, "asd", 0, 0);

        
        //System.out.println(t1);
        //System.out.println(t2);
        
        //System.out.println("\n\n//-------------------------------//");
    
        //Vevo v1 = new Vevo("Viz Elek", "Győr, Kiss körút 1.", 6, "06205417614");
        //Vevo v2 = new Vevo("Gipsz Jakab", "Nagybácsa, Elek u. 4.", 14, "06205673249");
        
        //System.out.println(v1);
        //System.out.println(v2);
        
        
        
        ArrayList<Etlap> Etlap = new ArrayList<Etlap>();
        Etlap.add(new Ital("Kóla", true, 610, 2));
        Etlap.add(new Foetel("Rántott hús", Koret.KROKETT, 1200, 10));
        Etlap.add(new Desszert("Somlói", true, true, 600, 5));
        Etlap.add(new Savanyusag("Vegyes", true, 300, 2));
        Etlap.add(new Ital("Korsó sör", true, 500, 3));
        Etlap.add(new Foetel("Rántott hús", Koret.RIZS, 1200, 11));
        
        for (int i = 0; i < Etlap.size(); i++) {
            System.out.println(Etlap.get(i));
        }
        
        Vevo v1 = new Vevo("Viz Elek", "Győr, Kiss körút 1.", 6, "06205417614");
        Vevo v2 = new Vevo("Gipsz Jakab", "Nagybácsa, Elek u. 4.", 14, "06205673249");
        
        
        
        
    }
    
}
