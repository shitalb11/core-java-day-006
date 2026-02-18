package org.example.ArrayBasedProgram;

import java.util.Arrays;

public class Demo3Demoss {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50};

        System.out.println(array); //[I@7b23ec81
        System.out.println(Arrays.toString(array)); //Correct way to print array contents
        System.out.println(array[0]); //10
        System.out.println(array[1]); //20
        System.out.println(array[2]); //30
        System.out.println(array[3]); //40
        System.out.println(array[4]); //50
        System.out.println(array[5]); //ArrayIndexOutOfBoundsException
    }
}
