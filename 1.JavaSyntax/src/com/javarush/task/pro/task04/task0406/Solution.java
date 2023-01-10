package com.javarush.task.pro.task04.task0406;

import java.util.Scanner;

/* 
Показываем, что получаем
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println("Введите загаданное слово");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String inputWord = scanner.nextLine();
            if (inputWord.equals("enough")) {
                break;
            } else {
                System.out.println(inputWord);
            }
        }
    }
}