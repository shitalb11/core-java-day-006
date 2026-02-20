package org.example.ArrayBasedProgram;

public class Demo10MaxElement {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90};

//        int[] array={}; //-2147483648 -->if array is empty

        int max=Integer.MIN_VALUE;

        for (int i=0;i<array.length;i++){
            if (array[i]>max){
                max=array[i];
            }
        }
        System.out.println(max);
    }
}
