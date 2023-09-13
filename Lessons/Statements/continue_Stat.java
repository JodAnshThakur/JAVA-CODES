package Lessons.Statements;

public class continue_Stat {
    public static void main(String[] args) {
        
/*
 * continue statement is used for skipping any specific iteration during execution.
 * Example :
 */
   for(int i=0; i<10; i++){
    if(i==2){
        continue; //This will skip the exution of number 2 
    }
    System.out.println("Loop Executing - " + i);
   }
   
    }
    
}
