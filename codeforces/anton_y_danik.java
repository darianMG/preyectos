package codeforces;
import java.util.Scanner;
public class anton_y_danik {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        int contador_a=0;
        int contador_d=0;
        for (int i = 0; i < n; i++) {
            if(s.charAt(i)=='A'){
         contador_a++;
        }else{
                contador_d++;
            }
            
        }
        if(contador_a>contador_d){
            System.out.println("Anton");
        }else if(contador_d>contador_a){
            System.out.println("Danik");
        }else{
            System.out.println("Friendship");
        }
    }
    
}
