/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_clase_abstracta2;

/**
 *
 * @author Adrian
 */
public class Ejercicio_clase_abstracta2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FiguraGeometrica circulo = new Circulo(5);
        FiguraGeometrica rectangulo = new Rectangulo(10,4);
        
        System.out.println("Area del circulo "+circulo.CalcularArea());
        System.out.println("Perimetro del circulo "+circulo.CalcularPerimetro());
        System.out.println("Area del rectangulo "+rectangulo.CalcularArea());
        System.out.println("Perimetro del rectangulo "+rectangulo.CalcularPerimetro());
    }
    
}
