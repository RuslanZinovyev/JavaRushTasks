package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());

        if (num < 1 || num > 999) {
        } else if (num % 2 == 0 && (num - 10) < 0) {
            System.out.println("четное однозначное число");
        } else if (num % 2 != 0 && (num - 10) < 0) {
            System.out.println("нечетное однозначное число");
        } else if (num % 2 == 0 && (num - 10) >= 0 && (num - 100) < 0) {
            System.out.println("четное двузначное число");
        } else if (num % 2 != 0 && (num - 10) >= 0 && (num - 100) < 0) {
            System.out.println("нечетное двузначное число");
        } else if (num % 2 == 0 && (num - 100) >= 0 && (num - 1000) < 0) {
            System.out.println("четное трехзначное число");
        } else if (num % 2 != 0 && (num - 100) >= 0 && (num - 1000) < 0) {
            System.out.println("нечетное трехзначное число");
        }
    }
}
