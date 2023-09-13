package ArrayList;

import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {
        /*
         * Array List is use to store a large amount of data and access them easily by
         * using ArrayList functions ===>
         */

        // Syntax for array list
        ArrayList<Integer> rno_List = new ArrayList<>();
        rno_List.add(54);
        rno_List.add(56);
        rno_List.add(98);
        rno_List.add(254);
        rno_List.add(5654);

        ArrayList<String> name_list = new ArrayList<>();
        name_list.add("Ansh");
        name_list.add("Astitva");
        name_list.add("Chandu");
        name_list.add("Shashank");
        name_list.add("ClutchGod");

        /*
         * Printing both the list ===>
         */
        System.out.println(rno_List);
        System.out.println(name_list);

        /*
         * Performing various functions on the list using list functions ===>
         */
        System.out.println(rno_List.getClass()); // Tells that this is an ArrayList
        System.out.println(name_list.indexOf("ClutchGod")); // Return -1 if the given element is not found.
        System.out.println(name_list.contains("Brutal")); // Checks wheather the ArrayList has that elements or not.

        System.out.println("This is the old list :=> " + rno_List);
        rno_List.set(0, 45);
        System.out.println("New list after updating the index no 1 with  45 :=>" + rno_List);
    }

}
