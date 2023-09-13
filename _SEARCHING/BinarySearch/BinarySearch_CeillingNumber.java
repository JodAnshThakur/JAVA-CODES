package _SEARCHING.BinarySearch;

import java.util.Scanner;

public class BinarySearch_CeillingNumber {
    public static void main(String[] args) {
        int[] arr = { 12, 89, 96, 99, 123, 158, 700 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose ceiling you are looking for:---> ");
        int target = sc.nextInt();
        int target_ceilValue = CeilingValue_OfTarget(arr, target);
        System.out.println(target_ceilValue);
        sc.close();
    }

    static int CeilingValue_OfTarget(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return arr[mid];
            }
        }
        return arr[start];
    }

}
