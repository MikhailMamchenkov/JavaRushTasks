package com.javarush.task.pro.task03.task0305;

import java.util.Scanner;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scr = new Scanner(System.in);
        int num1 = scr.nextInt();
        int num2 = scr.nextInt();
        int num3 = scr.nextInt();
        if (num1 == num2 && num2 == num3) {
            System.out.print(num1 + " " + num2 + " " + num3);
        }
        if (num1 == num2 && num2 != num3) {
            System.out.print(num1 + " " + num2);
        }
        if (num1 != num2 && num2 == num3) {
            System.out.print(num2 + " " + num3);
        }
        if (num1 != num2 && num1 == num3) {
            System.out.print(num1 + " " + num3);
        }
        else {
        }
    }
}
