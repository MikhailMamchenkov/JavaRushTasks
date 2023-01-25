package com.javarush.task.pro.task05.task0524;

/* 
Взлом Кибердракона
*/

public class Solution {
    public static int[] coordinates = new int[200];

    public static void main(String[] args) {
        for (int i = 0; i < coordinates.length / 2; i++) {
            coordinates[i * 2] = i * 10;
            coordinates[i * 2 + 1] = i * 10 + 1;
        }
        for (int coordinate : coordinates) {
            System.out.print(coordinate + " ");
        }
    }
}