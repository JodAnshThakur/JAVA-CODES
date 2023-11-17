package SEARCHING._LinearSearch;

public class LinearSearch_ForMinEle {
    public static void main(String[] args) {
        int[][] arr = { { 95, 24, 61, 58, 36, 97 }, { 21, 87, 64, 95, 37 } };
        int min_ele = LinearSearchFor_MinEle(arr);
        System.out.println("The minimum element present in the 2D array is :--> " + min_ele);
    }

    // Program to find the minimum element in the 2D array:-
    static int LinearSearchFor_MinEle(int[][] arr) {
        int min = arr[0][0];
        for (int[] int_arr : arr) { // Integer array has two array itself so this loop will iterate through both the
                                    // array[Row] present in the arr
            for (int element : int_arr) { // This loop will access every element in all the sub array present in array
                                          // arr.
                if (element < min) {
                    min = element;
                }
            }
        }
        return min;
    }
}
