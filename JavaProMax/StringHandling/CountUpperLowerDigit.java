package JavaProMax.StringHandling;

import java.util.Scanner;

public class CountUpperLowerDigit {
    public static void main(String[] args) {

        // Program to count total UpperCase, LowerCase, Digits in the String :=>

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to check :=>");
        String to_check = sc.nextLine();
        int char_count = 0;
        int Upper_count = 0;
        int lower_count = 0;
        int digit_count = 0;
        int to_check_len = to_check.length();

        for (int i = 0; i < to_check_len; i++) {
            if (to_check.charAt(i) == ' ') {
                continue;
            } else if (to_check.charAt(i) != ' ') {
                char_count += 1;
            } else if (to_check.charAt(i) <= 'A' & to_check.charAt(i) >= 'Z') {
                Upper_count += 1;
            } else if (to_check.charAt(i) <= 'a' & to_check.charAt(i) >= 'z') {
                lower_count += 1;
            } else if (to_check.charAt(i) >= 0 & to_check.charAt(i) <= 9) {
                digit_count += 1;
            }
        }
        System.out.println("Total numbers of character in the string excluding digits :=>" + char_count);
        System.out.println("Total numbers of UpperCase characters in the string is :=> " + Upper_count);
        System.out.println("Total number of Lowercase Characters in the string is :=>" + lower_count);
        System.out.println("Total number of digit in the string are :=>" + digit_count);
        sc.close();

    }

}
