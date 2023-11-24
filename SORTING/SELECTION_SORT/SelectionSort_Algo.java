package SORTING.SELECTION_SORT;

import java.util.Arrays;

public class SelectionSort_Algo {
    public static void main(String[] args) {
        int[] arr = { 12, 87, 0, 41, 63 };
        SelectionSort_op(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void SelectionSort_op(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int max_index = arr.length - 1 - i;
            int max_ele_index = get_max(arr, 0, max_index);
            swap(arr, max_ele_index, max_index);
        }
    }

    static int get_max(int[] arr, int start, int max_index) {
        int max_ele_index = start;
        for (int i = start; i <= max_index; i++) {
            if (arr[max_ele_index] < arr[i]) {
                max_ele_index = i;
            }
        }
        return max_ele_index;
    }

    static void swap(int[] arr, int max_ele_index, int max_index) {
        int temp = arr[max_ele_index];
        arr[max_ele_index] = arr[max_index];
        arr[max_index] = temp;
    }
}
