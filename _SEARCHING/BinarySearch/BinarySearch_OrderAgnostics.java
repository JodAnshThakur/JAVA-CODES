package _SEARCHING.BinarySearch;

import java.util.Scanner;

/* 
* -----------------------> A L G O R I T H M ----------------------------->
* What we will do when we know that the array is sorted but we dont know in which order  either ascending or descending .
* So we have to know either the array is in ascending or descending order for performing the Binary Search..
-->>
* We will know this by comparing the first and last element.
* Why not first second because if both element will be same we will not be able to compare them so comaprison b/w first and last will be accurate if in this condition they are also equal this means all the element in the array are same as its sorted. 
*/
public class BinarySearch_OrderAgnostics {
    public static void main(String[] args) {

        int[] arr = { 14, -87, -96, -24, -8, 0, 52 }; // Ascending order array.
        // int[] arr = { 72, 64, 53, 49, 37, 28, 13, 4, 0 }; // Descending order array.
        // int[] arr = { 0, 0, 0, 0, 0, 0 }; // Same element array.

        Scanner sc = new Scanner(System.in);
        System.out.println("Element to be Searched :->");
        int target = sc.nextInt();
        int target_index = BinarySearch_OrderAgnostics_AsOrDe(arr, target);
        if (target_index == 0) {
            System.out.println("All the element in the array is same dude!");
        } else {
            System.out.println("The element is present at the index :--> " + target_index);
        }
        sc.close();

    }

    static int BinarySearch_OrderAgnostics_AsOrDe(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        /*
         * Now checking the condition wheather the start > end or start < end -->
         */

        if (arr[start] < arr[end]) { // Ascending order case

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

        } else if (arr[start] > arr[end]) { // Descending order case

            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target < arr[mid]) {
                    start = mid + 1;
                } else if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }

        } else {
            return 0;
        }
        return -1;
    }
}
