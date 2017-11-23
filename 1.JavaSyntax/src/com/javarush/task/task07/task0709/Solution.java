package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> small = new ArrayList<>();
        ArrayList<String> result = new ArrayList<>();
        String min = null;
        for (int i = 0; i < 5; i++) {
            small.add(reader.readLine());
        }
        min = small.get(0);
        for (int i = 1; i < 5; i++) {

            if (min.length() > small.get(i).length()) {
                min = small.get(i);
            }
        }
        for (String s : small) {
            if (s.length() == min.length()) {
                result.add(s);
            }
        }
        for (String s : result) {
            System.out.println(s);
        }
    }
}
