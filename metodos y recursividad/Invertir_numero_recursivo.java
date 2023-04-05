

package invertir_numero_recursivo;

import java.util.Scanner;


public class Invertir_numero_recursivo {

 
    public static void main(String[] args) {
       int n;
       Scanner ent = new Scanner(System.in);
        System.out.println("diga el valor de N");
        n=ent.nextInt();
        
        System.out.println("el numero invertido es "+invertirNumero(n));
    }
    public static int invertirNumero(int num) {
        if (num < 10) {
            return num;
        } else {
            int ultimoDigito = num % 10;
            int resto = num / 10;
            int nInvertido = invertirNumero(resto);
            int longitud = (int) Math.log10(num) + 1;
            return ultimoDigito * (int) Math.pow(10, longitud - 1) + nInvertido;
    }
}
}