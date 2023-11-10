package _REVISED;

import java.util.Scanner;

public class CountingDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number :");
        int num = sc.nextInt();
        int count = 0;
        sc.close();
        while (num > 0) {
            count++;
            num = num / 10;
        }
        System.out.println(count);

    }

}
