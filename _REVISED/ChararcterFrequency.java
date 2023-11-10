package _REVISED;

import java.util.Scanner;

public class ChararcterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String :");
        String to_check = sc.nextLine();
        System.out.println("Enter the char whose frequency you want to count :->");
        String to_checkFreqency = sc.next();
        sc.close();
        int count = 0;
        for (int i = 0; i < to_check.length(); i++) {
            if (to_check.charAt(i) == to_checkFreqency.charAt(0)) {
                count++;
            }
        }
        System.out.println("Total frequency of the string is :--> " + count);

    }

}
