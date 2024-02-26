package _REVISED;

import java.util.Arrays;

public class SelectionSort1 {
    public static void main(String[] args) {
        int[] arr = { 14, 55, 78, 1, 4, 0, 35, 41, 89 };
        Selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Selection(int[] arr) {
        int max_index = 0;
        for (int i = 0; i < arr.length; i++) {
            max_index = arr.length - 1 - i;
            int max_ele_index = getMax_Element_index(arr, 0, max_index);
            swap(arr, max_index, max_ele_index);
        }

    }

    static int getMax_Element_index(int[] arr, int start, int max_index) {
        int max_ele_index = 0;
        for (int i = 0; i < start; i++) {
            if (arr[max_ele_index] < arr[i]) {
                max_ele_index = i;
            }
        }
        return max_ele_index;
    }

    static void swap(int[] arr, int max_index, int max_ele_index) {
        int temp = max_index;
        arr[max_index] = arr[max_ele_index];
        arr[max_ele_index] = temp;
    }

}
