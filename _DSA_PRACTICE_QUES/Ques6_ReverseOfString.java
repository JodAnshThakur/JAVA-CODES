package _DSA_PRACTICE_QUES;

import java.util.Scanner;

public class Ques6_ReverseOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any String to find its reverse :--> ");
        String check = sc.nextLine();
        sc.close();

        for (int i = check.length() - 1; i >= 0; i--) {
            System.out.print(check.charAt(i));
        }
    }
}
