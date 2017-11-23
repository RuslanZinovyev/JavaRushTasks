package com.javarush.task.task08.task0816;


import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 6 1988"));
        map.put("Zinovyev", new Date("APRIL 28 1982"));
        map.put("Tretyakov", new Date("SEPTEMBER 3 1984"));
        map.put("Pak", new Date("JULY 18 1984"));
        map.put("Samoilov", new Date("DECEMBER 25 1975"));
        map.put("Trinidad", new Date("FEBRUARY 4 2006"));
        map.put("Nestman", new Date("MAY 19 1989"));
        map.put("Kruglov", new Date("AUGUST 5 1957"));
        map.put("Andreev", new Date("JUNE 1 1980"));
        map.put("Simenyuk", new Date("OCTOBER 5 1970"));
        return map;
    }

//    public static void removeAllSummerPeople(HashMap<String, Date> map) {
//        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
//        while (iterator.hasNext()) {
//        Map.Entry<String, Date> pair = iterator.next();
//        Date date = pair.getValue();
//        if (date.getMonth() >= 5 && date.getMonth() <= 7) {
//            iterator.remove();
//            }
//        }
//    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            HashMap.Entry<String, Date> entry = iterator.next();
            System.out.println(entry.getValue().toString());
            if (entry.getValue().toString().contains("Jun") || entry.getValue().toString().contains("Jul") || entry.getValue().toString().contains("Aug")){
                System.out.println("true");
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
        HashMap<String, Date> map = createMap();
        removeAllSummerPeople(map);
        for (Map.Entry<String, Date> pair : map.entrySet()) {
            String key = pair.getKey();
            Date value = pair.getValue();
            System.out.println(key + " " + value);
        }
    }
}
