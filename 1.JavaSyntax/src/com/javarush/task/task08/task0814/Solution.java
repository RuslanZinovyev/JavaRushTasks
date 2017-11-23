package com.javarush.task.task08.task0814;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 1; i < 21; i++) {
            set.add(i);
        }
        return set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (Integer x : set) {
            if (x > 10) {
                temp.add(x);
            }
        }
        set.removeAll(temp);
        return set;
    }

    public static void main(String[] args) {

    }
}
