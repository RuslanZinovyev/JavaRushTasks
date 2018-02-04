package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InputStream stream = new FileInputStream(reader.readLine());
        BufferedReader numbers = new BufferedReader(new InputStreamReader(stream));
        ArrayList<Integer> list = new ArrayList<>();
        String s;

        while ((s = numbers.readLine()) != null) {
            int data = Integer.parseInt(s);

            if (data % 2 == 0) {
                list.add(data);
            }
        }

        Collections.sort(list);
        for (Integer i : list) {
            System.out.println(i);
        }

        stream.close();

    }
}
