package _SEARCHING.BinarySearch;

import java.util.Scanner;

/*-----------------------------------------------------------------------------------------------------
          * IN THIS PROGRAM WE WILL SEARCH AN ELEMENT FROM THE ARRAY USING BINARY SEARCH -->
//-----------------------------------------------------------------------------------------------------
*/
public class BinarySearch_Algo_Ascending {
    public static void main(String[] args) {
        int[] arr = { -87, -96, -24, -8, 0, 52 }; // The array given should be sorted
        Scanner sc = new Scanner(System.in);
        System.out.println("Element to be Searched :-->");
        int target = sc.nextInt();
        int target_index = Binary_SearchOP(arr, target);
        System.out.println("The element is found at the index of:--> " + target_index);
        sc.close();
    }

    static int Binary_SearchOP(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) { // Jabtak start end se chota hoga tabtak searching karega
            int mid = start + (end - start) / 2; // How it works me ye formula kyu use kiya likha hai

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }

            // Upar wale dono statement hamesha hongi jabtak element mid me na aajaye then
            // niche wali condition.
            else {
                return mid; // Mid miljayega
            }
        }
        return -1;
    }

}
