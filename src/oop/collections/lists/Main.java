package oop.collections.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> counties = new ArrayList<>();
        counties.add("Brasov");
        counties.add("Maramures");
        counties.add("Cluj");

        System.out.println(counties.indexOf("Cluj")); //ne arata pozitia
        System.out.println(counties.size());
        System.out.println("******after remove");

        counties.remove("Brasov");
        System.out.println(counties.indexOf("Cluj"));
        System.out.println(counties.size());


        System.out.println(counties);
        System.out.println("**************************show list with for clasic");
        for (int i = 0; i < counties.size(); i++) {
            System.out.println(counties.get(i));
        }
        System.out.println("1*************************show list with foreach");
        for (String element : counties) {
            System.out.println(element);
        }
        System.out.println("2*************************show list with foreach");
        counties.forEach(System.out::println);

        System.out.println("3*************************show list with iterator");
        Iterator<String> iterator = counties.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
