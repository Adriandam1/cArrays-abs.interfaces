/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_clase_abstracta2;

/**
 *
 * @author Adrian
 */
public class Circulo extends FiguraGeometrica {
    
    private double radio;
    
    public Circulo(double radio){
        this.radio=radio;
    }
    
    
    @Override
    public double CalcularArea(){
    return Math.PI * Math.pow(radio,2);
}
    
    @Override
    public double CalcularPerimetro(){
    return 2* (Math.PI * radio);
}
    
}
