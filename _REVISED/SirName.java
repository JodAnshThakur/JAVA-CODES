package _REVISED;

import java.util.Scanner;

public class SirName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String :-->");
        String check = sc.nextLine();
        check = check.toUpperCase();
        String[] split = check.split(" ");
        System.out.print(split[split.length - 1] + " ");
        for (int i = 0; i < split.length - 1; i++) {
            System.out.print(split[i].charAt(0) + " ");
        }
        sc.close();

    }

}
