package Lessons.TwoD_Arrays;

public class Basic {
    public static void main(String[] args) {

        /*
         * For creating a 2D array what we have to do is just write two sqare brackets
         * with the datatype.
         */
        int[][] twoDArray = { { 2, 4, 6, 8 }, { 6, 8, 0, 10 } };

        // Accessing the value in 2D array:
        System.out.println(twoDArray[0][2]);// Here first value i.e, [0] indicates which array is yo be first accessed
                                            // and then in that specific array which value is to be accessed here the
                                            // value accessed in the [0] indexed array is [2].

    }

}
