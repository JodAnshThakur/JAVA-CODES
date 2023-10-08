package SORTING.CYCLE_SORT.INTERVIEW_QUESTIONS;

/*
 * Amazon Intervies Ques. Program to find the missing number from the given range from [1,n] 
 */

public class FindingMissingNO_AMAZONQUES {
    public static void main(String[] args) {
        int[] range_arr = { 0, 1, 2, 3, 4, 6, 7, 8, 9 };
        int missing_no = Searching_ForMissing(range_arr);
        System.out.println("The Missing number in  the range is :-> " + missing_no);
    }

    static int Searching_ForMissing(int[] arr) {
        int missing_no = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i) {
                missing_no = i;
                break;
            }
        }
        return missing_no;
    }

}
