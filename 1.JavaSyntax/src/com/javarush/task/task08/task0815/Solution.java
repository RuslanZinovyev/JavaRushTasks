package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Зиновьев", "Руслан");
        map.put("Качан", "Виктор");
        map.put("Лунев", "Олег");
        map.put("Третьяков", "Игорь");
        map.put("Борунов", "Виктор");
        map.put("Файзулин", "Александр");
        map.put("Акинфеев", "Руслан");
        map.put("Родионов", "Игорь");
        map.put("Нестман", "Олег");
        map.put("Спасский", "Виктор");
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int count = 0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            String firstName = pair.getValue();
            if (firstName.equals(name)) {
                ++count;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int count = 0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            String secondName = pair.getKey();
            if (secondName.equals(lastName)) {
                ++count;
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
