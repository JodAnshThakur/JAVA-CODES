package _REVISED;

import java.util.Scanner;

public class CommonFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :-->");
        int num_first = sc.nextInt();
        System.out.println("Enter the second number:-->");
        int num_second = sc.nextInt();
        sc.close();
        for (int i = 1; i <= num_first; i++) {
            if (num_first % i == 0 && num_second % i == 0) {
                System.out.print(i + ", ");
            } else {
                i++;
            }
        }
    }

}
