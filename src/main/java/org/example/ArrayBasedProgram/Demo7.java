package org.example.ArrayBasedProgram;

public class Demo7 {
    public static void main(String[] args) {
        int[] array = {10,20,30,40};
        int sum = 0;

        for (int i=0;i<array.length;i++){
            sum+=array[i];
        }
        System.out.println("sum of elements in array: "+sum);
    }
}
