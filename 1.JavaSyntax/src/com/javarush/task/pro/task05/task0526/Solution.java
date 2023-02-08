package com.javarush.task.pro.task05.task0526;

/* 
Атака вирусов
*/

import java.util.Arrays;

public class Solution {
    public static int[][] array = new int[][]{
            {1, 2, 3, 4},
            {4, 5, 6, 7},
            {7, 8, 9, 0}};

    public static void main(String[] args) {
        printArray();
    }

    public static void printArray() {
        int[] tmp = array[0];
        array[0] = array[2];
        array[2] = tmp;
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }
}
