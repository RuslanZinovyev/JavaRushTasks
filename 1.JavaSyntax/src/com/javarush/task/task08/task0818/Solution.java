package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Zinovyev", 2000);
        map.put("Pastukhov", 2000);
        map.put("Pechugin", 2500);
        map.put("Lazarev", 1000);
        map.put("Zuev", 400);
        map.put("Mikhasenok", 490);
        map.put("Pak", 1000);
        map.put("Kargin", 3300);
        map.put("Borunov", 350);
        map.put("Pisarev", 100);
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> pair = iterator.next();
            Integer salary = pair.getValue();
            if (salary < 500) {
               iterator.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}