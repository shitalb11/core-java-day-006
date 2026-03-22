package org.example.ArrayBasedProgram;

public class Demo23MultiDimensional3 {
    public static void main(String[] args) {
        String[][] array1 = {
                {},
                {"a","b"},
                {"c","d","e"},
        };
        System.out.println(array1);//hashcode
        System.out.println(array1[0]);//hashcode
        System.out.println(array1[1]);//hashcode
        System.out.println(array1[2]);//hashcode

        String[][] array2 = new String[2][2];
        System.out.println(array2[0][0]);//null
        System.out.println(array2[0][1]);//null
        System.out.println(array2[1][0]);//null
        System.out.println(array2[0][1]);//null
    }
}
