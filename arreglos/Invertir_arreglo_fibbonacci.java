/*Guia aprendizaje 13
Ejercicio 4
*/
package invertir_arreglo_fibbonacci;

public class Invertir_arreglo_fibbonacci {

    public static void main(String[] args) {
        int[] fibbonacci = {1, 1, 2, 3, 5, 8, 13, 21, 34, 54};
        int[] invertFibonacci = new int[fibbonacci.length];

        for (int i = 0; i < fibbonacci.length; i++) {
            invertFibonacci[fibbonacci.length - 1 - i] = fibbonacci[i];
        }

        System.out.println("Arreglo fibonacci:");
        for (int i = 0; i < fibbonacci.length; i++) {
            System.out.print(fibbonacci[i] + " ");
        }

        System.out.println("Arreglo invertFibonacci:");
        for (int i = 0; i < invertFibonacci.length; i++) {
            System.out.print(invertFibonacci[i] + " ");
        }
    }
}


    
    

