package Lessons;

public class FinalKeyword {
    public static void main(String[] args) {

        // Final Keyword -- Final keyword basically assign the value that cannot be
        // changes throughout the program if we try to change to value then it will
        // through an error.

        final String name = "Ansh Thakur";
        System.out.println(name);
        // Trying to change the value of string name but this will not change as final
        // keyword is used and this will through an error -- "The final local variable
        // name cannot be assigned".

        // name = "Ansh Op";
        // System.out.println(name);

    }
}
