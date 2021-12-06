/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hazhozszallitas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;


/**
 *
 * @author Natz Kornel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        //INICIALIZÁLÁS
        ArrayList<Vevo> vevolista = new ArrayList<Vevo>();
        Vevo v1 = new Vevo("Kiss Zoltán", "Abda, Ifjúság u. 11.", 16, "06205678252");
        Vevo v2 = new Vevo("Gipsz Jakab", "Nagybácsa, Elek u. 4.", 18, "06205673249");
        Vevo v3 = new Vevo("Viz Elek", "Győr, Kiss körút 1.", 6, "06205417614");
        vevolista.add(v1);
        vevolista.add(v2);
        vevolista.add(v3);
         
        Termek t1 = new Foetel("Gordon Bleu", Koret.KROKETT, 1200, 10);
        Termek t2 = new Savanyusag("Vegyes", true, 500, 4);
        Termek t3 = new Desszert("Somlói", true, true, 700, 6);
        Termek t4 = new Ital("Kóla", true, 400, 2);
        Termek t5 = new Desszert("Tiramisu", false, true, 750, 5);
        Termek t6 = new Ital("Ásványvíz", true, 450, 1);
        
        Etlap e1 = new Etlap();
        e1.TermekHozzad(t1);
        e1.TermekHozzad(t2);
        e1.TermekHozzad(t3);
        e1.TermekHozzad(t4);
        e1.TermekHozzad(t5);
        e1.TermekHozzad(t6);
        
        
        
        //VEVŐ RENDELÉSEK
        
        Rendeles r1 = new Rendeles(v1, FizetesiMod.SZEPKARTYA);
        r1.TermekHozzaad(t1, 1);
        r1.TermekHozzaad(t4, 2);
        r1.TermekHozzaad(t3, 3);
        r1.VegOsszeg();
        r1.kiszallitasiIdo();
        
        Rendeles r2 = new Rendeles(v2, FizetesiMod.BANKKARTYA);
        r2.TermekHozzaad(t6, 1);
        r2.TermekHozzaad(t3, 2);
        r2.TermekHozzaad(t1, 3);
        r2.VegOsszeg();
        r2.kiszallitasiIdo();
        
        Rendeles r3 = new Rendeles(v3, FizetesiMod.KESZPENZ);
        r3.TermekHozzaad(t2, 5);
        r3.TermekHozzaad(t4, 1);
        r3.TermekHozzaad(t5, 3);
        r3.VegOsszeg();
        r3.kiszallitasiIdo();
        
        //RENDELÉS LISTA
        
        ArrayList<Rendeles> rendeleslista = new ArrayList<Rendeles>();
        rendeleslista.add(r1);
        rendeleslista.add(r2);
        rendeleslista.add(r3);
        
        //FÁJLBA ÍRÁS TÁVOLSÁG SZERINT NÖVEKVŐBE
        
        Fajl f1 = new Fajl();
        f1.tavolsagNovekvobe(vevolista);
        f1.fajlbaIr(vevolista, rendeleslista);

        //VÉGÖSSZEG SZERINT CSÖKKENŐ SORRENDES KIÍRATÁS
        
        Rendezes rend1 = new Rendezes();
        rend1.vegosszegCsokkenobe(rendeleslista);
        
        //BLOKKOK KIÍRATÁSA
        
        r3.blokk();
        r1.blokk();
        

    }
    
}
