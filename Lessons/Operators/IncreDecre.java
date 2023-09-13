package Lessons.Operators;

public class IncreDecre {
    public static void main(String[] args) {
/*
    * About increment :
    * 1 -- Post increment (num++) = This will Basically increment the number after printing its value so after printing its value will be incremented to (num + 1).
    * Examples --
*/
    int num = 1;
    System.out.println(num++); // Here 1 will be the output as it is post increment so after printing 1 the value will become 2;
    System.out.println(num); // Here the ouput will be 2 as it is incremented

/*
    * About increment :
    * 2 -- Pre increment (++num) = This will Basically increment the number before printing its value so the output will be an incremented value that is (num+1).
    * Examples --
*/
    int num_ = 0;
    System.out.println(++num_); // Here 1 will be the output as it is pre increment.
    System.out.println(num_); // Here the ouput will be again 1 as it is incremented.


/*
    * About Decrement :
    * 1 - Post decrement(num--) = Here the decrementation take place after assigning the decrementation.
    * Examples --  
 */
    int num2 = 0;
    System.out.println(num2--); // Here the output will be 0 because the decrementation will take place after This 
    System.out.println(num2); // Here the output will be -1 as the value is decremented already
    
    
    

    }
    
}
