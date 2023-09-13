package Lessons.OneD_Arrays;

import java.util.Scanner;

public class MaxRange {
    public static void main(String[] args) {
        /*
         * Program for finding the maximum element between a specific range taken by the
         * user :
         */
        int[] arr = { 12, 56, 78, 98, 32, 12, 84, 54, 98 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Starting range :--> ");
        int start_range = sc.nextInt();
        System.out.println("Enter the ending range :--> ");
        int end_range = sc.nextInt();
        sc.close();
        int max_value = max_range(arr, start_range, end_range);
        System.out
                .println("The maximum element in the array b/w the index range of " + start_range + " and " + end_range
                        + " is--> " + max_value);

    }

    static int max_range(int[] arr, int start_range, int end_range) {
        int maxELE_range = 0;
        for (int i = start_range; i <= end_range; i++) {
            if (arr[i] > maxELE_range) {
                maxELE_range = arr[i];
            }
        }
        return maxELE_range;
    }

}
