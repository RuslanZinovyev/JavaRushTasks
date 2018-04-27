package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        int count = 0;

        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            if ((data >= 97 && data <= 122 )|| (data >= 65 && data <= 90)) {
                count++;
            }
        }
        fileInputStream.close();
        System.out.println(count);
    }
}
