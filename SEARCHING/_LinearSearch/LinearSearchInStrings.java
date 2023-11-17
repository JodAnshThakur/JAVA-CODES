package SEARCHING._LinearSearch;

import java.util.Scanner;

// --------------------------- SEARCHING SPECIFIC CHAR IN A STRING -------------------------------- //

public class LinearSearchInStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :-->");
        String check = sc.nextLine();
        System.out.println("Enter the character to be searched :-->");
        String target = sc.nextLine();
        System.out.println(target.charAt(0));
        int char_index = Linear_StringSearch(check, target);
        System.out.println("The character is at the index of :--> " + char_index);
        sc.close();
    }

    // Added boolean statement just for more clearance and nothing else.

    static int Linear_StringSearch(String check, String target) {
        for (int i = 0; i < check.length(); i++) {
            if (check.charAt(i) == target.charAt(0)) {
                return i;
            } else if (check.length() == 0) {
                System.out.println("String has no Characters please input a valid string.");
            }
        }
        return -1;// return - 1 if the character is not found.
    }

}
