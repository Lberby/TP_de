/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionde;

import gestionde.view.fenetre;

/**
 *
 * @author csnd2340
 */
public class GestionDe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*De d1 = new De();
        De d2 = new De();
        De d3 = new De();

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        d1.lancer();
        d2.lancer();
        d3.lancer();

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        d1.piper();
        d2.piper();
        d3.piper();
        
        d1.lancer();
        d2.lancer();
        d3.lancer();

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);*/
        
        /*Simulateur sim = new Simulateur(5,20);
        System.out.println("Après construction");
        System.out.println(sim);
        sim.Remplir();
        System.out.println("Après remplissage");
        System.out.println(sim);
        
        //sim.afficheLancersJoueur(5);

        Simulateur s1 = new Simulateur(5,20);
        s1.Remplir();
        for (int i = 1; i < s1.getNbJoueurs(); i++) {
            s1.afficheLancersJoueur(i);
        }
        
        sim.afficheLancersJoueur(5);
        System.out.println("");
        System.out.print("Total joueur n°5 : " + sim.totalJoueur(5)+ "(dont " + sim.totalsix(5)+"six)" );
        */
        
        //Jeu421 jeu = new Jeu421();
        //jeu.Jouer();
        //jeu.Deviner();
        
        fenetre f = new fenetre();
        f.setVisible(true);
        
    }
    
}
