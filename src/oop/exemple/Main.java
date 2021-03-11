package oop.exemple;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<String> someList = new ArrayList<>();
        someList.add("Ana");
        someList.add("Bogdan");
        someList.add("Ziana");
        someList.add("Diana");
        someList.add("Elena");
        someList.add("Cedric");
        someList.add("Vlad");
        someList.add("Rober");
        System.out.println(someList);
        String max = someList.get(0);
        for (int index = 1; index < someList.size(); index++) {
            if (someList.get(index).compareTo(max) > 0) {
                max = someList.get(index);
            }
        }
        System.out.println(max);
        Optional<String> optionalString = someList.stream()
                .max(String::compareTo);
        if (optionalString.isPresent()) {
            System.out.println(optionalString.get());
        }
    }
}
