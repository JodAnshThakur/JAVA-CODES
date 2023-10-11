package _DSA_PRACTICE_QUES;

import java.util.Scanner;

public class Ques2_PrimeorNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = sc.nextInt();
        boolean check = false;
        sc.close();
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                check = false;
            } else {
                check = true;
            }
        }
        if (check != false) {
            System.out.println("Prime number.");
        } else {
            System.out.println("Not a prime number.");
        }
    }

}
