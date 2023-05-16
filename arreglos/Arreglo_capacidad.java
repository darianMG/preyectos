/*Guia de aprendizaje no 12
* Ejercicio 3
*/
package arreglo_capacidad;

import java.util.Scanner;

public class Arreglo_capacidad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la capacidad del arreglo: ");
        int capacidad = scanner.nextInt();
        int[] arreglo = new int[capacidad];
        
        for (int i = 0; i < capacidad; i++) {
            System.out.print("Ingrese el valor " + (i+1) + " del arreglo: ");
            arreglo[i] = scanner.nextInt();
        }
        
        System.out.println("El arreglo ingresado es:");
        for (int i = 0; i < capacidad; i++) {
            System.out.print(arreglo[i] + " ");
        }
    }
}