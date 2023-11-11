package _REVISED;

import java.util.Scanner;

public class LinearSeaching {
    public static void main(String[] args) {
        int[] arr = { 21, 87, 64, 95, 37, 95, 24, 61, 58, 36, 97 };
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element :-> ");
        int target = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Element found at index no : " + i);
            }
        }

    }

}
