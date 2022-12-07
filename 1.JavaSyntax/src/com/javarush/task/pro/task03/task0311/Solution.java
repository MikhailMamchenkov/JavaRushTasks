package com.javarush.task.pro.task03.task0311;

import java.util.Scanner;

/* 
Высокая точность
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scr = new Scanner(System.in);
        double num1 = scr.nextDouble();
        double num2 = scr.nextDouble();
        if (num1 - num2 < 0.000001 & num2 - num1 < 0.000001) {
            System.out.println("числа равны");
        }
        else {
            System.out.println("числа не равны");
        }

    }
}
