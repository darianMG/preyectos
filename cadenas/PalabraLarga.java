
package palabralarga;
 
import java.util.Scanner;


public class PalabraLarga {
   public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
       System.out.println("cantidad de letras");
     int n= sc.nextInt();
     sc.nextLine();
     for (int i=0;i<n;i++){
         System.out.println("diga una palabra");
         String palabra= sc.nextLine();
         if(palabra.length()>10){
             char primeraLetra= palabra.charAt(0);
             char ultimaLetra= palabra.charAt(palabra.length()-1);
             int contador=palabra.length()-2;
             System.out.println(primeraLetra+Integer.toString(contador)+ultimaLetra);
         }else{
             System.out.println(palabra);
         }
     
           }
   }
    
}
