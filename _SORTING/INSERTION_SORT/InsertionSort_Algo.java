package _SORTING.INSERTION_SORT;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort_Algo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many elements you want to enter in the array :-->");
        int arr_len = sc.nextInt();
        int[] arr = new int[arr_len];

        for (int i = 0; i < arr_len; i++) {
            System.out.println("Enter the element for index " + i + " :->");
            arr[i] = sc.nextInt();

        }
        sc.close();
        Insertionsort_Algo(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Insertionsort_Algo(int[] arr) {
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
