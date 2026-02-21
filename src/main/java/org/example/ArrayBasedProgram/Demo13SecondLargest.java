package org.example.ArrayBasedProgram;

public class Demo13SecondLargest {
    public static void main(String[] args) {
        int[] array={78,90,89,78,98,76,57,80,90,93,78,75};

        int max=array[0];
        int secondMax=array[1];

        for (int i=0;i<array.length;i++){
            if (array[i] > max){
                secondMax=max;
                max=array[i];
            } else if (array[i]>secondMax && array[i]!=max) {
                secondMax=array[i];
            }
        }
        System.out.println("second topper: " + secondMax);
    }
}
