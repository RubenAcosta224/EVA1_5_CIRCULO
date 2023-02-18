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
public class Circulo {
      private double area;
    private double perimetro;
    private double radio;
    
    public Circulo(){
        area = 0;
        perimetro = 0;
        radio = 0;
    }
    public void setRadio(double ra){
        
        if(ra>0){
            radio = ra;
        }else{
            System.out.println("Radio debe ser mayor a 0");
        }
        
        
    }
    public double getRadio(){
        return radio;
        
    }
    public double getArea(){
        double ar=Math.PI*radio*radio;
        return ar;
        
    }
    public double getPerimetro(){
        double pe=Math.PI*(2*radio);
        return pe;
    }
    public void imprimrirDatos(){
        System.out.println("Area: " +getArea());
        System.out.println("Perimetro: " +getPerimetro());
        System.out.println("Radio: "+radio);
    }
}

    
