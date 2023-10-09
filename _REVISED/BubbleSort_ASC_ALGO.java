package _REVISED;

import java.util.Arrays;

public class BubbleSort_ASC_ALGO {
    public static void main(String[] args) {
        int[] arr = { 15, 89, 789, 0, 15, 348, 952, 62 };
        BubbleSort_ALGO_op(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void BubbleSort_ALGO_op(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
}
