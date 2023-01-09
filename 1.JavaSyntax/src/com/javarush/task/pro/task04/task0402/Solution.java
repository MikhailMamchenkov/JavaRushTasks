package com.javarush.task.pro.task04.task0402;

import java.util.Scanner;

/* 
Все любят Мамбу
*/

public class Solution {
    public static void main(String[] args) {
        String text = " любит меня.";
        //напишите тут ваш код
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        while (count < 10) {
            count++;
            System.out.println(name + text);
        }
    }
}
