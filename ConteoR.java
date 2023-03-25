/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package conteor;

import java.util.Scanner;

/**
 *
 * @author darkai
 */
public class ConteoR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int tiempo;
      Scanner ent = new Scanner(System.in);  
      System.out.println("diga el tiempo");
        tiempo=ent.nextInt();
        while(tiempo>0){
           System.out.println(tiempo+" segundos");    
        tiempo--;
        }
        
    }
    
}
