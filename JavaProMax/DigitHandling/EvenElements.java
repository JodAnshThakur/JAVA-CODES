/*
 * Printing all the even elements in the array.
 */
package JavaProMax.DigitHandling;

public class EvenElements {
    public static void main(String[] args) {
        int[] arr = { 7, 8, 64, 74, 15, 25, 46, 13, 92, 44 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }

}
