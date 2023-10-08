package _SEARCHING.BinarySearch;

import java.util.Scanner;

public class BinarySearch_FloorNumber {
    public static void main(String[] args) {
        int[] arr = { 12, 89, 96, 99, 123, 158, 700 };
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. whose floor value you want :-->");
        int target = sc.nextInt();
        int target_floorvalue = BinarySearch_FloorNoOP(arr, target);
        System.out.println("The floor value is :--> " + target_floorvalue);
        sc.close();
    }

    static int BinarySearch_FloorNoOP(int[] arr, int target) {
        int start = 0;
        int end = arr.length;

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
        return arr[end];
    }
}
