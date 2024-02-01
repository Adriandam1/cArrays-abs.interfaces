/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_clase_abstracta;

/**
 *
 * @author Adrian
 */
public class Ejercicio_clase_abstracta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coche car = new Coche();
        
        Bicicleta bici = new Bicicleta();
        
        car.moverse();
        bici.moverse();
        
        car.detenerse();
        bici.detenerse();
        
    }
    
}
