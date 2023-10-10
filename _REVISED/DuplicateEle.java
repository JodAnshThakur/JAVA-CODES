package _REVISED;

public class DuplicateEle {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < arr.length; i++) {
            int temp_ele = arr[i];
            searchDuplicate(arr, temp_ele);
            break; // For one check
        }
    }

    static void searchDuplicate(int[] arr, int temp_ele) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == temp_ele) {
                count++;
            }
        }
        if (count != 1) {
            System.out.println("The Duplicate Number is :--> " + temp_ele);
        } else {
            System.out.println("No duplicate number found.");
        }
    }
}
