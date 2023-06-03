package poliedros;

import java.util.Scanner;

public class Poliedros {
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc =new Scanner(System.in);
    int n= sc.nextInt();
    int totalFaces=0;
    for(int i=0;i<n;i++){
        String polyhedron=sc.next();
        switch(polyhedron){
            
            case "Tetrahedron":
                totalFaces+=4;
                break;
                case "Cube":
                totalFaces+=6;
                break;
            case "Octahedron":
                totalFaces+=8;
            break;    
            case"Dodecahedron":
                totalFaces+=12;
                break;
                case "Icosahedron":
                    totalFaces+=20;
                    break;
        }
    }
        System.out.println(totalFaces);
    }
    
}