/* Guia aprendizaje 13
Ejercicio 2
*/

package suma_valores_entre_a_b;

import java.util.Scanner;

public class Suma_valores_entre_A_B {

    public static void main(String[] args) {

        int [] fibonacci = { 1, 1, 2, 3, 5, 8, 13, 21, 34, 54 } ;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el valor de A (entre 1 y 10): ");
        int a = scanner.nextInt();

        System.out.print("Introduce el valor de B (entre 1 y 10): ");
        int b = scanner.nextInt();

        if (a >= 1 && a <= 10 && b >= 1 && b <= 10) {
            int suma = 0;
            for (int i = a-1; i < b; i++) {
                suma += fibonacci[i];
            }
            System.out.println("La suma de los elementos entre las posiciones " + a + " y " + b + " es: " + suma);
        } else {
            System.out.println("Posiciones fuera del rango valido del arreglo");
        }
    }
}
    
    
