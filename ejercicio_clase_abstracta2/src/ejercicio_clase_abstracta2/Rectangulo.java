/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_clase_abstracta2;

/**
 *
 * @author Adrian
 */
public class Rectangulo extends FiguraGeometrica{
    private double largo;
    private double ancho;

    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }
        
    
    
    @Override
    public double CalcularArea(){
    return largo * ancho;
}
    
    
    @Override
    public double CalcularPerimetro(){
    return 2* (largo * ancho);
}
    
    
    
    
}
