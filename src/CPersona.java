/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marc
 */
public class CPersona {
    private String nom;
    private String pcognom;
    private String scognom;
    private int nsecret;
    
    
    public CPersona(String nom, String pcognom,String scognom, int nsecret){
        this.nom = nom;
        this.pcognom = pcognom;
        this.scognom = scognom;
        this.nsecret = nsecret;
    }
    public CPersona(CPersona obj){
        this.nom = obj.nom;
        this.pcognom = obj.pcognom;
        this.scognom = obj.scognom;
        this.nsecret = obj.nsecret;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPcognom() {
        return pcognom;
    }

    public void setPcognom(String pcognom) {
        this.pcognom = pcognom;
    }

    public String getScognom() {
        return scognom;
    }

    public void setScognom(String scognom) {
        this.scognom = scognom;
    }

    public int getNsecret() {
        return nsecret;
    }

    public void setNsecret(int nsecret) {
        this.nsecret = nsecret;
    }
    
    
    
}
