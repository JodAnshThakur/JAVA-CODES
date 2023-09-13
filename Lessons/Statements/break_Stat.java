package Lessons.Statements;

public class break_Stat {
    public static void main(String[] args) {

/*
 * break statement :- break statement is used when we want to stop the iteration at any certain condion.
 * 
 * Example: 
 * 
 */
    for(int i=0; i<10; i++ ){

        if(i==2){
            break; // This loop will stop at 2 
        }
        
        else{
            System.out.println("Loop Executing - " + i);
        }
    }   




    }
    
}
