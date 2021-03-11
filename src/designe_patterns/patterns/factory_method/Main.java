package designe_patterns.patterns.factory_method;

public class Main {
    public static void main(String[] args) {
        MercedesCarFactory mercedesCarFactory = new MercedesCarFactory();
        Car car1 = mercedesCarFactory.order(20000);
        System.out.println(car1.getModel());
    }
}
