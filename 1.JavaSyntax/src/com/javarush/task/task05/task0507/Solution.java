package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double number = 0;
        double count = 0;
        double average = 0;
        while(true) {
            int n = Integer.parseInt(reader.readLine());
            if (n == -1) {
                break;
            }
            count++;
            number += n;
            average = number/count;
        }
        System.out.println(average);
    }
}

