package com.javarush.task.pro.task04.task0408;

import java.util.Scanner;

/* 
Максимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        while (scanner.hasNextInt()) {
            int inputNumber = scanner.nextInt();
            if (inputNumber % 2 == 0 && inputNumber > max) {
                max = inputNumber;
            }
        }
        System.out.println(max);
    }
}