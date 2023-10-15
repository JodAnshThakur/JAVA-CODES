package _DSA_PRACTICE_QUES;

import java.util.Scanner;

public class Ques2_PrimeorNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int num = sc.nextInt();
        boolean check = false;
        sc.close();

        if (num == 1 || num == 0 || num < 0) {
            System.out.println("This is not a Prime Number.");
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    check = false;
                } else {
                    check = true;
                }
            }
            if (check == true) {
                System.out.println("Prime");
            } else {
                System.out.println("Not a prime.");
            }
        }
    }

}
