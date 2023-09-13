package Lessons.OneD_Arrays;

import java.util.Scanner;

public class TakingeleInput {
    public static void main(String[] args) {

        int[] arr_ = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            arr_[i] = sc.nextInt();
        }
        for (int i = 0; i < arr_.length; i++) {
            System.out.print(arr_[i] + " ");
        }
        sc.close();
    }

}
