package designe_patterns.patterns.factory_method.abstract_factory2pizza;

public class PizzaFactory {
    public Pizza getPizza(int number) {
        if (number < 45) {
            return new Capriciosa();
        }
        if (number < 150) {
            return new Margherita();
        }
        return new FruttiDiMare();
    }
}