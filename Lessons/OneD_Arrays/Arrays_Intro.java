package Lessons.OneD_Arrays;

public class Arrays_Intro {
    public static void main(String[] args) {

        /*
         * Arrays are used to store multiple values in a single variable, instead of
         * declaring separate variables for each value.
         * 
         * For declaring array what we do is :
         * First we write datatype [] variable_name = {values in the array};
         * For accessing the values we call them by variable_name[index_value]
         * Remember indexing in the array starts with 0(zero),
         */
        int[] marks = { 97, 95, 93, 98, 100 };
        System.out.println(marks[0]);

        // How to update array value :
        marks[2] = 100; // The value of array at 2 position i.e, 93 will be updated to 100.
        System.out.println(marks[2]);

    }

}
