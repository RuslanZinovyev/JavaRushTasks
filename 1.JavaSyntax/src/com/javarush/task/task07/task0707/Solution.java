package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Earth");
        list.add("Air");
        list.add("Sphere");
        System.out.println(list.size());
        for (String s : list) {
            System.out.println(s);
        }
    }
}
