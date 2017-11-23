package com.javarush.task.task05.task0532;

import java.io.*;

import static java.lang.Integer.MIN_VALUE;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        int maximum = MIN_VALUE;

        if (count <= 0) {
            return;
        }
        while (count > 0) {
            int n = Integer.parseInt(reader.readLine());
            if (n > maximum) {
                maximum = n;
            }
            count--;
        }
        System.out.println(maximum);
    }
}
