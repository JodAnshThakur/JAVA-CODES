package _SEARCHING.BinarySearch;

import java.util.Scanner;

/*
   * What if the array is sorted in Descending Order then some algo will change.
 */
public class BinarySearch_DescendingOrder {
    public static void main(String[] args) {
        int[] arr = { 125, 86, 82, 72, 64, 53, 49, 37, 28, 13, 4, 0, -99, -125 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Element to be Searched :->");
        int target = sc.nextInt();
        int target_index = BinarySearch_Descending(arr, target);
        System.out.println("The element is present at the index :--> " + target_index);
        sc.close();

    }

    static int BinarySearch_Descending(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) { // In descending order array if the target element is less than the mid
                // element then the target element will lie on the right side as it is in de
                // ending order so we have change the start value..
                start = mid + 1;
            } else if (target > arr[mid]) { // In descending order array if the target element is greator than the
                // element then the target element will lie on the right side as it is in
                // desending order so we have change the end value..
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
