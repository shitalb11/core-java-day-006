package org.example.ArrayBasedProgram;

public class Demo24MultiDimensional4 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5},
                {7, 8, 9}
        };
      for (int row=0;row< array.length;row++){
               for (int col=0;col< array[row].length;col++){
//                 System.out.println(array[row][col] + " ");//println line by line khali jata
                   System.out.print(array[row][col] + " ");//as it is print!!
               }
          System.out.println();
        }
    }
}

//print() → same line madhe print
//println() → next line la move
