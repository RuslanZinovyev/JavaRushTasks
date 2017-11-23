package com.javarush.task.task08.task0812;

import sun.awt.geom.AreaOp;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;


/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            nums.add(Integer.parseInt(reader.readLine()));
        }

        int count = 1;
        int duplicates = 0;

        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) == nums.get(i + 1)) {
                count ++;

            }
            else if (count >= duplicates) {
                duplicates = count;
                count = 1;
            }
        }
        if (count > duplicates) {
            duplicates = count;
        }

        System.out.println(duplicates);
    }
}