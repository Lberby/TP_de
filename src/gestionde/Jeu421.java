/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionde;

import java.util.Scanner;

/**
 *
 * @author csnd2340
 */
public class Jeu421 {

    private De de1;
    private De de2;
    private De de3;
    private boolean trouve4;
    private boolean trouve2;
    private boolean trouve1;
    int nbCoups;

    public Jeu421() {
        this.de1 = new De();
        this.de2 = new De();
        this.de3 = new De();
        this.trouve4 = false;
        this.trouve2 = false;
        this.trouve1 = false;
        this.nbCoups = 1;

    }

    public int getNbCoups() {
        return nbCoups;
    }

    public void setNbCoups(int nbCoups) {
        this.nbCoups = nbCoups;
    }

    public De getDe1() {
        return de1;
    }

    public void setDe1(De de1) {
        this.de1 = de1;
    }

    public De getDe2() {
        return de2;
    }

    public void setDe2(De de2) {
        this.de2 = de2;
    }

    public De getDe3() {
        return de3;
    }

    public void setDe3(De de3) {
        this.de3 = de3;
    }

    public void Jouer() {

        this.de1.lancer();
        this.de2.lancer();
        this.de3.lancer();

        System.out.println("De 1 : " + de1.getValeur());
        System.out.println("De 2 : " + de2.getValeur());
        System.out.println("De 3 : " + de3.getValeur());

        int nbCoups = 1;

        if ((de1.getValeur() == 4) || (de2.getValeur() == 4) || (de3.getValeur() == 4)) {
            this.trouve4 = true;
        }
        if ((de1.getValeur() == 2) || (de2.getValeur() == 2) || (de3.getValeur() == 2)) {
            this.trouve2 = true;
        }
        if ((de1.getValeur() == 1) || (de2.getValeur() == 1) || (de3.getValeur() == 1)) {
            this.trouve1 = true;
        }

        Scanner sc = new Scanner(System.in);
        while ((trouve4 == false) || (trouve2 == false) || (trouve1 == false)) {
            System.out.println("Quel dé relancer ?");

            int s = sc.nextInt();
            switch (s) {
                case 1:
                    this.de1.lancer();
                    nbCoups += 1;
                    break;
                case 2:
                    this.de2.lancer();
                    nbCoups += 1;
                    break;
                case 3:
                    this.de3.lancer();
                    nbCoups += 1;
                    break;
                default:
                    System.out.println("Vous devez relancer un dé ! ");
                    break;
            }
            System.out.println("De 1 : " + de1.getValeur());
            System.out.println("De 2 : " + de2.getValeur());
            System.out.println("De 3 : " + de3.getValeur());

            if ((de1.getValeur() == 4) || (de2.getValeur() == 4) || (de3.getValeur() == 4)) {
                this.trouve4 = true;

            }
            if ((de1.getValeur() == 2) || (de2.getValeur() == 2) || (de3.getValeur() == 2)) {
                this.trouve2 = true;

            }
            if ((de1.getValeur() == 1) || (de2.getValeur() == 1) || (de3.getValeur() == 1)) {
                this.trouve1 = true;

            }

        }
        System.out.println("Nombre de coups jouer : " + nbCoups);
    }
    
    public boolean partieGagner(){
        this.trouve4 = false;
        this.trouve2 = false;
        this.trouve1 = false;
        
        if ((de1.getValeur() == 4) || (de2.getValeur() == 4) || (de3.getValeur() == 4)) {
            this.trouve4 = true;
        }
        if ((de1.getValeur() == 2) || (de2.getValeur() == 2) || (de3.getValeur() == 2)) {
            this.trouve2 = true;
        }
        if ((de1.getValeur() == 1) || (de2.getValeur() == 1) || (de3.getValeur() == 1)) {
            this.trouve1 = true;
        }
        return (trouve4&&trouve2&&trouve1);
    }

    public void Deviner() {
        this.de1.lancer();
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int cpt=0;
        while (num != de1.getValeur()) {
            System.out.println("Entrez une valeur");
            num = sc.nextInt();

            if (num < de1.getValeur()) {
                System.out.println("C'est plus ! ");
                cpt++;
            } else if (num > de1.getValeur()) {
                System.out.println("C'est moins ! ");
                cpt++;
            } else {
                System.out.println("Gagné ! ");
            }
            
        }
        System.out.println("Nombre d'essais : " + cpt);

    }

}
