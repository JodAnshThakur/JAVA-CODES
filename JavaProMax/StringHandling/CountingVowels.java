package JavaProMax.StringHandling;

import java.util.Scanner;

public class CountingVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any String:--> ");
        String to_check = sc.nextLine();
        to_check = to_check.toLowerCase();
        sc.close();
        int count = 0;
        for (int i = 0; i < to_check.length(); i++) {
            if (to_check.charAt(i) == 'a' || to_check.charAt(i) == 'e' || to_check.charAt(i) == 'i'
                    || to_check.charAt(i) == 'o' || to_check.charAt(i) == 'u') {
                count++;
            }
        }
        System.out.println("Total vowels in the string are --> " + count);
    }

}
