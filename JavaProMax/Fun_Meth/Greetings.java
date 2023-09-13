package JavaProMax.Fun_Meth;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {

        // Program to greet user :
        String str = greet();
        System.out.println("Namaste! " + str + " , How are you ? ");

    }

    static String greet() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you name :> ");
        String name = sc.nextLine();
        sc.close();
        return name;

    }
}
