package com.javarush.task.task15.task1518;

/* 
Статики и котики
*/

public class Solution {
    static {

        cat = new Cat();
        System.out.println(new Cat().name);

    }
    public static Cat cat;

    public static void main(String[] args) {

    }

    public static class Cat {
        public String name = "Basik";
    }
}
