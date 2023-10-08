package SEARCHING.LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch_In2DArray {
    public static void main(String[] args) {

        /*
         * Searching element in a 2D array.
         */

        int[][] _2Darray = {
                { 95, 24, 61, 58, 36, 97 }, { 21, 87, 64, 95, 37 }
        };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to be searched :-->");
        int target = sc.nextInt();
        int[] ans = LinearSearch_in2DArray(_2Darray, target);
        for (int i = 0; i < ans.length; i++) {
            System.out.println("The element is found at the index of :-->" + Arrays.toString(ans));
            System.out.println(
                    "NOTE --> The first value represent the ROW NO and the second value represent the COLUMN NO in which the element is found.");
        }
        sc.close();
    }

    static int[] LinearSearch_in2DArray(int[][] _2Darray, int target) {
        for (int row = 0; row < _2Darray.length; row++) {
            for (int column = 0; column < _2Darray[row].length; column++) {
                if (_2Darray[row][column] == target) {
                    return new int[] { row, column };// As it is not intialised so we have to initialise it by new
                    // int[]{row, column
                }
            }
        }
        return new int[] { -1, -1 };
    }
}
