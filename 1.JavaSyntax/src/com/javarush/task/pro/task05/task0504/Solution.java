package com.javarush.task.pro.task05.task0504;

/* 
Объединяем массивы
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static int[] firstArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
    public static int[] resultArray;

    public static void main(String[] args) {
        resultArray = new int[firstArray.length + secondArray.length];
        System.arraycopy(firstArray, 0, resultArray, 0, firstArray.length);
        System.arraycopy(secondArray, 0, resultArray, firstArray.length, secondArray.length);
        System.out.println(Arrays.toString(resultArray));
    }

 /*       resultArray = new int[firstArray.length + secondArray.length];

        for (int i = 0; i < firstArray.length; i++) {
            resultArray[i] = firstArray[i];
        }

        for (int i = 0; i < secondArray.length; i++) {

            resultArray[i + firstArray.length] = secondArray[i];

        }

        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + ", ");
        }
    }*/
}