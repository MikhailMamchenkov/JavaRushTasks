package com.javarush.task.pro.task03.task0321;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        System.out.println("Чтобы вернуть контроль над складом введите пароль:");

        Scanner scanner = new Scanner(System.in);
                scanner.nextLine();

        if ("QWERTY".equalsIgnoreCase("qwerty")) {
            System.out.println("Контроль получен");
        } else {
            System.out.println("Пароль неверный");
        }

    }
}
