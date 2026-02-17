package org.example.ArrayBasedProgram;

public class Demo6 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90};

        for (int i=array.length-1;i>=0;i--){
            System.out.println(array[i]+" ");
        }
    }
}

//reverse order printing for index : length-1 to 0
