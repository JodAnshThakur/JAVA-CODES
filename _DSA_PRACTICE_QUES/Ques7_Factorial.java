package _DSA_PRACTICE_QUES;

import java.util.Scanner;

/*
 * Finding the factorial of a number --> This is the same program as ques-4
 */
public class Ques7_Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number whose Factorial you want :-->");
        int num = sc.nextInt();
        int factorial = 1;
        sc.close();

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("The Factorial of the given number is " + factorial + ".");
    }

}
