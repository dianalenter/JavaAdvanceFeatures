package designe_patterns.patterns.abstract_factory;

public class Main {
    public static void main(String[] args) {
        PizzaAbstractFactory pizzaAbstractFactory = new PizzaAbstractFactory();
        Pizza pizza1 = pizzaAbstractFactory.getPizza(5);
        System.out.println(pizza1.getDetectedPizza());
    }
}
