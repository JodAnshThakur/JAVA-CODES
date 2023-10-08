package _REVISED;

public class LinearSearch_ForMinEle {
    public static void main(String[] args) {
        int[][] arr = { { 95, 24, 61, 58, 36, 97 }, { 21, 87, 64, 95, 37 } };
        int min_ele = LinearSearchFor_MinEleop(arr);
        System.out.println("The minimum element present in the 2D array is :--> " + min_ele);
    }

    static int LinearSearchFor_MinEleop(int[][] arr) {
        int min_ele = arr[0][0];
        for (int[] arr_check : arr) {
            for (int element : arr_check) {
                if (element < min_ele) {
                    min_ele = element;
                }
            }
        }
        return min_ele;
    }
}
