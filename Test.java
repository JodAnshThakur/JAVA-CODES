import java.util.Arrays;

public class Test {
    /*
     * Test file for testing the code before applying it in the main program😁😁
     */
    public static void main(String[] args) {
        String[] arr = { "Ansh", "Thakur", "OP" };
        String[] reverseArray = new String[3];
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < arr.length; j++) {
                reverseArray[j] = arr[i];
            }
        }
        System.out.println(Arrays.toString(reverseArray));
    }
}