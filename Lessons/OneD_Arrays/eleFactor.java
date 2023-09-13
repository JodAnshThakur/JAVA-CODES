package Lessons.OneD_Arrays;

public class eleFactor {
    public static void main(String[] args) {

        // Finding the factor of the first element in the array :

        int[] arr = { 16, 48, 64, 98, 30 };
        int firts_ele = arr[0];
        for (int fac = 1; fac <= firts_ele; fac++) {
            if ((firts_ele % fac) == 0) {
                System.out.println(fac);
            }

        }

    }
}
