package JavaProMax.Fun_Meth;

import java.util.Scanner;

public class SumUsingReturn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int first_num = sc.nextInt();
        System.out.println("Enter the second number :");
        int sec_num = sc.nextInt();
        int ans = sum(first_num, sec_num);
        System.out.println(ans);
        sc.close();

    }

    static int sum(int a, int b) {
        int sum = a + b;
        return sum;

    }

}
