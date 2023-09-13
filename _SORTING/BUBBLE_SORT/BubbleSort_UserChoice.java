package _SORTING.BUBBLE_SORT;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort_UserChoice {
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
        BubbleSort_TakingUserInput(arr);

        sc.close();
    }

    static void BubbleSort_TakingUserInput(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Type 1 -> to sort the array in ASCENDING order Or Type 2 -> to sort the array in DESCENDING order :-->");
        int choice = sc.nextInt();
        sc.close();

        boolean sorted = false;
        switch (choice) {
            case 1:
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 1; j < arr.length - i; j++) {
                        if (arr[j] < arr[j - 1]) {
                            int temp = arr[j];
                            arr[j] = arr[j - 1];
                            arr[j - 1] = temp;
                            sorted = true;
                        }
                    }
                    if (sorted == false) {
                        break;
                    }
                }
                break;

            case 2:
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 1; j < arr.length - i; j++) {
                        if (arr[j] > arr[j - 1]) {
                            int temp = arr[j];
                            arr[j] = arr[j - 1];
                            arr[j - 1] = temp;
                            sorted = true;
                        }
                    }
                    if (sorted == false) {
                        break;
                    }
                }
                break;

            default:
                System.out.println("Invalid Input!");
        }
        System.out.println("The array after sorting is :-->" + Arrays.toString(arr));
    }
}
