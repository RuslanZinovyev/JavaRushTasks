package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> noChildren = new ArrayList<>();
        Human child1 = new Human("Ребенок1", true, 7, null);
        Human child2 = new Human("Ребенок2", false, 9, null);
        Human child3 = new Human("Ребенок3", true, 5, null);
        ArrayList<Human> children = new ArrayList<>();
        children.add(child1);
        children.add(child2);
        children.add(child3);
        Human father = new Human("Папа",true,46, children);
        Human mother = new Human("Мама",false, 35, children);
        ArrayList<Human> fatherList = new ArrayList<>();
        ArrayList<Human> motherList = new ArrayList<>();
        fatherList.add(father);
        motherList.add(mother);
        Human gFather1 = new Human("Дедушка1", true, 77, fatherList);
        Human gFather2 = new Human("Дедушка2", true, 80, motherList);
        Human gMother1 = new Human("Бабушка1", false,67, fatherList);
        Human gMother2 = new Human("Бабушка2", false,60, motherList);
        System.out.println(gFather1);
        System.out.println(gFather2);
        System.out.println(gMother1);
        System.out.println(gMother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human {
        private String name;
        private int age;
        private boolean sex;
        private ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.children == null) {
                return text;
            }

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
