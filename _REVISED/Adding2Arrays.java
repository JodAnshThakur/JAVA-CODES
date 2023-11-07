package _REVISED;

import java.util.Arrays;
import java.util.Scanner;

public class Adding2Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of first Array :--> ");
        int length_arr1 = sc.nextInt();
        int[] arr1 = new int[length_arr1];
        for (int i = 0; i < length_arr1; i++) {
            System.out.println("Enter the element for index " + i + " :");
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the length of Second Array :--> ");
        int length_arr2 = sc.nextInt();
        int[] arr2 = new int[length_arr2];
        for (int i = 0; i < length_arr2; i++) {
            System.out.println("Enter the element for index " + i + " :");
            arr2[i] = sc.nextInt();
        }
        sc.close();

        int[] added_arr = new int[length_arr1];
        for (int j = 0; j < arr1.length; j++) {
            added_arr[j] = arr1[j] + arr2[j];
        }
        System.out.println(Arrays.toString(added_arr));
    }
}
