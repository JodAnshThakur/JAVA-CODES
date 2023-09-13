package Lessons.TwoD_Arrays;

import java.util.Scanner;

public class Input_Jod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][3]; // Matrix of 3*3 that is total of 9 elements.
        /*
         * <---- Taking all the elements of the matrix(2D array) as input from the user
         * .------>
         */
        for (int row = 0; row < arr.length; row++) {
            // This loop will access all rows in the matrix
            for (int column = 0; column < arr[row].length; column++) {
                // This loop will basically access and fill the elements on their column
                // position.
                System.out.println("Enter all the elements of the Matrix in a row :>");
                arr[row][column] = sc.nextInt();
            }
        }
        sc.close();
        // The input of the user should be in the format 1 2 3 4 5 6 7 8 9 all 9
        // elements in a row they will be stored in the format of a matrix in the row
        // wgich we will be printed in the later section.
        /*
         * <---- Printing all the matrix elements inputed by the user in the format of
         * Matrix[2D array] .------>
         */
        for (int row = 0; row < arr.length; row++) {
            // This loop will access all rows in the matrix
            for (int column = 0; column < arr[row].length; column++) {
                // This loop will access column of the matrix
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();// To print every o=row in new line Bitchh!
        }
    }

}
