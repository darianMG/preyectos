package unapalabra;

import java.util.Scanner;

public class UnaPalabra {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("diga una palabra");
    String palabra=sc.nextLine();
    int contadorMi=0;
    int contadorMa=0;
    for(int i=0;i<palabra.length();i++){
        char letra=palabra.charAt(i);
        if(Character.isUpperCase(letra)){
            contadorMa++;
      
        }else{
            contadorMi++;
        }        
         }
          if(contadorMa>contadorMi){
              System.out.println(palabra.toUpperCase());
          }else{
              System.out.println(palabra.toLowerCase());
          }
          
    }
    
}
