package designe_patterns.patterns.factory_method.abstract_factory1pizza;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new PizzaFactory();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul de ordine: ");
        int numarOrdine = scanner.nextInt();
        Pizza pizza = pizzaFactory.getPizza(numarOrdine);
        System.out.println(pizza.getDetectedPizza());
    }
}
