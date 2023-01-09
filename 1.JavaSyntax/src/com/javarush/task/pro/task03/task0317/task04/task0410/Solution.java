package com.javarush.task.pro.task03.task0317.task04.task0410;

import java.util.Scanner;

/* 
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scr = new Scanner(System.in);
        int min = scr.nextInt();
        int secondMin = scr.nextInt();
        if (min > secondMin) {
            int tmp = secondMin;
            secondMin = min;
            min = tmp;
        }
        while (scr.hasNextInt()) {
            int number = scr.nextInt();
            if (secondMin == min && number > min) {
                secondMin = number;
            } else if (number < min) {
                secondMin = min;
                min = number;
            }
            else if (number > min && number < secondMin) {
                secondMin = number;
            }
        }
        System.out.println(secondMin);
    }
}