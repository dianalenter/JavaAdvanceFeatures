package oop.lambda_expresion;

import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        Person person = new Person(30);

        //example without lambda
        Predicate<Person> adultPersonTest = new AdultPersonTest();
        System.out.println(adultPersonTest.test(person));


        //example with lambda
        Predicate<Person> adultPersonTest2 = person1 -> person1.getAge() > 30;
        System.out.println(adultPersonTest2.test(person));

        //example with lambda runable
        Runnable runnable = () -> System.out.println("Runing in runnable");
        runnable.run();

        //lambda expression method referince
        Predicate<Person> adultPersomnTest3 = Person::isAdult;
        System.out.println(adultPersomnTest3.test(person));

        Predicate<Person> adultPersomnTest4 = person::isAdult;
        System.out.println(adultPersomnTest4.test(person));

        //block of code
        UnaryOperator<Integer> square = i -> {
            int result = i * i;
            return result;
        };
        System.out.println("Result: " + square.apply(100));


    }
}
