package JavaProMax.StringHandling;

import java.util.Scanner;

public class CharCount {
    public static void main(String[] args) {

        // Program to count total number of character in String :=>
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :> ");
        String str_toCount = sc.nextLine();
        int char_count = 0;
        for (int i = 0; i < str_toCount.length(); i++) {
            if (str_toCount.charAt(i) == ' ') {
                continue;
            } else {
                char_count += 1;
            }

        }
        System.out.println("The total character in the string excluding the whitespace is : > " + char_count);
        sc.close();
    }

}
