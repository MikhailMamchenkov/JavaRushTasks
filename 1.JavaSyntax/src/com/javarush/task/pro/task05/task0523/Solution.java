package com.javarush.task.pro.task05.task0523;

/* 
Охота на Кибердракона
*/

public class Solution {
    public static int[] coordinates = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        for (int coordinate : coordinates) {
            if (coordinate % 2 != 0) {
                x += coordinate;
            } else {
                y += coordinate;
            }
        }
        System.out.println("(" + x +";"+ y + ")");
    }
}
