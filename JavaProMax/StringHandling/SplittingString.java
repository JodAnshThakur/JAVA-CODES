package JavaProMax.StringHandling;

import java.util.Arrays;
import java.util.Scanner;

public class SplittingString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String :--> ");
        String toSplit = sc.nextLine();
        String[] Splitted = toSplit.split(" "); // Splitting from the whitespace
        System.out.println(Arrays.toString(Splitted));
        sc.close();
    }
}
