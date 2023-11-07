package _REVISED;

import java.util.Arrays;
import java.util.Scanner;

public class SwappingArrayElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the  Array :--> ");
        int length_arr = sc.nextInt();
        int[] arr = new int[length_arr];
        for (int i = 0; i < length_arr; i++) {
            System.out.println("Enter the element for index " + i + " :");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the index of the element to be swapped :->");
        int first_ele = sc.nextInt();
        System.out.println("Enter the index value of the element to be changed with the element above;->");
        int second_ele = sc.nextInt();
        swap(arr, first_ele, second_ele);
        sc.close();

    }

    static void swap(int[] arr, int first_ele, int second_ele) {
        int temp = arr[first_ele];
        arr[first_ele] = arr[second_ele];
        arr[second_ele] = temp;
        System.out.println(Arrays.toString(arr));
    }

}
