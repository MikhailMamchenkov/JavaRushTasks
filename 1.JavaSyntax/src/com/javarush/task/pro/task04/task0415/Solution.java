package com.javarush.task.pro.task04.task0415;

import java.util.Scanner;

/* 
Площадь круга
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pi = 3.14;
        double s;

        while (scanner.hasNextInt()) {
            int inputNumber = scanner.nextInt();
            if (inputNumber < 0) {
                System.out.println("Введите целое число");
            } else {
                s = pi * inputNumber * inputNumber;
                int area = (int) s;
                System.out.println(area);
            }
            break;

        }

    }
}