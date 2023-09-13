/*
 * 
 * *
 * * *
 * * * *
 * * * * *
 * * * * 
 * * * 
 * * 
 * 
 */
package PATTERNS;

public class Pattern_8 {
    public static void main(String[] args) {
        for (int row = 1; row <= 9; row++) {
            if (row <= 5) {
                for (int col = 1; col <= row; col++) {
                    System.out.print("* ");
                }
                System.out.println();
            } else {
                for (int col = 4; col > 0; col--) {
                    System.out.print("# ");
                }
                System.out.println();
            }
        }
    }
}
