package ArrayList;

import java.util.ArrayList;

public class GettingValues_Iteration {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(98);
        marks.add(97);
        marks.add(99);
        marks.add(100);
        marks.add(95);
        marks.add(94);

        /*
         * Interation om ArrayList for getting values stored in it.
         * Length functions doesn't work in ArrayList :==>
         */
        for (int i = 0; i < 5; i++) {
            System.out.println(marks.get(i));
        }

    }

}
