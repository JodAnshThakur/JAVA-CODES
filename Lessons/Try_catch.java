package Lessons;

public class Try_catch {
    public static void main(String[] args) {

        /*
         * When we know that probably we can can face error in the program, but we dont
         * want to stop the program there we want is to continue after the error, then
         * we use "try-catch" statement to catch the issue without stoping the execution
         * of the program.
         * 
         * Uncomment and check the error then comment it again and check how we have
         * cured the problem.
         */
        // int[] num = { 10, 9, 8 };
        // System.out.println(num[3]);// This will through an error as 3 index value
        // doesn't exists so the statement
        // next to this never be printed.
        // System.out.println("This line will never be printed.");

        /*
         * The solution to this problem using try-catch ==>
         */
        int[] num = { 10, 9, 8 };
        try { // This will just try to find the output
            System.out.println(num[3]);
        } catch (Exception e) { // If try failed then error will be catched and printed normally without
                                // stopping the execution of the program
            System.out.println(e);
        }
        System.out.println("Now this line will be printed including the errorabove.");
    }

}
