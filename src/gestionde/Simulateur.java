/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionde;

/**
 *
 * @author csnd2340
 */
public class Simulateur {

    private int[][] valeurs;
    private De de;
    private int nbJoueurs;
    private int nbLancers;

    public Simulateur(int nbJoueurs, int nbLancers) {
        this.valeurs = new int[nbJoueurs + 1][nbLancers];
        this.de = new De();
        this.nbJoueurs = nbJoueurs;
        this.nbLancers = nbLancers;
        for (int indjoueur = 1; indjoueur < valeurs.length; indjoueur++) {
            for (int indlancer = 0; indlancer < valeurs[indjoueur].length; indlancer++) {
                this.valeurs[indjoueur][indlancer]=0;
            }
        }
    }

    public int getNbJoueurs() {
        return nbJoueurs;
    }

    public void setNbJoueurs(int nbJoueurs) {
        this.nbJoueurs = nbJoueurs;
    }

    public int getNbLancers() {
        return nbLancers;
    }

    public void setNbLancers(int nbLancers) {
        this.nbLancers = nbLancers;
    }

    void Remplir() {
        for (int indjoueur = 1; indjoueur < valeurs.length; indjoueur++) {
            for (int indlancer = 0; indlancer < valeurs[indjoueur].length; indlancer++) {
                //On est sur une case
                this.de.lancer();
                this.valeurs[indjoueur][indlancer] = this.de.getValeur();
            }
        }
    }

    void afficheLancersJoueur(int numJoueur) {
        System.out.print("Joueur n°" + numJoueur + ": ");
        for (int i = 0; i < valeurs[numJoueur].length; i++) {
            System.out.print(valeurs[numJoueur][i] + " ");
        }
        System.out.println("");
    }

    public int totalJoueur(int numJoueur) {
        int resultat = 0;

        for (int cpt = 0; cpt < valeurs[numJoueur].length; cpt++) {
            resultat = resultat + valeurs[numJoueur][cpt];
        }

        return resultat;

    }

    public int totalsix(int numJoueur) {
        int nb6 = 0;
        for (int cpt = 0; cpt < valeurs[numJoueur].length; cpt++) {
            if (valeurs[numJoueur][cpt] == 6) {
                nb6 = nb6 + 1;
            }
        }
        return nb6;
    }

    @Override
    public String toString() {
        String res = "";
        for (int indjoueur = 1; indjoueur < valeurs.length; indjoueur++) {
            for (int indlancer = 0; indlancer < valeurs[indjoueur].length; indlancer++) {
                res += this.valeurs[indjoueur][indlancer] + " ";
            }
            res += "\n";

        }
        return res;
    }
}
