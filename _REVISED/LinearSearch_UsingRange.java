package _REVISED;

import java.util.Scanner;

public class LinearSearch_UsingRange {
    public static void main(String[] args) {
        int[] arr = { 21, 87, 64, 95, 37, 95, 24, 61, 58, 36, 97 };
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element to be searched :--> ");
        int target = sc.nextInt();
        System.out.print("Enter the Starting index:--> ");
        int start_index = sc.nextInt();
        System.out.print("Enter the ending index:--> ");
        int end_index = sc.nextInt();
        LS_rangeSearch(arr, target, start_index, end_index);
        sc.close();
    }

    static void LS_rangeSearch(int[] arr, int target, int start_index, int end_index) {
        int target_index = -1;
        for (int i = start_index; i <= end_index; i++) {
            if (arr[i] == target) {
                target_index = i;
            }
        }
        System.out.println(target_index);
    }
}
