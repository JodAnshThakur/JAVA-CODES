package SORTING.SELECTION_SORT;

import java.util.Arrays;

public class SelectionSort_Algo {
    public static void main(String[] args) {
        int[] arr = { 12, 87, 0, 41, 63 };
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int max_index = arr.length - i - 1;
            int max_element_index = getMax(arr, 0, max_index);
            swap(arr, max_element_index, max_index);
        }
    }

    static int getMax(int[] arr, int start, int end) {
        int max_element_index = start;
        for (int i = start; i < end; i++) {
            if (arr[max_element_index] < arr[i]) {
                max_element_index = i;
            }
        }
        return max_element_index;
    }

    static void swap(int[] arr, int max_element_index, int max_index) {
        int temp = arr[max_element_index];
        arr[max_element_index] = arr[max_index];
        arr[max_index] = temp;
    }

}
