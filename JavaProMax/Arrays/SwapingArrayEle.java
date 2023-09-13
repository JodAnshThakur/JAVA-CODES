/*
 * Program to swap two index elements in the array with each other.
 */

package JavaProMax.Arrays;

import java.util.Scanner;

public class SwapingArrayEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first index value to be swapped :-->");
        int ind_first = sc.nextInt();
        System.out.println("Enter the second index value to be swapped with the first-->");
        int ind_second = sc.nextInt();
        int[] arr = { 54, 98, 65, 74, 72, 68, 34, 21 };
        swap(arr, ind_first, ind_second);
        sc.close();
    }

    static void swap(int[] arr, int index_first, int index_second) {
        int temp = arr[index_first];
        arr[index_first] = arr[index_second];
        arr[index_second] = temp;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
