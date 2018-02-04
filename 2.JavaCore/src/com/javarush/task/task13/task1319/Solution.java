package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new FileWriter(reader.readLine()));

        while (true) {
            String data = reader.readLine();
            if (data.equals("exit")) {
                writer.write(data + "\r\n");
                break;
            } else {
                writer.write(data + "\r\n");
            }
        }
            writer.close();
    }
}
