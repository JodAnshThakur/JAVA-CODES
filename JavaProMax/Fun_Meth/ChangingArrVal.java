package JavaProMax.Fun_Meth;

public class ChangingArrVal {
    public static void main(String[] args) {

        // Program for changing the value of an arary using methods :=>
        int[] arr = { 10, 47, 69, 56, 35 };
        change(arr);
        // System.out.println(Array.toString(arr));
    }

    static void change(int[] num) {
        num[0] = 54;
        System.out.println(num[0]);

    }

}
