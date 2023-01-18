package com.javarush.task.pro.task04.task0416;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
/*
Share a Coke
*/
        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        double result = firstNumber * 1. / secondNumber;
        System.out.println(result);
    }
}

