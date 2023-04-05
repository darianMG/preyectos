
package retronanumerodoble;

import java.util.Scanner;

public class RetronaNumeroDoble {

    public static void main(String[] args) {
       Scanner ent=new Scanner(System.in);
       int a,b,result;
        System.out.println("diga el numero a duplicar A");
        a=ent.nextInt();
        System.out.println("diga el numero a duplicar b");
        b=ent.nextInt();
        result=sumaNumeroDuplica(a,b);
        System.out.println("el ressultado es "+result);
    }
    public static int sumaNumeroDuplica(int a,int b){
        int suma;
        suma=a+b;
        return suma*2;
    }
}
