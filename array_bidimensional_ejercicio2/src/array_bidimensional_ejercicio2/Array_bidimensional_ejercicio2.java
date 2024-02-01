/*
Ejercicio 2 array bidimensional
Enunciado 2: Matriz de Temperaturas
Objetivo: Trabajar con una matriz de temperaturas registradas durante varios días.

Descripción:

Crea una matriz temperaturas de 7x2 para almacenar las temperaturas máximas y mínimas registradas durante una semana.
Llena la matriz con datos aleatorios (por ejemplo, temperaturas entre 10 y 30 grados Celsius).
Calcula y muestra la temperatura media de la semana y la temperatura máxima y mínima registradas.
Sugerencias de Implementación: Para generar temperaturas aleatorias, puedes usar la función Math.random() y luego ajustar el rango y el tipo de dato según sea necesario.
 */
package array_bidimensional_ejercicio2;

/**
 *
 * @author Adrian
 */
public class Array_bidimensional_ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creando la matriz temperaturas
        int Temperaturas[][] = new int [7][2];
        float TemperaturaMedia;
        float SumaTemperaturas = 0;
        
        // Imprimiendo la matriz
        for (int i = 0; i < Temperaturas.length; i++) {
        for (int j = 0; j < Temperaturas[i].length; j++) {
        Temperaturas[i][j] = (int) (Math.random() * (30-10) + 10); 
        System.out.print(Temperaturas[i][j] + "ºC ");
        
        SumaTemperaturas += Temperaturas[i][j];
        }
        System.out.println();
        }
        
        //Calculo y muestro la temperatura media
        TemperaturaMedia = SumaTemperaturas /(Temperaturas.length*2);
        System.out.println("Temperatura media: "+TemperaturaMedia+" ºC");
        
        //Temperatura mas alta
        //int supernumero= Math.max(Temperaturas.length, Temperaturas[i].length);
        int mayor=0;                
        for (int i = 0; i > Temperaturas.length; i++) {
        for (int j = 0; j > Temperaturas[i].length; j++) {
                if(Temperaturas[i][j]>mayor) {
                mayor=Temperaturas[i][j];
                }
            }
        }

        System.out.println("La temperatura mas baja fue: "+mayor);
                
        //Temperatura mas baja
        int menor=0;                
        for (int i = 0; i < Temperaturas.length; i++) {
        for (int j = 0; j < Temperaturas[i].length; j++) {
                if(Temperaturas[i][j]<menor) {
                menor=Temperaturas[i][j];
                }
            }
        }
        System.out.println("La temperatura mas baja fue: "+menor);
        
        
    }
    
}
