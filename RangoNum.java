package rangonum;
import java.util.Scanner;
public class RangoNum {
    public static void main(String[] args) {
     Scanner ent=new Scanner(System.in);
      int min,max,contador=0; 
        System.out.println("diga el valor minimo");
        min=ent.nextInt();
        System.out.println("diga el valor maximo");
        max=ent.nextInt();
      for(int i=min;i<=max;i++){
          if(i%10==2){
              contador++;
          }
          else if(i%10==6){
              contador++;
             
          }
          else if(i%10==3){
              contador++;
              
          }
          
      }
     System.out.println("cantidad de numeros es "+contador);
      }
          
        
    
}
