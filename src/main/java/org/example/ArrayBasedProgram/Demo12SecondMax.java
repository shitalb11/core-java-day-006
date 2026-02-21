package org.example.ArrayBasedProgram;

public class Demo12SecondMax {
    public static void main(String[] args) {

        int[] array={78,90,89,78,98,76,57,80,90,93,78,75};

        int firstTopper=Integer.MIN_VALUE;
        int secondTopper=Integer.MAX_VALUE;

        for (int i=0;i<array.length;i++){
            if (array[i] > firstTopper){
                secondTopper=firstTopper;
                firstTopper=array[i];
            }
            if (array[i] > secondTopper && array[i]<firstTopper){
                secondTopper=array[i];
            }
        }
        System.out.println("first topper:" + firstTopper);
        System.out.println("second topper: " + secondTopper);
    }
}
