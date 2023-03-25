

package triangulo;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
       int ancho;
        Scanner ent =new Scanner(System.in);
        System.out.println("diga el ancho del triangulo");
        ancho=ent.nextInt();
        for(int i=1;i<=ancho;i++){
            for(int j =1;j<=i;j++){
            System.out.print("* ");
                 
            }
            System.out.println("");
         }
            
    }
    
}
