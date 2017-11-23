package com.javarush.task.task03.task0304;

/* 
Задача на проценты
*/

public class Solution {
    public static double addTenPercent(int i) {
        double result = i + (i * 10/100.0);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(addTenPercent(9));
    }
}
