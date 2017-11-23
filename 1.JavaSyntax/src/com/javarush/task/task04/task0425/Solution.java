package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int point1 = Integer.parseInt(reader.readLine());
        int point2 = Integer.parseInt(reader.readLine());

        if (point1 > 0 && point2 > 0) {
            System.out.println("1");
        } else if (point1 < 0 && point2 > 0) {
            System.out.println("2");
        } else if (point1 < 0 && point2 < 0) {
            System.out.println("3");
        } else if (point1 > 0 && point2 < 0) {
            System.out.println("4");
        }

    }
}
