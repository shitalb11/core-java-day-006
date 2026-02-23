package org.example.ArrayBasedProgram;

public class Demo15Reverse2 {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9,9,0};

        for (int i=array.length-1;i>=0;i--){
            System.out.println(array[i] + " ");
        }
    }
}

//1. print from length-1 to 0