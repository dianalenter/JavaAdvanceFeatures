package designe_patterns.patterns.abstract_factory;

public class PizzaAbstractFactory {
    public Pizza getPizza(int number) {
        if (number == 1) {
            return new Capriciosa();
        }
        if (number == 2) {
            return new FruttiDiMare();
        }
        return new FruttiDiMare();
    }
}
