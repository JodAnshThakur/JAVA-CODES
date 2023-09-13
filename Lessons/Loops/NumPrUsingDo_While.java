package Lessons.Loops;

public class NumPrUsingDo_While {
    public static void main(String[] args) {
        
/*
 * Printing numbers form 1-100 using do while loop ;
 * 
 * 1 - checking how one time do - while is executed without depending on the condition passed;
 */
    int i = 0;
    do{
        System.out.println("This is the one time execution.");
        i += 1;
    }
    while(i>10); // As i is not greator than 10 so this condition is not satisfied, no output will be executed



    }
    
}
