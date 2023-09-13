package Lessons.OneD_Arrays;

public class MinEle {
    public static void main(String[] args) {

        int[] arr = { 12, 45, 84, 9, 12, 87, 32, 56 };
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("The minimum element in the array is --> " + min);

    }

}
