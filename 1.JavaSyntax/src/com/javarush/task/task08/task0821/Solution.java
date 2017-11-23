package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        Map<String,String> names = new HashMap<>();
        names.put("Zinovyev", "Ruslan");
        names.put("Pastukhov", "Georgiy");
        names.put("Mikhasenok", "Alexander");
        names.put("Tkach", "Nikolay");
        names.put("Zinovyev", "Victor");
        names.put("Zhidkov", "Alexander");
        names.put("Prudnikov", "Georgiy");
        names.put("Samoilov", "Anton");
        names.put("Miller", "Konstantin");
        names.put("Frolov", "Nikolay");
        return names;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
