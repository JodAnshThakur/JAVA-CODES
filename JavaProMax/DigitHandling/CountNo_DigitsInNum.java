package JavaProMax.DigitHandling;

import java.util.Scanner;

/*
 * Program to count the total number of digits present in the number :-->
 */
public class CountNo_DigitsInNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number :-->");
        int no = sc.nextInt();
        int count = 0;
        while (no > 0) { // jabtak no ko 10 se divide karne pe result 0 se bada hoga loop chalegi
            count++; // agar loop chali to atleast 1 digit to hogi hi.
            no = no / 10;
        }
        System.out.println("The total number of digits present in the number entered is:--> " + count);
        sc.close();
    }
}
