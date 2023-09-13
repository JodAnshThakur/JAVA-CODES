package Practice_Questions;

import java.util.Scanner;

public class IntegerCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter something : ");
        try {
            int check = sc.nextInt();
            System.out.println("You have entered an integer -> " + check);
        } catch (Exception e) {
            System.out.println("The input type is not integer.");
        }
        sc.close();
    }

}
