package _DSA_PRACTICE_QUES;

import java.util.Scanner;

/*
 * Java Program to find the multiple from 1 to given number.
*/

public class Ques4_FindingMultipleTillGivenNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter last number :");
        int num = sc.nextInt();
        int multiple = 1;
        sc.close();

        for (int i = 1; i <= num; i++) {
            multiple *= i;
        }
        System.out.println("The multiple from 1 to " + num + " is:-> " + multiple);
    }

}
