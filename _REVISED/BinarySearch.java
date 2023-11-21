package _REVISED;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 10, 11, 22, 45, 78, 98, 102, 154, 657 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to be searched :-->");
        int target = sc.nextInt();
        sc.close();
        int target_index = BinarySearchAlgo(arr, target);
        System.out.println(target_index);
    }

    static int BinarySearchAlgo(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
