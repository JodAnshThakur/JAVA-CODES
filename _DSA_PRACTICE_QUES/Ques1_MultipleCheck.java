package _DSA_PRACTICE_QUES;

import java.util.Scanner;
/*
 * JAVA PROGRAM TO CHECK WHETHER THE GIVEN NUMBER IS A MULTIPLE OF 3 and 5
 */

public class Ques1_MultipleCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("Yes! the given number is a multiple of 3 and 5.");

        }
        sc.close();
    }
}
