package org.example.ArrayBasedProgram;

public class Demo22MultiDimensional2 {
    public static void main(String[] args) {
        int[][] array = {
                {},
                {1},
                {2, 3},
                {4, 5, 6},
                {7, 8, 9, 10}
        };
        System.out.println(array[1][0]);//1
        System.out.println(array[2][0]);//2
        System.out.println(array[2][1]);//3
        System.out.println(array[3][0]);//4
        System.out.println(array[3][1]);//5
        System.out.println(array[3][2]);//6
    }
}

//It shows how to access elements using row and column indexes
//like array[i][j]
//Different elements are printed by specifying their exact position