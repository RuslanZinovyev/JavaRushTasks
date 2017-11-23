package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        while(true) {
            String s = reader.readLine();
            if (s.equals("сумма")) {
                System.out.println(sum);
                return;
            }
            int n = Integer.parseInt(s);
            sum = sum + n;
        }
    }
}
