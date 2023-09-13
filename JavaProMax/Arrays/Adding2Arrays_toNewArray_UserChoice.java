/*
 * Program to add the same index elements of the 2 Arrays and save the addition in the new array but here we are taking the  values of the arry from the user.
 */

package JavaProMax.Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Adding2Arrays_toNewArray_UserChoice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the First Array :->");
        int arr1_len = sc.nextInt();
        int[] arr1 = new int[arr1_len];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Enter the element for the index value of " + i + " :->");
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter length of the Second Array :->");
        int arr2_len = sc.nextInt();
        int[] arr2 = new int[arr2_len];
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Enter the element for the index value of " + i + " :->");
            arr2[i] = sc.nextInt();
        }
        sc.close();
        int new_arr_len = arr1.length;
        int[] new_arr = new int[new_arr_len];
        for (int i = 0; i < arr1.length; i++) {
            int newarr_value = arr1[i] + arr2[i];
            new_arr[i] = newarr_value;
        }
        System.out.println(Arrays.toString(new_arr));
    }

}