package com.javarush.task.task14.task1414;

/* 
MovieFactory
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));



        while (true) {
            String key = reader.readLine();
            if (key.equals("soapOpera")) {
                String movie = MovieFactory.getMovie("soapOpera").getClass().getSimpleName();
                System.out.println(movie);
            } else if (key.equals("cartoon")) {
                String movie = MovieFactory.getMovie("cartoon").getClass().getSimpleName();
                System.out.println(movie);
            } else if (key.equals("thriller")) {
                String movie = MovieFactory.getMovie("thriller").getClass().getSimpleName();
                System.out.println(movie);
            } else {
                MovieFactory.getMovie(key);
                break;
            }
        }

    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            } else if ("cartoon".equals(key)) {
                movie = new Cartoon();
            } else if ("thriller".equals(key)) {
                movie = new Thriller();
            }
            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {

    }

    static class Cartoon extends Movie {

    }

    static class Thriller extends Movie {

    }
}
