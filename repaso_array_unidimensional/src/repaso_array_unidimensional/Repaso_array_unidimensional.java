/* Enunciado ejercicio:
  1-   Crear Array 'Calificaciones' alamacenar 10 valores enteros
  2-   Llenar con valocres
  3-   Calcular y mostrar la nota media
  4-   Proximamente: Indicar los valores mas altos y mas bajos
 */
package repaso_array_unidimensional;

import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class Repaso_array_unidimensional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int[] calificaciones=new int[10];
            int notamedia = 0;
            
            for (int i = 0; i < calificaciones.length; i++) {
                
            System.out.print("Indique a nota: ");
            calificaciones[i] = sc.nextInt();            
            notamedia += calificaciones[i];
            
            }
            notamedia = notamedia /calificaciones.length;
            
        System.out.println("La nota media es "+notamedia);
    }
           
        
}
