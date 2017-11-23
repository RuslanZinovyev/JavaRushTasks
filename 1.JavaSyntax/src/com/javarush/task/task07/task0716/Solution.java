package com.javarush.task.task07.task0716;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        list.add("руслан");//0
        list.add("лада");  //1
        list.add("лор");   //2
        list.add("роза");  //3
        list.add("мера");  //4
        list.add("лоза");  //5
        list.add("лира");  //6
        list.add("вода");  //7
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains("р") && list.get(i).contains("л")) {
                continue;
            }
            else if (list.get(i).contains("р")) {
                list.remove(i);
                i--;
            }
            else if (list.get(i).contains("л")) {
                list.add(i, list.get(i));
                i++;
            }
        }
        return list;
    }
}