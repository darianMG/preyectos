

package pesos_persona;

import java.util.Scanner;


public class Pesos_persona {

    
    public static void main(String[] args) {
     double peso;
     Scanner ent =new Scanner(System.in);
        System.out.println("diga el peso kg");
       peso=ent.nextDouble();
       if(peso<50){
        System.out.println("La persona es muy delgada");}   
        else if (peso>50&&peso<60){
            System.out.println("la persona es delgada");
          }else if(peso>60&&peso<80){
              System.out.println("la persona esta en el peso ideal");
          }
          else{
              System.out.println("la persona es obesa");
              
      
        
          }}}
    

