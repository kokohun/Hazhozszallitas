/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hazhozszallitas;

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
        Termek t1 = new Termek("Gordon Bleu", 1200, 5);
        Termek t2 = new Termek("Nagy Fatálas", 2500, 7);

        
        System.out.println(t1);
        System.out.println(t2);
    }
    
}
