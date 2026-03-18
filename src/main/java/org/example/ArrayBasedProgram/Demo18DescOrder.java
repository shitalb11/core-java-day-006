package org.example.ArrayBasedProgram;

import java.util.Arrays;

public class Demo18DescOrder {
    public static void main(String[] args) {
        int[] arr={5,8,3,2,7};
        Arrays.sort(arr);
        System.out.println("Descending Order:");
        for (int i=arr.length-1;i>=0;i--){
            System.out.println(i + " ");
        }
    }
}
