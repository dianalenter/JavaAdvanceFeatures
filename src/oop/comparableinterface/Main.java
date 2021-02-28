package oop.comparableinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(170);
        Person person2 = new Person(190);
        if (person1.compareTo(person2) < 0) {
            System.out.println("Person 1 is taller then person 2 ");
        } else if (person1.compareTo(person2) == 0) {
            System.out.println("This 2 persons has the same size ");

        } else {
            System.out.println("Person 2 is taller then person 1 ");
        }

        List<Person> personList = new ArrayList<>();
        personList.add(person2);
        personList.add(person1);
        System.out.println(personList);

        Collections.sort(personList);
        System.out.println(personList);
    }
}
