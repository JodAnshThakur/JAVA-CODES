package SEARCHING.LinearSearch;

/*
 * Program to count total number of element in the array that contains even number of total digits:
 * Example ==> 4578 -> It contains 4 digits i.e, even, So basically we have to count all those elements in the array and return the totall count value in the end as the output. 
 */

public class CountEvenNumDigits {
    public static void main(String[] args) {
        int[] arr = { 9, 244, 6451, 58, 31236, 911137, 88 };
        int count_EvenDigitElement_Result = CountEven_NumDigits(arr);
        System.out.println(
                "Total elements in the array with Even Number of Digits are :--> " + count_EvenDigitElement_Result);
    }

    static int CountEven_NumDigits(int[] arr) {
        int count_EvenDigitElement = 0; // To store total elements with even number of digits.
        for (int i = 0; i < arr.length; i++) {
            int count_digitsPresent = 0; // This will store the total digits in every single element.
            int check_ele = arr[i];

            while (check_ele > 0) {
                count_digitsPresent++;
                check_ele = check_ele / 10;
            }
            if (count_digitsPresent % 2 == 0) { // To check whether the element has even no of digits.
                count_EvenDigitElement++;
            }

        }
        return count_EvenDigitElement;
    }
}