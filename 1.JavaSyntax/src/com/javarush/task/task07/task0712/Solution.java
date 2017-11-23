package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }

        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 0; i < 10; i++) {
            if (list.get(i).length() > list.get(maxIndex).length()) {
                maxIndex = list.indexOf(list.get(i));
            }
        }

        for (int i = 0; i < 10; i++) {
            if (list.get(minIndex).length() > list.get(i).length()) {
                minIndex = list.indexOf(list.get(i));
            }
        }

        if (maxIndex < minIndex) {
            System.out.println(list.get(maxIndex));
        } else {
            System.out.println(list.get(minIndex));
        }
    }
}
