package _REVISED;

import java.util.Scanner;

public class charCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string :-->");
        String to_check = sc.nextLine();
        sc.close();
        int count = 0;
        for (int i = 0; i < to_check.length(); i++) {
            if (to_check.charAt(i) != ' ') {
                count++;
            }
        }
        System.out.println("Total character present in the string is : " + count);

    }

}
