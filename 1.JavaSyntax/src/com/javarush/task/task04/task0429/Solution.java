package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int pos = 0;
        int neg = 0;

        List<Integer> numbers = new ArrayList<>();
        numbers.add(a);
        numbers.add(b);
        numbers.add(c);

        for (Integer n : numbers) {
            if (n < 0) {
                neg++;
            } else if (n > 0) {
                pos++;
            }
        }
        System.out.println("количество отрицательных чисел: " + neg + "\n" +
                "количество положительных чисел: " + pos);

    }
}
