package com.javarush.task.task15.task1507;

/* 
ООП - Перегрузка
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(int a, int b, int c) {
        System.out.println(a + b + c);

    }

    public static void printMatrix(String x, int a) {
        System.out.println(x + a);
    }

    public static void printMatrix(String x, String v) {
        System.out.println("Hello " + x + v);
    }

    public static void printMatrix(int z, Object line) {
        System.out.println(line + " " + z);
    }

    public static void printMatrix(String face, String body, int x) {
        System.out.println(face + " " + body + " " + x);
    }

    public static void printMatrix(int x, Object c, String f) {
        System.out.println(c + " " + f + x);
    }

    public static void printMatrix(Object x, Object v) {
        System.out.println(x + " " + v);
    }

    public static void printMatrix(String z, String x, String c) {
        System.out.println(z + x + c);
    }
}
