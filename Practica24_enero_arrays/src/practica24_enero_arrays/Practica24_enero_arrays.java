/*
1. **Creacion de un array**: Crear un array de enteros.
2. **Busqueda de un elemento**: Busca un elemento en el array. Arrays.binarySearch
3. **Ordenacion del Array**: Ordena el array. Arrays.sort
4. **Busqueda con la clase Arrays**: Busca nuevamente el elemento en el array ordenado.
5. **Borrado de un elemento**: Borrar un elemento del array.
 */
package practica24_enero_arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class Practica24_enero_arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        //Bucle for para introducir valores en el Array
        for (int i = 0; i < numeros.length; i++){        
        System.out.print("Introduce los valores del array: ");
        numeros[i] = Integer.parseInt(sc.nextLine());}
        System.out.println("Valores del array: "+Arrays.toString(numeros));
        
        //Busqueda del elemento en la posicion 3 del array
        System.out.println("Valor 3 esta en la posicion: "+Arrays.binarySearch(numeros,3));
        
        //------------
        //binarySearch solo funciona con arrays ORDENADOR
        //------------
        
       //Ordenacion de un Array siguientes 2 lineas
        Arrays.sort(numeros);
        System.out.println("Valores del array ordenador de menor a mayor: "+Arrays.toString(numeros));
        
        //Busqueda del elemento en la posicion 4 del array
        System.out.println("Valor 4 esta en la posicion: "+Arrays.binarySearch(numeros,4));
        
    } /*
        static int buscarElemento (int[] array, int valor){
            for (int i =0; i< array.length; i++){
                if (array[i] == valor){
                    return i; // Elemento encontrado
                }
            }
            return -1; // Elemento no encontrado
        }   */    
    
    
}
