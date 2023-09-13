/*
 *  Program to check wheather the string given by the user is Palindrome or not.
 */
package JavaProMax.Fun_Meth;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        boolean check_Passed = Palindrome_();
        if (check_Passed == true) {
            System.out.println("Dude this string is Palindrome 😀.");
        } else {
            System.out.println("Sadly this string is not palindrome 🥲.");
        }
    }

    static boolean Palindrome_() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String to check Wheather it is Palindrome or not :=> ");
        String to_check = sc.nextLine();
        boolean Palindrome_check = true;
        int str_to_check_len = to_check.length();

        for (int i = 0; i < str_to_check_len; i++) {
            if (to_check.charAt(i) != to_check.charAt((str_to_check_len - 1 - i))) {
                Palindrome_check = false;
            } else {
                Palindrome_check = true;
            }
        }
        sc.close();
        return Palindrome_check;
    }

}
