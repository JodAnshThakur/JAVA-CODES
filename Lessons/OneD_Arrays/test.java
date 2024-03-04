package Lessons.OneD_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String args[]){
        int[] marks = {81, 95, 42, 76, 99, 47, 87, 83, 97, 98, 96 };
        int max  = 0;
        for(int i = 0; i<marks.length;i++){
            if(marks[i] >max){
               max = marks[i];
            }
        }
        System.out.println(max);
    }
}
