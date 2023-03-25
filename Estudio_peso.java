
package estudio_peso;

import java.util.Scanner;


public class Estudio_peso {
   public static void main(String[] args) {
       Scanner ent = new Scanner(System.in); 
       double peso,imc,talla;
        System.out.println("digite un peso");
         peso=ent.nextDouble();
          System.out.println("digite una estatura");
             talla=ent.nextDouble();
              
             imc=peso/(talla*talla);
               System.out.println("el imc es "+imc);
                   if(imc<16.00){
                       System.out.println("la persona esta muy delgada");
                   } 
                   else if(imc>=16.0&&imc<=18.5){
                       System.out.println("la persona es delgada");
                    }
                   else if(imc>=18.5&&imc<=24.9){
                       System.out.println("la persona esta en su peso ideal");
                       
                   }   
                   else if(imc>=25.0&&imc<=29.9){
                       System.out.println("la persona es obesa");
                   }
                   else{
                       System.out.println("la persona esta en sobrepeso");
                   }
                   }
               }
               
           
           
       

