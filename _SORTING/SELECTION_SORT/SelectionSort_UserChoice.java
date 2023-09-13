package _SORTING.SELECTION_SORT;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort_UserChoice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elemennt you want to enter in the array :->");
        int arr_len = sc.nextInt();
        int[] arr = new int[arr_len];
        for (int i = 0; i < arr_len; i++) {
            System.out.println("Enter the element to be at index  " + i + ":-> ");
            arr[i] = sc.nextInt();
        }
        sc.close();

        for (int i = 0; i < arr.length; i++) {
            int max_index = arr.length - i - 1;
            int max_ele_index = getMax_eleIndex(arr, 0, max_index);
            swap(arr, max_index, max_ele_index);
        }
        System.out.println("The sorted array :--> " + Arrays.toString(arr));

    }

    static int getMax_eleIndex(int[] arr, int start, int end) {
        int max_ele_index = start;
        for (int i = start; i < end; i++) {
            if (arr[max_ele_index] > arr[i]) {
                max_ele_index = i;
            }
        }
        return max_ele_index;
    }

    static void swap(int[] arr, int max_index, int max_ele_index) {
        int temp = max_index;
        max_index = max_ele_index;
        max_ele_index = temp;

    }
}