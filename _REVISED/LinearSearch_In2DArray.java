package _REVISED;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch_In2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                { 95, 24, 61, 58, 36, 97 }, { 21, 87, 64, 95, 37 }
        };
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter target element :--> ");
        int target = sc.nextInt();
        int[] target_index = LS_in2darray(arr, target);
        for (int i = 0; i < target_index.length; i++) {
            System.out.println(Arrays.toString(target_index));
            System.out.println(
                    "NOTE --> The first value represent the ROW NO and the second value represent the COLUMN NO in which the element is found.");
        }
        sc.close();
    }

    static int[] LS_in2darray(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if (arr[row][column] == target) {
                    return new int[] { row, column }; // IMP
                }
            }
        }
        return new int[] { -1, -1 };
    }
}
