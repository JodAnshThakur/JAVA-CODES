/*
 * PROGRAM FOR FINDING COMMON FACTORS OF TWO NUMBERS
 * 
 */
package JavaProMax.Loop;

import java.util.Scanner;

public class CommonFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :->");
        int first_nu = sc.nextInt();
        System.out.println("Enter the second number :->");
        int sec_nu = sc.nextInt();
        sc.close();
        for (int i = 1; i <= first_nu; i++) {
            if (first_nu % i == 0 && sec_nu % i == 0) {
                System.out.print(i + ", ");
            }
        }
    }

}
