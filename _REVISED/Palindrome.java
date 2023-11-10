package _REVISED;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string or digit to check Whether it is Palindrome or not :-> ");
        String check = sc.next();

        sc.close();
        boolean result = palindrome(check);
        if (result == true) {
            System.out.println("This is  palindrome ");
        } else {
            System.out.println("This is not palindrome.");
        }
    }

    static boolean palindrome(String check) {
        boolean result = false;
        for (int i = 0; i < check.length(); i++) {
            if (check.charAt(i) == check.charAt(check.length() - i - 1)) {
                result = true;
            } else {
                result = false;
            }
        }
        return result;

    }

}
