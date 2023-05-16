package suma_facil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String suma = scanner.nextLine();
        int[] count = new int[4];

        
        for (int i = 0; i < suma.length(); i += 2) {
            int num = Character.getNumericValue(suma.charAt(i));
            count[num]++;
        }

        
        StringBuilder newSum = new StringBuilder();
        for (int i = 1; i <= 3; i++) {
            for (int j = 0; j < count[i]; j++) {
                newSum.append(i);
                newSum.append("+");
            }
        }
        newSum.deleteCharAt(newSum.length() - 1); 

        System.out.println(newSum.toString());
    }
}


