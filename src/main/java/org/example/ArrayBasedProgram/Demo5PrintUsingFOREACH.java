package org.example.ArrayBasedProgram;

public class Demo5PrintUsingFOREACH {
    public static void main(String[] args) {
         int[] array = {10,20,30,40,50,60,70,80,90};

         for(int e : array){
             System.out.println(e+",");
         }
    }
}

//an enhanced for loop --> for (int e : array)  "You only need to read values"
//e --> a temporary variable that holds each element one by one
//For each value inside array, store it in e and print it.
