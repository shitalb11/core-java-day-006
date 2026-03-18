package org.example.ArrayBasedProgram;

import java.util.Arrays;

public class Demo17AscOrder {
    public static void main(String[] args) {

        int[] arr = {5,7,6,2,1,9};

        Arrays.sort(arr);
        System.out.println("Ascending Order:");

        for (int i : arr){
            System.out.println(i + " ");
        }
    }
}
