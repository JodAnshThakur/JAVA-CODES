package Lessons.Constructors;

public class Constructors { // This is basically Constructors class
    String color;
    boolean iselectric;
    int speed;

    public Constructors(String Carcolor,boolean  electric, int  topspeed) { // This is Constructors - Contructor Method
        color = Carcolor;
        iselectric = electric;
        speed = topspeed;
    }

public static void main(String[] args) {
    Constructors ford = new Constructors("Red", false, 300);
    Constructors mg = new Constructors("Blue", true, 200);

        System.out.println(ford.iselectric);
        System.out.println(mg.color);



    }
    

    
}
