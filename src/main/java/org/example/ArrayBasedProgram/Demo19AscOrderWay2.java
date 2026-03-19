package org.example.ArrayBasedProgram;

import java.util.Arrays;

public class Demo19AscOrderWay2 {
    public static void main(String[] args) {
        int arr[] = {5,7,3,8,2,4};

        for (int i=0;i<= arr.length;i++){
            for (int j=0;j< arr.length-1;j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Ascending Order:");
        System.out.println(Arrays.toString(arr));
    }
}
//Using Bubble Sort
