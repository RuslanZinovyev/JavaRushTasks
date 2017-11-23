package com.javarush.task.task04.task0437;


/* 
Треугольник из восьмерок
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        for (int i = 9; i >= 0; i--) {
            for (int j = i; j <= 9; j++) {
                System.out.print(8);
            }
            System.out.println();
        }
    }
}
