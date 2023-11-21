package _REVISED;

import java.util.Scanner;

public class BinarySearch_Desc {
    public static void main(String[] args) {
        int[] arr = { 657, 102, 89, 87, 42, 65, 32, 14, 2 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to be searched :-->");
        int target = sc.nextInt();
        sc.close();
        int target_index = BinarySearchAlgo_Desc(arr, target);
        System.out.println("Element is found at index :--> " + target_index);
    }

    public static int BinarySearchAlgo_Desc(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                end = mid - 1;
            } else if (arr[mid] > target) {
                start = mid + 1;
            } else {
                return mid;
            }

        }
        return -1;
    }
}
