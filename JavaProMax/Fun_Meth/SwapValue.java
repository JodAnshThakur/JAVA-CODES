package JavaProMax.Fun_Meth;

import java.util.Scanner;

public class SwapValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int a = sc.nextInt();
        System.out.println("Enter the second number :");
        int b = sc.nextInt();
        swap(a, b);
        sc.close();
    }

    static void swap(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("The first number is now having the value of :" + num1);
        System.out.println("The second number is now having the value of :" + num2);

    }

}
