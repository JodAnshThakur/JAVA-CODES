package Lessons;

import java.util.Scanner;

public class SwitchCase {
   public static void main(String[] args) {

      /*
       * Switch case is used like if-else statement in java where one argument or
       * condition is given inside the switch statement and cases are created
       * according to the outputs required.
       * 
       * Important cc : break statement is used after every case otherwise when
       * condition match the correct output including all the remaining output will be
       * printed, to cure this problem we use break statement after every case.
       */
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter day number : ");
      int day = sc.nextInt();

      switch (day) {
         case 1:
            System.out.println("Monday");
            break;
         case 2:
            System.out.println("Tuesday");
            break;
         case 3:
            System.out.println("Wednesday");
            break;
         case 4:
            System.out.println("Thursday");
            break;
         case 5:
            System.out.println("Friday");
            break;
         case 6:
            System.out.println("Saturday");
            break;
         case 7:
            System.out.println("Sunday");
            break;
         default:
            System.out.println("Bitch there are only 7 days in a week.");
      }

      sc.close();

   }

}
