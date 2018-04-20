/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marc
 */
public class CCompteBancari {
    private int numero;
    private CPersona propietari;
    private float saldo;
    private static float saldoinicial = 200;
    private static int seguentcompte = 1234;
    private static float newsaldo;

    public CCompteBancari(CPersona propietari) {
        this.numero = seguentcompte;
        this.propietari = propietari;
        this.saldo = saldoinicial;
        seguentcompte = seguentcompte + 1;
    }
    public CCompteBancari(CCompteBancari obj) {
        this.numero = seguentcompte;
        this.propietari = obj.propietari;
        this.saldo = obj.saldo;
        saldoinicial = 100;
        seguentcompte = seguentcompte + 1;
    }

    public CPersona getPropietari() {
        return propietari;
    }

    public void setPropietari(CPersona propietari) {
        this.propietari = propietari;
    }

    public int getNumero() {
        return numero;
    }
    
    
    public float consultarSaldo(){
        return this.saldo;
    }
    public static void modificaSaldoInicial(){
        System.out.println("El saldo inicial actual es de " + saldoinicial);
        System.out.println("Introdueix el nou saldo inicial :");
        newsaldo = cLlegir.datoFloat();
        saldoinicial = newsaldo;
        System.out.println("Saldo actualitzat");
    }
    
   
    
    public boolean comprovarNsecret(int compte1,int compte2){
        if(compte1 == compte2){
            return true;
        }else{
            return false;
        }
    }    
    
    public boolean ingresar(int comptesecret, float saldoing){
            if(this.propietari.getNsecret() == comptesecret){
                this.saldo = saldo + saldoing;
                return true;
            } else{
            return false;
        }
        
    }
    
    public void saludos(){
         System.out.println("SALUDOS");
    }
    
     public boolean extraer(int comptesecret, float saldoext){
            if(this.propietari.getNsecret() == comptesecret){
                this.saldo = saldo - saldoext;
                return true;
            } else{
            return false;
        } 
    }

    
}
