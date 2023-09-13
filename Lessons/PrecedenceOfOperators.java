package Lessons;

public class PrecedenceOfOperators {
    public static void main(String[] args) {

    /*Operators that share the same precedence are evaluated from Left-to-Right within the expression.
    The order is as follows:
    Parentheses
    Exponents
    Modulo/Multiplication/Division
    Addition/Subtraction */  

    int expression1 = 5 % 2 - (4 * 2 - 1);
    System.out.println(expression1);

    int expression2 = (3 + (2 * 2 - 5)) + 6 - 5;
    System.out.println(expression2);

    int expression3 = 5 * 4 % 3 - 2 + 1;
    System.out.println(expression3);

    
    
    }
    
}
