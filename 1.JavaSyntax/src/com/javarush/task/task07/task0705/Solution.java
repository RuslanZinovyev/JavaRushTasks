package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] large = new int[20];

        for (int i = 0; i < large.length; i++) {
            large[i] = Integer.parseInt(reader.readLine());
        }

        int[] num1 = new int[10];
        for (int i = 0; i < num1.length; i++) {
            num1[i] = large[i];
        }

        int count = 10;
        int[] num2 = new int[10];
        for (int i = 0; i < num2.length; i++) {
            num2[i] = large[count];
            count++;
        }

        for (int i = 0; i < num2.length; i++) {
            System.out.println(num2[i]);
        }
    }
}
