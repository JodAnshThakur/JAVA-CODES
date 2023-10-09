package _REVISED;

import java.util.Arrays;

public class BubbleSort_DESC_ALGO {
    public static void main(String[] args) {
        int[] arr = { 45, 121, 127, 700, 753, 862, 1000, 1054 };
        BubbleSort_DESC_ALGOOP(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void BubbleSort_DESC_ALGOOP(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] > arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
}
