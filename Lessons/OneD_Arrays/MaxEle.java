package Lessons.OneD_Arrays;

public class MaxEle {
    public static void main(String[] args) {

        int[] arr = { 12, 45, 84, 9, 12, 87, 32, 56 };
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("The maximum element in the array is --> " + max);
    }

}
