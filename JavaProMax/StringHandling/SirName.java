/*
 * Program to print the Sirname followed by the first name and second name first letter.
 * Example :=> Input = Ansh singh thakur
 *             Output = THAKUR A S
 */

package JavaProMax.StringHandling;

import java.util.Scanner;

public class SirName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String :--> ");
        String toSplit = sc.nextLine();
        String[] Splitted = toSplit.split(" "); // Splitting from the whitespace
        System.out.print(Splitted[Splitted.length - 1].toUpperCase() + " ");
        for (int i = 0; i < Splitted.length - 1; i++) {
            System.out.print(Splitted[i].toUpperCase().charAt(0) + " ");
        }
        sc.close();

    }
}
