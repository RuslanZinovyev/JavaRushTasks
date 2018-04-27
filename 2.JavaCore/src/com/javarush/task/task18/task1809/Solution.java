package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        FileInputStream inputStream = new FileInputStream(fileName1);
        FileOutputStream outputStream = new FileOutputStream(fileName2);
        List<Integer> list = new ArrayList<>();

        while (inputStream.available() > 0) {
            int data = inputStream.read();
            list.add(data);
        }

        inputStream.close();

        Collections.reverse(list);
        for (Integer i : list) {
            outputStream.write(i);
        }

        outputStream.close();
    }
}
