/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marc
 */
public class cUsuari {
    private String nom;
    private int edat;

    public cUsuari(String nom, int edat) {
        this.nom = nom;
        this.edat = edat;
    }
    
    public cUsuari() {
        this.nom = nom;
        this.edat = edat;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }
    
    @Override
    public String toString(){
        return "Nom: "+this.nom+"| Edat: "+this.edat;
    }
    
    public boolean compareTo(String nom1,String nom2){
        if(nom1 == nom2){
            return true;
        }else{
            return false;
        }
    }
    
    
    
}
