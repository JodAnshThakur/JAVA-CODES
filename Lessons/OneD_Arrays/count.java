package Lessons.OneD_Arrays;

public class count {
    public static void main(String[] args) {

        // Checking and counting the number of the elements which are greater than or
        // equals to 80 ::

        int[] marks = { 81, 95, 42, 76, 99, 47, 87, 83, 97, 98, 96 };
        int count = 0;

        for(int i = 0; i < marks.length; i++) {
            if (marks[i] >= 80) {
                count += 1;

            }
        }
        System.out.println("The number of students got marks greator than of equal to  80 are : " + count);

    }

}
