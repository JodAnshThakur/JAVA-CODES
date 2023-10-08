/*
 * GOOGLE QUES :-> Given an array arr of n integers where arr[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in arr.
 */

package SORTING.CYCLE_SORT.INTERVIEW_QUESTIONS;

import java.util.Arrays;

public class FindingNStoringMissNO_GOOGLE_QUES {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 6, 8, 9 };
        int[] missing_ele = new int[3];
        missing_NO(arr, missing_ele);
    }

    static void missing_NO(int[] arr, int[] missing_ele) {
        int missing_no = 0;
        int missing_ele_index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (i != arr[i]) {
                missing_no = i;
                missing_ele[missing_ele_index] = missing_no;
                missing_ele_index++;
                i++;
            }
        }
        System.out.println(Arrays.toString(missing_ele));
    }
}
