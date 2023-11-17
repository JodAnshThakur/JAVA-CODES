
package SEARCHING._LinearSearch;

public class LinearSearch_ForMaxEle {
    public static void main(String[] args) {
        int[][] arr = { { 95, 24, 61, 58, 36, 97 }, { 21, 87, 64, 95, 37 } };
        int max_ele = LinearSearchFor_MaxEle(arr);
        System.out.println("The maximum element present in the 2D array is :--> " + max_ele);
    }

    // Program to find the maximum element in the 2D array:-
    static int LinearSearchFor_MaxEle(int[][] arr) {
        int max = arr[0][0];
        for (int[] int_arr : arr) { // Integer array has two array itself so this loop will iterate through both the
                                    // array[Row] present in the arr
            for (int element : int_arr) { // This loop will access every element in all the sub array present in array
                                          // arr.
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
}
