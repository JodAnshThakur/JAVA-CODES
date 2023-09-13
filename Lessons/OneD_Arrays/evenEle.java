package Lessons.OneD_Arrays;

public class evenEle {
    public static void main(String[] args) {

        // Printing the even elements from the array :

        int[] arr = { 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }

}
