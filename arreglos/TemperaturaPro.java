
/* Guia Aprendizaje 12
*Ejercicio no 1.
*/

package temperaturapro;

import java.util.Scanner;


public class TemperaturaPro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         double[][] temperaturaPromedio = new double[2][365];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 365; j++) {
                System.out.print("Ingrese la temperatura promedio del día " + (j+1) + " del año " + (i+1) + ": ");
                temperaturaPromedio[i][j] = sc.nextDouble();
            }
        }
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 365; j++) {
                System.out.println("Temperatura promedio del día " + (j+1) + " del año " + (i+1) + ": " + temperaturaPromedio[i][j] + " grados Celsius");
            }
        }
    }
}
