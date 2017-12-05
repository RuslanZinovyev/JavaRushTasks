package com.javarush.task.task08.task0827;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) throws ParseException {
        DateFormat df = new SimpleDateFormat("MMM d yyyy");
        Date endDate;
        try {
            endDate = df.parse(date);
            Calendar cal = Calendar.getInstance();
            cal.setTime(endDate);
            int year = cal.get(Calendar.YEAR);
            Calendar myCalendar = new GregorianCalendar(year, 0, 1);
            Date startDate = myCalendar.getTime();
            Long amount = ((endDate.getTime() - startDate.getTime()) / (1000 * 60 * 60 * 24)) + 1;
            if (amount % 2 == 0) {
                return false;
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return true;
    }
}
