package _DSA_PRACTICE_QUES;

import java.util.Scanner;

/*
 * Java Program to find the sum from 1 to given number.
 */

public class Ques3_FindingSumTillGivenNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter last no :");
        int num = sc.nextInt();
        int sum = 0;
        sc.close();

        for (int i = 1; i <= num; i++) {
            sum = sum + i;
        }
        System.out.println("The sum from 1 to " + num + " is:-> " + sum);
    }
}
