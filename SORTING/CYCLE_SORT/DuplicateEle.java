package SORTING.CYCLE_SORT;

public class DuplicateEle {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 1 };
        for (int i = 0; i < arr.length; i++) {
            int temp_ele = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == temp_ele) {
                    System.out.println("The repeated element is :-> " + arr[j]);
                }
            }

        }
    }

}
