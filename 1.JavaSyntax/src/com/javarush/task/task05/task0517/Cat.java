package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    private String name;
    private int age;
    private int weight;
    private String address;
    private String color;

    public Cat(String name) {
        this.name = name;
        this.age = 3;
        this.weight = 5;
        this.address = null;
        this.color = "Black";
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.address = null;
        this.color = "White";
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 4;
        this.address = null;
        this.color = "Grey";
    }

    public Cat(int weight, String color) {
        this.name = null;
        this.age = 2;
        this.weight = weight;
        this.address = null;
        this.color = color;
    }

    public Cat(int weight, String color, String address) {
        this.name = null;
        this.age = 6;
        this.weight = weight;
        this.address = address;
        this.color = color;
    }

    public static void main(String[] args) {

    }
}
