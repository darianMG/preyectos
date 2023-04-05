

package invertirNumero;

import java.util.Scanner;


public class invertirNumero {

 
    public static void main(String[] args) {
       int n;
       Scanner ent = new Scanner(System.in);
        System.out.println("diga el valor de N");
        n=ent.nextInt();
        System.out.println("el numero invertido es "+numeroInvertido(n));
    }
     public static int numeroInvertido(int n){
        int invertido=0;
         while(n>0){
        int resto=n%10;
        invertido =invertido*10+resto;
         n/=10;
} 
    return invertido;
}
}