package SEARCHING._LinearSearch;

import java.util.Scanner;

public class LinearSearch_UsingRange {
    public static void main(String[] args) {
        int[] arr = { 21, 87, 64, 95, 37, 95, 24, 61, 58, 36, 97 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to be searched :-->");
        int target = sc.nextInt();
        System.out.println("Enter the Starting index:-->");
        int start_index = sc.nextInt();
        System.out.println("Enter the ending index:-->");
        int end_index = sc.nextInt();
        int result = Linear_Search(arr, target, start_index, end_index);
        if (result == -1) {
            System.out.println("The element is not found inside the given range.");
        } else {
            System.out.println("The element is found inside the given range at the index of :--> " + result);
        }
        sc.close();
    }

    static int Linear_Search(int[] arr, int target, int start_index, int end_index) {
        for (int i = start_index; i <= end_index; i++) {
            if (target == arr[i]) {
                return i; // returns the target element index if found
            } else if (arr.length == 0) {
                return -1;
            }
        }
        return -1; // If the element is not found then -1 will be returned
    }

}
