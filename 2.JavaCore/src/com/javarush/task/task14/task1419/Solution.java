package com.javarush.task.task14.task1419;

import java.io.File;
import java.util.*;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {
        exceptions.add(new InputMismatchException());
        exceptions.add(new IllegalArgumentException());
        exceptions.add(new ArrayIndexOutOfBoundsException());
        exceptions.add(new IndexOutOfBoundsException());
        exceptions.add(new ArithmeticException());
        exceptions.add(new NullPointerException());
        exceptions.add(new EmptyStackException());
        exceptions.add(new IllformedLocaleException());
        exceptions.add(new ArrayStoreException());
        exceptions.add(new ClassCastException());
    }
}
