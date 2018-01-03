package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        HashMap<String, Cat> cats = new HashMap<>();
        cats.put("мурзик", new Cat("мурзик"));
        cats.put("басик", new Cat("басик"));
        cats.put("рыжик", new Cat("рыжик"));
        cats.put("вася", new Cat("вася"));
        cats.put("пупсик", new Cat("пупсик"));
        cats.put("барсик", new Cat("барсик"));
        cats.put("пантера", new Cat("пантера"));
        cats.put("бублик", new Cat("бублик"));
        cats.put("лилу", new Cat("лилу"));
        cats.put("наполеон", new Cat("наполеон"));
        return cats;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> cats = new HashSet<>(map.values());
        return cats;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
