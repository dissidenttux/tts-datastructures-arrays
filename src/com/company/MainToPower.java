package com.company;

public class MainToPower {
    public static int[] toPower(int size, int power){
        int newArr[] = new int[size];
        for (int i = 0; i < size; i++) {
            newArr[i] = (int) Math.pow(i, power);
        }
        return newArr;


    }
    public static void main(String[] args) {
        /* 3. Write a public static method called "toPower" that takes in as parameters, two
        integers called size and power.
        The method should return an array of size "size" with each array index raised
        to the value of "power." So, for example,
        if we passed in "size = 4" and "power = 2" to the "toPower,"
        the method should return the following result:
            [0,1,4,9] <--- size of array is a length of 4
            index 0 : 0^2 = 0 * 2 = 0
            index 1 : 1^2 = 1 * 2 = 1
            index 2 : 2^2 = 2 * 2 = 4
            index 3 : 3^2 = 3 * 3 = 9``

            public class Main {
                public static int[] toPower(int size, int toPower){
                    return new int[]{1, 2, 3, 4}; //rewrite this method to actually calculate the output
                }
                public static void main(String[] args) {
                  System.out.println(toPower(4, 2));
                }
            }
         */

          System.out.println(toPower(4,2));
          // Debugger: newArr = [0,1,4,9]
          System.out.println();
    }
}
