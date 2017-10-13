/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionde;

import java.util.Random;

/**
 *
 * @author csnd2340
 */
public class De {

    private static int CPT_DE = 0;
    private final int numero;
    private int nbFaces;
    private int valeur;
    private boolean pipe;

    public De() {
        this.CPT_DE++;
        this.numero = CPT_DE;
        this.nbFaces = 6;
        this.valeur = 0;
        this.pipe = false;

    }

    public De(int nbFaces) {
        this.CPT_DE++;
        this.numero = CPT_DE;
        this.nbFaces = nbFaces;
        this.valeur = 0;
        this.pipe = false;
    }

    public boolean isPipe() {
        return pipe;
    }

    public void setPipe(boolean pipe) {
        this.pipe = pipe;
    }

    public int getNumero() {
        return numero;
    }

    public int getNbFaces() {
        return nbFaces;
    }

    public void setNbFaces(int nbFaces) {
        this.nbFaces = nbFaces;
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    public void lancer() {
        Random r = new Random();
         
        if(!this.pipe){
            this.valeur = r.nextInt(this.nbFaces) + 1;
        }
        else{
            //Renvoie seulement 4,2 ou 1
            
            /*while(this.valeur != 4 && this.valeur != 2 && this.valeur != 1) {
				this.valeur = r.nextInt(6)+1;
            }*/
            
            int []valeurs = {1,2,4};
            this.valeur = valeurs[r.nextInt(valeurs.length)];
        }
    }

    void piper(){
        this.pipe = true;
    }
    
     @Override
    public String toString() {
        return valeur +"";
    }
}
