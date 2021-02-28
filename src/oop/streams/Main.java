package oop.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ana", "Ion", "Maria");
        Stream<String> namesStream = names.stream();

        List<String> namesCopy = names.stream().collect(Collectors.toList());
        System.out.println(namesCopy);

        Optional<String> firstElement = names.stream().findFirst();
        if (firstElement.isPresent()) {
            System.out.println(firstElement.get());
        }

        System.out.println("************");
        List<String> nameStartingWithI = names.stream()
                .filter(element -> element.startsWith("I"))
                .collect(Collectors.toList());
        System.out.println(nameStartingWithI);

        System.out.println("************");
        List<Integer> wordsSizeFinisWhitA = names.parallelStream()
                .filter(element -> element.endsWith("a"))
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(wordsSizeFinisWhitA);

        System.out.println("************");
        names.stream().forEach(element-> System.out.println(element));
    }
}
