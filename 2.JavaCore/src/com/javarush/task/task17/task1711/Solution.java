package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут
        String name;
        Sex sex;
        Date bd;
        Person person;
        int id;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);

        switch (args[0]) {
            case "-c":
                synchronized (allPeople) {
                    for(int i = 1; i < args.length; i += 3) {
                        name = args[i];
                        sex = args[i + 1].equals("м") ? Sex.MALE : Sex.FEMALE;
                        bd = format.parse(args[i + 2]);

                        if (sex == Sex.MALE) {
                            person = Person.createMale(name, bd);
                        } else {
                            person = Person.createFemale(name, bd);
                        }
                        allPeople.add(person);
                        System.out.println(allPeople.size() - 1 + " ");
                    }
                    break;
                }

            case "-u":
                synchronized (allPeople) {
                    for(int i = 1; i < args.length; i += 4) {
                        id = Integer.parseInt(args[i]);
                        name = args[i + 1];
                        sex = args[i + 2] == "м" ? Sex.MALE : Sex.FEMALE;
                        bd = format.parse(args[i + 3]);

                        person = allPeople.get(id);
                        person.setName(name);
                        person.setSex(sex);
                        person.setBirthDay(bd);
                    }
                    break;
                }

            case "-d":
                synchronized (allPeople) {
                    for(int i = 1; i < args.length; i++) {
                        id = Integer.parseInt(args[i]);

                        person = allPeople.get(id);
                        person.setSex(null);
                        person.setBirthDay(null);
                        person.setName(null);
                    }
                    break;
                }

            case "-i":
                synchronized (allPeople) {
                    for(int i = 1; i < args.length; i++) {
                        id = Integer.parseInt(args[i]);

                        person = allPeople.get(id);
                        String s = (person.getSex() == Sex.MALE)  ? "м" : "ж";
                        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                        System.out.println(person.getName() + " " + s + " " + sdf.format(person.getBirthDay()));
                    }
                    break;
                }
            }
        }
}
