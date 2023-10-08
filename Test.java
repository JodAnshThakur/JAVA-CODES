import java.util.Scanner;

public class Test {
    /*
     * Test file for testing the code before applying it in the main program😁😁
     */
    public static void main(String[] args) {
        int[] arr = { 21, 87, 64, 95, 37, 95, 24, 61, 58, 36, 97 };
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target elements :--> ");
        int target = sc.nextInt();
        int target_index = LinearSearch_Algo(arr, target);
        System.out.println("The target element is present at the index " + target_index + ".");
        sc.close();
    }

    static int LinearSearch_Algo(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}