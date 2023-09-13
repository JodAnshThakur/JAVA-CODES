package JavaProMax.Fun_Meth;

import java.util.Scanner;

public class SumUsingVoid {
    public static void main(String[] args) {
        // Here we will call our functions
        sum(); // calling sum functions
    }

    /*
     * void functions does't return any value we have write output statement inside
     * the function for
     * getting the required output
     */
    static void sum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int first_num = sc.nextInt();
        System.out.println("Enter the Second number :");
        int sec_num = sc.nextInt();
        int sum = first_num + sec_num;
        System.out.println("The sum is : " + sum); // as it doesn't return any value so we have to print it
        sc.close();

    }

}
