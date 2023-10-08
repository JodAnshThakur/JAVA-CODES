package SORTING.BUBBLE_SORT;

import java.util.Arrays;

public class BubbleSort_InDescending {
    public static void main(String[] args) {
        int[] arr = { 15, 86, 78, 25, 95, 750, 82, 36, 4 };
        BubbleSort_DescendingAlgo(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void BubbleSort_DescendingAlgo(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean sorted = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] > arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    sorted = true;
                }
            }
            if (sorted == false) {
                break;
            }
        }
    }

}
