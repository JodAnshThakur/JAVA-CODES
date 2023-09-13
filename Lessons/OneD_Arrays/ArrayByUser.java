package Lessons.OneD_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayByUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements you want to enter in the array :");
        int arr_len = sc.nextInt();
        int[] arr = new int[arr_len];
        for (int i = 0; i < arr_len; i++) {
            System.out.println("Enter the element to be at index " + i + ":");
            arr[i] = sc.nextInt();
        }
        System.out.println("The array formed is :-->" + Arrays.toString(arr));
        sc.close();
    }

}
