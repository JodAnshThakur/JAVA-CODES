/*

* 
*  1 
*  2 2 
*  3 3 3
*  4 4 4 4
*  5 5 5 5 5
 */
package PATTERNS;

public class Pattern_2 {
    public static void main(String[] args) {

        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= row; col++) {
                if (col % 2 == 0) {
                    System.out.print("# ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

}
