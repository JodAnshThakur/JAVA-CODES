package ArrayList;

import java.util.Scanner;
import java.util.ArrayList;

public class AddingValues_Iteration {
    public static void main(String[] args) {

        ArrayList<String> Op_names = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        /*
         * Adding values in the Arraylist Using for loop and add function.
         * Length should be taken as input because the length functions doesn't work on
         * ArayList.
         */

        for (int i = 0; i < 5; i++) {
            Op_names.add(sc.nextLine());

        }
        sc.close();
        System.out.println("The array list :-->" + Op_names);

    }

}
