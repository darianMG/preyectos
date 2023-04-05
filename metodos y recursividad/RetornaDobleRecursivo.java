package retornadoblerecursivo;

import java.util.Scanner;

public class RetornaDobleRecursivo {

    public static void main(String[] args) {
        int a,b;
        Scanner ent = new Scanner(System.in);
        System.out.println("diga el primer numero");
        a=ent.nextInt();
        System.out.println("diga el segundo numero");
        b=ent.nextInt();
        System.out.println("el resultado del numero duplicado es "+suma_duplicada(a,b));
        
    }
    public static int suma_duplicada(int a,int b){
        if( b==0){
         return a*2;    
        }
        else{
            return suma_duplicada(a+1,b-1);
     
        } 
            
    }
}
