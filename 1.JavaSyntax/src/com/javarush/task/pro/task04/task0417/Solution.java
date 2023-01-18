package com.javarush.task.pro.task04.task0417;

import java.util.Scanner;

/* 
Скорость ветра
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNumber = scanner.nextInt();
        double tempInputNumber = inputNumber * 3.6;
        long result = Math.round(tempInputNumber);
        System.out.println(result);
    }

}
