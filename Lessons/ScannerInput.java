package Lessons;
import java.util.Scanner;


public class ScannerInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * There are two input methods in scanner class :
         * 1 - next() - Takes only first word as input.
         * 2 - nextLine() - Takes whole sentence as input.
        */
        // String name = sc.next(); // Will take the first word of the name only
        System.out.println("Enter you name : ");


        String name = sc.nextLine(); // Will take the full name 
        System.out.println(name);

        System.out.println("Enter your age : "); // Taking string as input
        int age = sc.nextInt();

        System.out.println("Enter your phone number : "); // Taking long nummerical value as input
        long number = sc.nextLong();

        System.out.println("Enter 'true' if you are op oterwise enter 'faslse' :"); // Taking Boolean as input
        boolean op = sc.nextBoolean();
        
        System.out.println("How much will be your yealy earning in 2030 : "); // Taking 
        double earning = sc.nextDouble();

        System.out.println("Your name is :" + name);
        System.out.println("Your age is :" + age);
        System.out.println("Your phone number is :" + number);
        System.out.println("You are op : " + op);
        System.out.println("Your earning in 2030 will be more than : " + earning);

        sc.close(); // So that resources of sc dont leak
    }
    
}
