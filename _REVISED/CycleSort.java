package _REVISED;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = { 5, 1, 3, 2, 4, };
        CycleSortOP(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void CycleSortOP(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int index_val = arr[i] - 1;
            if (arr[i] != arr[index_val]) {
                swap(arr, i, index_val);
            } else {
                i++;
            }
        }

    }

    static void swap(int[] arr, int i, int index_val) {
        int temp = arr[i];
        arr[i] = arr[index_val];
        arr[index_val] = temp;
    }

}
