package org.example.ArrayBasedProgram;

public class Demo21MultiDimensional1 {
    public static void main(String[] args) {
        int[][] array = {
                {},
                {1},
                {2, 3},
                {4, 5, 6},
                {7, 8, 9, 10}
        };

        System.out.println(array);//hashCode
        System.out.println(array.length);//5
        System.out.println(array[0]);//hashCode
        System.out.println(array[1]);//hashCode
        System.out.println(array[2]);//hashCode
        System.out.println(array[3]);//hashCode
        System.out.println(array[4]);//hashCode
        System.out.println(array[5]);//ArrayIndexOutOfBoundsException
    }
}

//***Array of arrays (2D Array / Multi-dimensional array)--->
//1. int[][] means array of arrays (2D array)
//2. It stores multiple arrays inside one main array
//3. Each element is itself an array (row)
//4. int[][] is used to create a 2D array where each element is an array itself.