package org.example.ArrayBasedProgram;

public class Demo16Reverse3 {
    public static void main(String[] args) {
        System.out.println("using new array");
        int[] array = {10, 30, 40, 50, 11, 23};

        int[] array2 = new int[array.length];
        for (int index = array.length - 1, index2 = 0; index >= 0 && index2 < array2.length; index--, index2++) {
            array2[index2] = array[index];
        }

        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
    }
}
//2. not optimal solution : create a new array and push the values from old array from length-1 to 0
