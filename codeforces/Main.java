
package codeforces;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); 
        String s = sc.nextLine();
 
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                set.add(Character.toLowerCase(c));
            }
        }
 
        if (set.size() == 26) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
 
        sc.close();
    }
}

    
    

