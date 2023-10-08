package _REVISED;

import java.util.Scanner;

public class LinearSearchInStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string :--> ");
        String str = sc.nextLine();
        System.out.print("Enter the char to be searched :--> ");
        String target = sc.next();
        Ls_StringSearch(str, target);
        sc.close();
    }

    static void Ls_StringSearch(String str, String target) {
        int target_index = -1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target.charAt(0)) {
                target_index = i;
            }
        }
        System.out.println(target_index);
    }
}
