/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayexample;

/**
 *
 * @author Adrian
 */
public class ArrayExample {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        // Declaración y modificación de un array
        int[] numeros = new int[3];
        numeros[0] = 99;
        numeros[1] = 120;
        numeros[2] = 33;
        System.out.println("Array modificado: " + numeros[0] + ", " + numeros[1] + ", " + numeros[2]);

        // Acceso y suma de elementos del array
        int suma = sumaArray(numeros);
        System.out.println("Suma de los elementos del array: " + suma);

        // Mostrar la longitud del array
        System.out.println("Longitud del array: " + numeros.length);

        // Modificación de un array dentro de un método
        System.out.println("Valor original del primer elemento: " + numeros[0]);
        modificaElementoArray(numeros);
        System.out.println("Valor modificado del primer elemento: " + numeros[0]);
        }

        // Método para sumar los elementos de un array
        public static int sumaArray(int[] array) {
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
        suma += array[i];
        }
        return suma;
        }

        // Método que modifica un elemento de un array
        public static void modificaElementoArray(int[] array) {
        array[0]++; // Incrementa el primer elemento del array
        }
        }



    
