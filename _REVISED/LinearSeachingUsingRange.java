package _REVISED;

import java.util.Scanner;

public class LinearSeachingUsingRange {
    public static void main(String[] args) {
        int[] arr = { 21, 87, 64, 95, 37, 95, 24, 61, 58, 36, 97 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target element :--> ");
        int target = sc.nextInt();
        System.out.println("Enter the starting range :--> ");
        int start_index = sc.nextInt();
        System.out.println("Enter the ending range :--> ");
        int end_index = sc.nextInt();
        sc.close();
        for (int i = start_index; i <= end_index; i++) {
            if (arr[i] == target) {
                System.out.println("Element found at --> " + i);
            } else {
                System.out.println("Element not found.");
            }
        }
    }
}
