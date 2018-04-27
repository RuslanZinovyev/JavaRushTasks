package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();

        FileInputStream inputStream1 = new FileInputStream(file1);
        FileOutputStream outputStream1 = new FileOutputStream(file1);
        FileInputStream inputStream2 = new FileInputStream(file2);

        while (inputStream2.available() > 0) {
            int data = inputStream2.read();
            outputStream1.write(data);
        }

        inputStream2.close();

        while (inputStream1.available() > 0) {
            int data = inputStream1.read();
            outputStream1.write(data);
        }

        inputStream1.close();
        outputStream1.close();

    }
}
