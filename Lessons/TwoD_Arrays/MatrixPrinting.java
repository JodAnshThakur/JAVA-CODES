package Lessons.TwoD_Arrays;

public class MatrixPrinting {
    public static void main(String[] args) {

        int arr[][] = {
                { 12, 89, 69 },
                { 54, 67 },
                { 45, 63, 89, 78 }
        }; // Dont forgot closing the curly bracket at the end.
        int row_arr = arr.length; // Basically the rows of a 2D array represent its length.
        System.out.println(" The total number of the rows in the 2D array[Matrix] --> " + row_arr);

        for (int row = 0; row < arr.length; row++) {
            // For printing the rows of the Matrix.
            for (int column = 0; column < arr[row].length; column++) {
                // For printing the columns of the Matrix.
                System.out.print(arr[row][column] + " "); // Print not prinln because every row elements in the same
                                                          // line
            }
            System.out.println(); // For changing row in next line.
        }
    }

}
