package Projects;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        
        float num_1, num_2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number : ");
        num_1 = sc.nextFloat();
        System.out.println("Enter the Second Number : ");
        num_2 = sc.nextFloat();

        System.out.println("Type 1 for addition, Type 2 for subtraction, Type 3 for multiplication, Type 4 for division, Type 5 for modulus."); 
        int user_input = sc.nextInt();
        
        switch(user_input){
            case 1:
              System.out.println("The  addition of the numbers is -> "+(num_1+num_2));
              break;
            case 2:
              System.out.println("The  subtraction of the numbers is -> "+(num_1-num_2));
              break;
            case 3:
              System.out.println("The  multipication of the numbers is -> "+(num_1*num_2));
              break;
            case 4:
              System.out.println("The  division of the numbers is -> "+(num_1/num_2));
              break;
            case 5:
              System.out.println("The  modulus of the numbers is -> "+(num_1%num_2));
        }
        sc.close();

        System.out.println("First Java project and Java basics completed!!!");

    }
    
}
