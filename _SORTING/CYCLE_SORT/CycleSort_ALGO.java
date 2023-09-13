package _SORTING.CYCLE_SORT;

import java.util.Arrays;

public class CycleSort_ALGO {
    public static void main(String[] args) {

        int[] arr = { 4, 3, 1, 2, 5, 6 };
        CycleSorting_ALGO(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void CycleSorting_ALGO(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct_index = arr[i] - 1;
            if (arr[i] != arr[correct_index]) {
                swap(arr, i, correct_index);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int i, int correct_index) {
        int temp = arr[i];
        arr[i] = arr[correct_index];
        arr[correct_index] = temp;
    }

}
