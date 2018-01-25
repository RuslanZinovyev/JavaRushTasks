package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private int age;
        private String name;
        private String gender;
        private int weight;
        private int height;
        private String occupation;

        public Human(int age) {
            this.age = age;
        }

        public Human(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public Human(int age, String name, String gender) {
            this.age = age;
            this.name = name;
            this.gender = gender;
        }

        public Human(int age, String name, String gender, int weight) {
            this.age = age;
            this.name = name;
            this.gender = gender;
            this.weight = weight;
        }

        public Human(int age, String name, String gender, int weight, int height) {
            this.age = age;
            this.name = name;
            this.gender = gender;
            this.weight = weight;
            this.height = height;
        }

        public Human(int age, String name, String gender, int weight, int height, String occupation) {
            this.age = age;
            this.name = name;
            this.gender = gender;
            this.weight = weight;
            this.height = height;
            this.occupation = occupation;
        }

        public Human(int age, String gender, int weight, int height) {
            this.age = age;
            this.gender = gender;
            this.weight = weight;
            this.height = height;
        }

        public Human(String name, String gender, int weight, int height) {
            this.name = name;
            this.gender = gender;
            this.weight = weight;
            this.height = height;
        }

        public Human(String gender, int weight, int height, String occupation) {
            this.gender = gender;
            this.weight = weight;
            this.height = height;
            this.occupation = occupation;
        }

        public Human(int age, int weight, int height, String occupation) {
            this.age = age;
            this.weight = weight;
            this.height = height;
            this.occupation = occupation;
        }
    }
}
