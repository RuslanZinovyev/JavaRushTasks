package com.javarush.task.task03.task0313;

/* 
Мама мыла раму
*/

public class Solution {
    public static void main(String[] args) {
        String s = "Мама";
        String s2 = "Мыла";
        String s3 = "Раму";
        System.out.println(s + s2 + s3);
        System.out.println(s + s3 + s2);
        System.out.println(s2 + s + s3);
        System.out.println(s2 + s3 + s);
        System.out.println(s3 + s + s2);
        System.out.println(s3 + s2 + s);
    }
}
