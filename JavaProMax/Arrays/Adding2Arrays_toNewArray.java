/*
 * Program to add the same index elements of the 2 Arrays and save the addition in the new array.
 */

package JavaProMax.Arrays;

import java.util.Arrays;

public class Adding2Arrays_toNewArray {
    public static void main(String[] args) {
        int[] arr1 = { 0, 1, 2, 4, 5, 6 };
        int[] arr2 = { 0, 1, 2, 4, 5, 6 };
        int[] new_arr = new int[6];
        for (int i = 0; i < arr1.length; i++) {
            int newarr_value = arr1[i] + arr2[i];
            new_arr[i] = newarr_value;
        }
        System.out.println(Arrays.toString(new_arr));
    }

}
