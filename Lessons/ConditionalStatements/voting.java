package Lessons.ConditionalStatements;
import java.util.Scanner;

public class voting {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you age  :");
        int age  = sc.nextInt();

        // Now using the if- else statement we will check the user can vote or not.

        if(age>18){
            System.out.println("You can vote");
        } 
        else if(age==17){
            System.out.println("Just one year to go bitchh.");
        }
        else {
            System.out.println("You can't vote vmroo.");

        }
        sc.close();

    }
    
}
