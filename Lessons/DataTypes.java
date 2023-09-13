package Lessons;

public class DataTypes {
    public static void main(String[] args) {

        /*
         * Primitive data types are types of data built-in to the Java system. The eight
         * primitive data types we’ll cover are int, byte, short, long, float, double,
         * char and boolean;
         * 
         * int, which stores whole numbers.
         * byte - 1 byte only stores values from (-128 to 127)
         *
         * double, which stores bigger whole numbers and decimal numbers.
         * boolean, which stores true and false.
         * char, which stores single characters using single quotes.
         * 
         * String and are are non primitive data types in java.
         * 
         * String, which stores multiple characters using double quotes.
         */

        // 1 - int : int can hold small values only
        int checkingintdatatype = 1;
        System.out.println(checkingintdatatype);

        // 2 - double : The double primitive data type can help. double can hold
        // decimals as well as very large and very small numbers.
        double percentage = 91d; // We can add d for double like float If we dont add "d" there will be no such
                                 // error seen its upon us totally.
        System.out.println(percentage);

        // 3 - byte :
        byte u = -91;
        System.out.println(u);

        // 4 - short : The short data type is a 16-bit signed two's complement integer.
        // It has a minimum value of -32,768 and a maximum value of 32,767 (inclusive).
        short var = 555;
        System.out.println(var);

        // 5 - long :
        long number = 123456789;
        System.out.println(number);

        // 6 - float :
        float var1 = 5555.784f; // Here unlike double if we dont add f in the value then it will though an
                                // error.
        System.out.println(var1);

        // 7 - char - The char data type can hold any character, like a letter, space,
        // or punctuation mark.
        char expectedGrade = 'A';
        System.out.println(expectedGrade);

        // 8 - boolean : only can store true or false.
        boolean check = true;
        System.out.println(check);

        // Non - Primitive data types.

        // 1- array-
        int[] arr = { 10, 2, 88, 99 };
        System.out.println(arr[0]);

        // 2 - string - A String literal is any sequence of characters enclosed in
        // double-quotes ("").
        String name = "Ansh";
        System.out.println(name);
        String namechange = new String("Ansh");
        System.out.println(namechange);

    }

}
