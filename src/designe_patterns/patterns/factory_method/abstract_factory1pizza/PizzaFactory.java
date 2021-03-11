package designe_patterns.patterns.factory_method.abstract_factory1pizza;

public class PizzaFactory {
    public Pizza getPizza(int number){
        if (number==1){
            return new Capriciosa();
        }
        if (number==2){
            return new Margherita();
        }
        return new FruttiDiMare();
    }
}