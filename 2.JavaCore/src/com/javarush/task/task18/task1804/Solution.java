package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        List<Integer> listData = new ArrayList<>();
        Set<Integer> result = new TreeSet<>();
        int min = Byte.MAX_VALUE;
        int count = 0;

        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            listData.add(data);
        }

        fileInputStream.close();

        for (int i = 0; i < listData.size(); i++) {
            count = Collections.frequency(listData, listData.get(i));
            if (count <= min) {
                min = count;
            }
        }

        for (int i = 0; i < listData.size(); i++) {
            count = Collections.frequency(listData, listData.get(i));
            if (min == count) {
                result.add(listData.get(i));
            }
        }
        for (Integer i : result) {
            System.out.print(i + " ");
        }
    }
}
