package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
*/

import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        Date date = new Date();
        String str = new SimpleDateFormat("dd MM yyyy").format(date);
        System.out.println(str);
    }
}
