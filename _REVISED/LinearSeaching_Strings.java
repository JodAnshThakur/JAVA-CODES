package _REVISED;

import java.util.Scanner;

public class LinearSeaching_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string :-> ");
        String to_be_checked = sc.nextLine();
        System.out.print("Enter the element :-> ");
        String target = sc.next();
        for (int i = 0; i < to_be_checked.length(); i++) {
            if (to_be_checked.charAt(i) == target.charAt(0)) {
                System.out.println("Element found at index no : " + i);
            }
        }
    }

}
