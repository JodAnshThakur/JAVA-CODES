package Lessons.OneD_Arrays;

public class AccessingArray {
    public static void main(String[] args) {

        /*
         * Accessing the vlaues of the array usinng for loop:
         * Using length function for finding the length of the array -
         * "array_name.length" - no small brackets bitchhh!
         */
        String[] names = { "Ansh", "Shadow", "Brutal", "Clutchgod" };

        // This is basically the classical way to access arrays

        for (int i = 0; i < names.length; i++) {
            System.out.println("The element at the index position - " + i + " is " + names[i]);
        }

        // The advanced to access array is basically using for-each loop:
        for (String value : names) {
            System.out.println(value);
        }

    }

}
