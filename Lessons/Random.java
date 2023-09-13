package Lessons;

public class Random {
    public static void main(String[] args) {

/*
 * In this we will see random functions in java how they work --
 * This random functions also comes under maths library.
 * Maths.random() - Generates a random number between 0(inclusive) and 1(exclusive).
 */
    
    System.out.println(Math.random());

/*
 * If we want to generate any random number b/w two specific value what we have to do is just add the lower value will the subtraction of the higher and lower value multiplied by random value functions.
 * 
 * Examples --
 */
// 1 - Random value b/w 2 and 8;

    System.out.println(2+(8-2)*Math.random());

// 2 - Random value b/w 5 and 7;
    System.out.println(5+(7-5)*Math.random());
       
        
    }
}
