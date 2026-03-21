package org.example.ArrayBasedProgram;

import java.util.Arrays;

public class Demo20DescOrderWay2 {
    public static void main(String[] args) {

        int[] arr={2, 5, 8, 3, 7, 1, 4, 9, 6, 0};

        //bubble sort for descending
        for (int i=0;i< arr.length;i++){
            for (int j=0;j< arr.length-1;j++){
                if (arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Descending Order:");
        System.out.println(Arrays.toString(arr));
    }
}
