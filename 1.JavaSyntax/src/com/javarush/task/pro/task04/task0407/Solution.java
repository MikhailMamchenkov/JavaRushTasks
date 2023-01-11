package com.javarush.task.pro.task04.task0407;

/* 
Сумма чисел, не кратных 3
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int x = 1;
        int sum = 0;
        while (x <= 100) {
            if (x % 3 != 0) {
                sum += x;
            }
            x++;
            continue;
        }
        System.out.println(sum);
    }
}