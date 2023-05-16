/*Guia aprendizaje 13
ejercicio 3
*/
package suma_valores_divisible_por_a;

import java.util.Scanner;


public class Suma_valores_divisible_por_A {
  public static void main(String[] args) {
      
        int[] fibonacci = {1, 1, 2, 3, 5, 8, 13, 21, 34, 54};
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el valor de A: ");
        int a = sc.nextInt();

        int suma = 0;
        for (int i = 0; i < fibonacci.length; i++) {
            if (fibonacci[i] % a == 0) {
                suma += fibonacci[i];
            }
        }
        System.out.println("La suma de los valores del arreglo que son divisibles por " + a + " es: " + suma);
    }

    
}
