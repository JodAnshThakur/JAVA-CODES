package Lessons;

public class MathsFunctions {
    public static void main(String[] args) {

/*
 * There are basically many Maths Functions in java.
 * There is no need to import maths class as it is already inbuilt.
 */
    // 1 - max():
    int num1 = 25;
    int num2 = 35;
    System.out.println(Math.max(num1,num2));

    // 2 - min():
    int num3 = 22;
    int num4 = 56;
    System.out.println(Math.min(num3,num4));

    // 3 - sqrt(): for finding the square root of any given number.
    System.out.println(Math.sqrt(625));

    // 4 - abs() - for getting a positive value .
    int num5 = -69;
    int num6 = +88;
    System.out.println(Math.abs(num5)); // -ve to +ve 
    System.out.println(Math.abs(num6)); // +ve will  remain +ve


        
    }
    
}
