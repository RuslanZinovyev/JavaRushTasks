package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String pattern = "MMM dd, yyyy";
        SimpleDateFormat changedFormat = new SimpleDateFormat(pattern);
        Date date = new Date(reader.readLine());
        String result = changedFormat.format(date).toUpperCase();
        System.out.println(result);

    }
}
