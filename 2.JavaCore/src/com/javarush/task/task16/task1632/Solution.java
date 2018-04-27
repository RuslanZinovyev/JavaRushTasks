package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

public static class Thread1 extends Thread {
    @Override
    public void run() {
        while (true) {}
    }
}

public static class Thread2 extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(0);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException");
        }
    }
}

public static class Thread3 extends Thread {
    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("Ура");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public static class Thread4 extends Thread implements Message {

    boolean isCancel = false;

    @Override
    public void run() {
        while (!isCancel) {
        }
    }

    @Override
    public void showWarning() {
        isCancel = true;
    }
}

public static class Thread5 extends Thread {
    @Override
    public void run() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer result = 0;
        try {
                while (true) {
                    String sum = reader.readLine();
                    if (sum.equals("N")) {
                        System.out.println(result);
                        break;
                    }
                    result += Integer.parseInt(sum);
                }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

static {
    threads.add(new Thread1());
    threads.add(new Thread2());
    threads.add(new Thread3());
    threads.add(new Thread4());
    threads.add(new Thread5());
}

    public static void main(String[] args) {
        threads.get(4).start();
    }
}