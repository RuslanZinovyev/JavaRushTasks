package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human gFather1 = new Human("Анатолий", true, 77);
        Human gFather2 = new Human("Виктор", true, 80);
        Human gMother1 = new Human("Мария", false, 60);
        Human gMother2 = new Human("Людмила", false, 55);

        Human father = new Human("Руслан", true, 35, gFather1, gMother1);
        Human mother = new Human("Наталья", false, 55, gFather2, gMother2);

        Human child1 = new Human("Тристан", false, 15, father, mother);
        Human child2 = new Human("Изольда", true, 20, father, mother);
        Human child3 = new Human("Артур", false, 7, father, mother);

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
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name,
                     boolean sex,
                     int age,
                     Human father,
                     Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















