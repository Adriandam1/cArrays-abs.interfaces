/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package accesoarray;

import java.util.Random;
 

public class AccesoArray {

    public static void main(String[] args) {

        String[] array = {"uno", "dos", "tres", "cuatro", "cinco"};

        Random random = new Random();

        boolean exito = false;

 

        while (!exito) {

            try {

                int i = random.nextInt(10); // Genera un índice aleatorio de 0 a 9

                System.out.println(array[i]); // Intenta acceder al elemento del array

                exito = true; // Si no hay error, cambia la bandera a true para salir del bucle

            } catch (ArrayIndexOutOfBoundsException e) {

                System.out.println("Índice fuera de rango. Intentando de nuevo...");

                // No hace falta hacer nada más aquí, el bucle volverá a intentarlo

            }

        }

    }

}