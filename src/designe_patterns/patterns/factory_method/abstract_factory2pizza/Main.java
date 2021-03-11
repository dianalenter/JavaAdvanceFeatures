package designe_patterns.patterns.factory_method.abstract_factory2pizza;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        PizzaFactory pizzaFactory = new PizzaFactory();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul de pizza comandate: ");
        int bucComandate = scanner.nextInt();

        Pizza pizza = pizzaFactory.getPizza(bucComandate);

        System.out.println(pizza.getDetectedPizza());

    }
}