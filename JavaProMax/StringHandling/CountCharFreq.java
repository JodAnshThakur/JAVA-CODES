package JavaProMax.StringHandling;

import java.util.Scanner;

public class CountCharFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : => ");
        String check = sc.nextLine();
        System.out.println("Enter the character  whose frequency you want to check :=>");
        String check_char = sc.nextLine();
        char check_karo = check_char.charAt(0);
        int count = 0;
        int check_len = check.length();
        for (int i = 0; i < check_len; i++) {
            if (check.charAt(i) == check_karo) {
                count += 1;
            }
        }
        System.out.println("The total frequency of " + check_char + " is " + count + ".");
        sc.close();
    }

}
