package _REVISED;

import java.util.Arrays;

public class InsertionSort_Algo {
    public static void main(String[] args) {
        int[] arr = { 15, 89, 789, 0, 15, 348, 952, 62 };
        InsertionSort_Algo_op(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void InsertionSort_Algo_op(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                }
            }
        }
    }

    static void swap(int[] arr, int small, int big) {
        int temp = arr[small];
        arr[small] = arr[big];
        arr[big] = temp;
    }

}
