package Lessons.OneD_Arrays;

public class reverse {
    public static void main(String[] args) {

        // In this program we will access all the elements of the array in reverse
        // order:
        String[] arr = { "This", "is", "reverse", "array", "printing" };

        // int i = arr.length;
        // System.out.println(i);
        // The length functions gives the exact length counting the elements from 1 not
        // from 0.
        for (int i = (arr.length - 1); i > 0; i--) {
            System.out.println(arr[i]);
        }
    }

}
