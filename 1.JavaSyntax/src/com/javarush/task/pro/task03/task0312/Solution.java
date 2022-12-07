package com.javarush.task.pro.task03.task0312;

import java.util.Scanner;

/* 
Сравним строки
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scr = new Scanner(System.in);
        String s1 = scr.nextLine();
        String s2 = scr.nextLine();
        if (s1.equals(s2)) {
            System.out.println("строки одинаковые");
        } else {
            System.out.println("строки разные");
        }
    }
}
