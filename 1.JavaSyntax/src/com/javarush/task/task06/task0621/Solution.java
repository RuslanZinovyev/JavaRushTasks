package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Cat grandFather = new Cat(reader.readLine());
        Cat grandMother = new Cat(reader.readLine());

        Cat father = new Cat(reader.readLine(), grandFather, null);
        Cat mother = new Cat(reader.readLine(), null, grandMother);

        Cat son = new Cat(reader.readLine(), father, mother);
        Cat daughter = new Cat(reader.readLine(), father, mother);

        System.out.println(grandFather);
        System.out.println(grandMother);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son);
        System.out.println(daughter);
    }

    public static class Cat {
        private String name;
        private Cat father;
        private Cat mother;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat father, Cat mother) {
            this.name = name;
            this.father = father;
            this.mother = mother;
        }

        @Override
        public String toString() {
            if (father == null && mother == null)
                return "Cat name is " + name + ", no mother, no father";
            else if (mother == null) {
                return "Cat name is " + name + ", no mother, father is " + father.name;
            } else if (father == null) {
                return "Cat name is " + name + ", mother is " + mother.name + ", no father";
            } else {
                return "Cat name is " + name + ", mother is " + mother.name + ", father is " + father.name;
            }
        }
    }
}
