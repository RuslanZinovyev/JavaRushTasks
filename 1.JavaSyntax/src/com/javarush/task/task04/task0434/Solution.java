package com.javarush.task.task04.task0434;


/* 
Таблица умножения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int count = 1;
        while (count != 11) {
            int multi = 1;
            while (multi != 11) {
                System.out.print(count * multi + "  ");
                multi++;
            }
            System.out.println("  ");
            count++;
        }
    }
}
