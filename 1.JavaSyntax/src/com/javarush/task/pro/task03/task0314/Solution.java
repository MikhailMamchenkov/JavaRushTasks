package com.javarush.task.pro.task03.task0314;

import java.util.Scanner;

/* 
Сломанная клавиатура
*/

public class Solution {
    public static String secret = "AmIGo";

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
       String test = scr.nextLine();
        //напишите тут ваш код
        if (secret.equalsIgnoreCase(test)) {
            System.out.println("доступ разрешен");
        }
        //напишите тут ваш код
        else {
            System.out.println("доступ запрещен");
        }

    }
}
