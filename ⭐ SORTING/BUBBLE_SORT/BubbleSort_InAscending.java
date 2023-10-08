package SORTING.BUBBLE_SORT;

import java.util.Arrays;

public class BubbleSort_InAscending {
    public static void main(String[] args) {

        int[] arr = { 15, 89, 789, 0, 15, 348, 952, 62 };
        BubbleSort_AscendingAlgo(arr);
        System.out.println(Arrays.toString(arr));
    }
    // ------------Check working ALGORITHM in how it works-----------//

    static void BubbleSort_AscendingAlgo(int[] arr) {

        for (int i = 0; i < arr.length; i++) { // Loop to access and arrange element one by one
            // boolean swapped = false; // For checking whether the swapping takes place or
            // not
            for (int j = 1; j < arr.length - i; j++) { // Loop to check elements and swap them if neccessary
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    // swapped = true; // This means that swapping is done b/w some element?\
                }
            }
        }

    }
}
