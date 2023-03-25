package potencia;

import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        int numero;
        int potencia;
        Scanner ent= new Scanner(System.in);
        System.out.println("diga un numero");
        numero=ent.nextInt();
        while(numero<=42){
            potencia=numero*numero;
             System.out.println("la potencia es "+potencia);
             
                 System.out.println("digite otro numero"); 
               numero=ent.nextInt();  

        }
   
    }
    
}
