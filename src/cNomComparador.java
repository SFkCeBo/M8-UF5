/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 @author marc*/
import java.util.Comparator;

public class cNomComparador implements Comparator<cUsuari>{
    
    public int compareTo(cUsuari u1,cUsuari u2){
        int comparar1 = u1.getNom().compareTo(u2.getNom());
                
        if(comparar1 == 0){
            return (u1.getNom().compareTo(u2.getNom()));
        } else {
            return comparar1;
        }
    }

    @Override
    public int compare(cUsuari o1, cUsuari o2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
