package org.example.ArrayBasedProgram;

public class Demo25MultiDiemensional5 {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] matrix2 = {
                {11, 12, 13},
                {14, 15, 16},
                {17, 18, 19}
        };

        int[][] result=new int[matrix1.length][matrix2.length];

        for(int row=0;row<result.length;row++){
            for (int col=0;col<result[row].length;col++){
                result[row][col]=matrix1[row][col]+matrix2[row][col];
            }
        }
        //1 + 11 = 12
        //2 + 12 = 14
        //3 + 13 = 16

        for(int row=0;row<result.length;row++){
            for (int col=0;col<result[row].length;col++){
                System.out.print(result[row][col]+" ");
            }
            System.out.println();
//            12 14 16
//            18 20 22
//            24 26 28
        }
    }
}

//You created 2 matrices
//Added them element by element
//Stored result in new matrix
//Printed the final answer
