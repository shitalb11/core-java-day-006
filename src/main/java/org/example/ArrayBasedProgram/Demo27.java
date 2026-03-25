package org.example.ArrayBasedProgram;

public class Demo27 {
    public static void main(String[] args) {
        int[] array1 = {10, 30, 40, 50, 60, 80, 90};

        int[] array2 = new int[array1.length];
        for (int i=0;i<array1.length;i++){
            array2[i]=array1[i];
        }
        System.out.println("printing array 2");
        for (int i=0;i<array2.length;i++){
            System.out.print(array2[i]+" ");
        }
     }
}
