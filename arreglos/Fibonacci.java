/*guia de aprendizaje 12
* Ejercicio no 2
*/

package fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int[] fibonacci = new int[10];
        Scanner scanner = new Scanner(System.in);
        
      
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el valor " + (i+1) + " de la sucesión de Fibonacci: ");
            fibonacci[i] = scanner.nextInt();
        }
        System.out.println("Los 10 primeros valores de la sucesión de Fibonacci son:");
        for (int i = 0; i < 10; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }
}