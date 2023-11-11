package _REVISED;

import java.util.Scanner;

public class ForEach_LinearSeach {
    public static void main(String[] args) {
        int[] arr = { 21, 87, 64, 95, 37, 95, 24, 61, 58, 36, 97 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to be searched :-->");
        int target = sc.nextInt();
        int check_result = 0;
        for (int search : arr) {
            if (search == target) {
                check_result = 1;
            }
        }
        if (check_result == 1) {
            System.out.println("Found.");

        } else if (check_result == 0) {
            System.out.println("Not Found.");
        }
        sc.close();
    }

}
