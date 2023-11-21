package _REVISED;

import java.util.Scanner;

public class LinearSInTwoDArray {
    public static void main(String[] args) {
        int[][] arr = { { 21, 87, 64, 95 },
                { 37, 95, 24, 61 } };

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to be searched :-->");
        int target = sc.nextInt();
        sc.close();
        // System.out.println(arr.length);// The length of the array is given its row
        // count [Total rows].

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    System.out.print(row + ", " + col);
                }
            }
        }

    }

}
