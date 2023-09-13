public class Test {
    /*
     * Test file for testing the code before applying it in the main program😁😁
     */
    public static void main(String[] args) {
        String check = "ansh";
        boolean check_result = false;
        for (int i = 0; i < check.length(); i++) {
            if (check.charAt(i) != check.charAt(check.length() - i - 1)) {
                check_result = false;
            } else {
                check_result = true;
            }
        }
        if (check_result == false) {
            System.out.println("Not OR wot!");
        } else if (check_result == true) {
            System.out.println("Palindrome OR wot!");

        }
    }
}