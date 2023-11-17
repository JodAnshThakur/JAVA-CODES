package _REVISED;

public class LinearSIn2DArrayMINvalue {
    public static void main(String[] args) {
        int[][] arr = { { 21, 87, 64, 95 },
                { 37, 95, 20, 61 } };
        int min = arr[0][0];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] < min) {
                    min = arr[row][col];
                }
            }
        }
        System.out.println("The minimum value in the 2D arrays is :--> " + min);
    }

}
