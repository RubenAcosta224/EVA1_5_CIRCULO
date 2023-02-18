/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_5_circulo;

/**
 *
 * @author hp
 */
public class EVA1_5_CIRCULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo circulo1 = new Circulo();
        
        circulo1.setRadio(3);
        circulo1. imprimrirDatos();
        
        
        Circulo circulo2 = new Circulo();
        
        circulo2.setRadio(20);
        circulo2. imprimrirDatos();
        
        
       
        Circulo circulo3 = new Circulo();
        
        circulo3.setRadio(-4);
        circulo3. imprimrirDatos();
    }
    
    
}
