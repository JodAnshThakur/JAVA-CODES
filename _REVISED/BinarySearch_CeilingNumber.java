package _REVISED;

import java.util.Scanner;

public class BinarySearch_CeilingNumber {
    public static void main(String[] args) {
        int[] arr = { 10, 11, 22, 45, 78, 98, 102, 154, 657 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to be searched :-->");
        int target = sc.nextInt();
        sc.close();
        int target_value = BinarySearchAlgo_Ceil(arr, target);
        System.out.println(target_value);
    }

    static int BinarySearchAlgo_Ceil(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                return arr[mid];
            }
        }
        return arr[start];

    }
}
