package org.example.ArrayBasedProgram;

public class Demo11MinElement {
    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90};

        int minValue = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        System.out.println("MinElement : " + minValue);
    }
}
