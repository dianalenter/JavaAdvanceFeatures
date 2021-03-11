package designe_patterns.patterns.factory_method;

import designe_patterns.patterns.factory_method.Car;
import designe_patterns.patterns.factory_method.Glc;
import designe_patterns.patterns.factory_method.Gle;
import designe_patterns.patterns.factory_method.Glk;

public class MercedesCarFactory {
    public Car order(int budget) {
        if (budget < 20000) {
            return new Glk();
        }
        if (budget < 40000) {
            return new Glc();
        }
        return new Gle();

    }
}
