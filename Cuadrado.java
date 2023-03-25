package cuadrado;

import java.util.Scanner;

public class Cuadrado {

    public static void main(String[] args) {
     Scanner ent= new Scanner(System.in);
      int valor;
       System.out.println("diga el valor");
        valor=ent.nextInt();
         for (int fila = 1; fila <= valor; fila++) {
          for (int columna = 1; columna <= valor; columna++)
	   System.out.print("*");
	    System.out.println();
            }
        }
    }
    

