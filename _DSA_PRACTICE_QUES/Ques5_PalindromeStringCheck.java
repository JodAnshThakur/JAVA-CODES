package _DSA_PRACTICE_QUES;

import java.util.Scanner;

public class Ques5_PalindromeStringCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string to check whether it is Palindrome or Not :--> ");
        String check = sc.next();
        boolean palindrome_check = false;
        sc.close();
        for (int i = 0; i < check.length(); i++) {
            if (check.charAt(i) == check.charAt(check.length() - i - 1)) {
                palindrome_check = true;
            } else {
                palindrome_check = false;
                break; // one mismatch should make the boolean false to return not a palindrome
                       // string.
            }
        }
        if (palindrome_check == true) {
            System.out.println("The entered string is a Palindrome.");
        } else {
            System.out.println("The entered string is not  Palindrome.");
        }
    }
}