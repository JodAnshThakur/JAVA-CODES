package Lessons.OneD_Arrays;

public class Sum_Avg {
    public static void main(String[] args) {

        // Finding the sum and average of the elements in the array:

        int[] arr = { 10, 2, 3, 7, 9, 5, 4 };
        double arr_len = arr.length; // Double so that accurate value after calculating avg is obtained.
        int sum = 0;
        double avg = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("The sum of the elements of the array is : " + sum);
        avg = sum / arr_len;
        System.out.println("The average of the elements in the array is: " + avg);

    }

}
