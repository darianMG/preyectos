/* Guia aprendizaje 13
Ejercicio 1
*/
package fibonnacisuma;

import java.util.Scanner;


public class FibonnaciSuma {

    public static void main(String[] args) {
        int[] fibonacci = {1, 1, 2, 3, 5, 8, 13, 21, 34, 54};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el valor de A (entre 1 y 10): ");
        int a = scanner.nextInt();

        System.out.println("Introduce el valor de B (entre 1 y 10): ");
        int b = scanner.nextInt();

        if (a >= 1 && a <= 10 && b >= 1 && b <= 10) {
            int suma = fibonacci[a-1] + fibonacci[b-1];
            System.out.println("La suma de los elementos en las posiciones " + a + " y " + b + " es: " + suma);
        } else {
            System.out.println("Posiciones fuera del rango valido del arreglo");
        }
    }
}

