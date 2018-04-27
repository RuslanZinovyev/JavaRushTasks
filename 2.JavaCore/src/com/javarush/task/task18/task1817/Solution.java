package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        double space = 0;
        double symbols = 0;

        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            if (data == 32) {
                space++;
            }
            if (data > 0) {
                symbols++;
            }
        }
        fileInputStream.close();
        System.out.println(String.format("%.2f", space/symbols*100));

    }
}
