package SEARCHING._LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch_UsingForEachLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string : -->");
        String check = sc.nextLine();
        System.out.println("Enter which element you want to search :-->");
        String target = sc.nextLine();
        System.out.println(Arrays.toString(check.toCharArray()));
        boolean ans = LinearSearch_Using_ForEachLoop(check, target);
        if (ans == true) {
            System.out.println("Found!");
        } else if (ans == false) {
            System.out.println("Not found!");
        }
        sc.close();
    }

    static boolean LinearSearch_Using_ForEachLoop(String check, String target) {
        for (char ch : check.toCharArray()) {
            if (ch == target.charAt(0)) {
                return true;
            }
        }
        return false;
    }
}
