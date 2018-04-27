package com.javarush.task.task18.task1801;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();

        FileInputStream fileInputStream = new FileInputStream(file);
        int maxByte = 0;

        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            if (data > maxByte) {
                maxByte = data;
            }
        }
        fileInputStream.close();
        System.out.println(maxByte);
    }
}
