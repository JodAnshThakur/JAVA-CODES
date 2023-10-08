package SORTING.CYCLE_SORT.INTERVIEW_QUESTIONS;

import java.util.Arrays;

public class DuplicateEle_MICROSOFTQUES {
    public static void main(String[] args) {
        int[] arr = { 0, 5, 2, 3, 2, 0, 1, 3 };
        int[] duplicate_no = new int[3];
        DuplicateELE(arr, duplicate_no);
        System.out.println(Arrays.toString(duplicate_no));
    }

    static void DuplicateELE(int[] arr, int[] duplicate_no) {
        int duplicate_no_index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    duplicate_no[duplicate_no_index] = arr[j];
                    duplicate_no_index++;
                    i++;
                }
            }
        }
    }

}
