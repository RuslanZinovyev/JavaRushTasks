package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Zinovyev", "Ruslan");
        map.put("Pastukhov", "Andrey");
        map.put("Aisenov", "George");
        map.put("Sharifullin", "Ruslan");
        map.put("Absagat", "Victor");
        map.put("Kargin", "Petr");
        map.put("Florov", "Vladimir");
        map.put("Lazarev", "Anton");
        map.put("Zuev", "Andrey");
        map.put("Nestman", "Victor");
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        HashMap<String, String> copy = new HashMap<>(map);
        for (Iterator<Map.Entry<String, String>> it = copy.entrySet().iterator(); it.hasNext();) {
            Map.Entry<String, String> pair = it.next();
            for (Iterator<Map.Entry<String, String>> it2 = copy.entrySet().iterator(); it2.hasNext();) {
                Map.Entry<String, String> pair2 = it2.next();
                if (pair.getValue().equals(pair2.getValue()) && pair.getKey()!=pair2.getKey()) {
                    removeItemFromMapByValue(copy, pair.getValue());
                }
            }

        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {


    }
}
