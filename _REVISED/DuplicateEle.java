package _REVISED;

public class DuplicateEle {
    public static void main(String[] args) {

        int[] arr = { 5, 3, 4, 2, 1, 4 };
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if (temp == arr[j]) {
                    System.out.println("The duplicate element is :-->" + j);
                }
            }
        }
    }
}
