package oop.map;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> countries = new HashMap<>();
        countries.put("Germany", "Berlin");
        countries.put("Danemarca", "Copenhaga");
        System.out.println(countries);
        countries.put("Germany", "Berlin");
        System.out.println(countries);
        for (Map.Entry<String, String> entry : countries.entrySet()) {
            System.out.printf("%s : %s\n", entry.getKey(), entry.getValue());
        }

    }
}
