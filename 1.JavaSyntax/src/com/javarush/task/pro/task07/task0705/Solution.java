package com.javarush.task.pro.task07.task0705;

/* 
Бесконечность не предел
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        div(0.0, 1.0);
        div(0.0, -1.0);
    }

    public static void div(double a, double b){
        System.out.println(b/a);
    }
}
