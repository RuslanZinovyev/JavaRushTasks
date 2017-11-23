package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> main = new ArrayList<>();
        ArrayList<Integer> div3 = new ArrayList<>();
        ArrayList<Integer> div2 = new ArrayList<>();
        ArrayList<Integer> others = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            main.add(Integer.parseInt(reader.readLine()));
        }

        for (int i = 0; i< 20; i++) {
            if (main.get(i) % 3 == 0) {
                div3.add(main.get(i));
            } if (main.get(i) % 2 == 0) {
                div2.add(main.get(i));
            } if (main.get(i) % 3 != 0 && main.get(i) % 2 != 0) {
                others.add(main.get(i));
            }
        }

        printList(div3);
        printList(div2);
        printList(others);
    }

    public static void printList(List<Integer> list) {
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
