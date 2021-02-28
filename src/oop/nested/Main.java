package oop.nested;

public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        System.out.println(bicycle.getMaxSpeed());

        Bicycle.Weel weel = bicycle.new Weel();
        weel.repair();
        System.out.println(bicycle.getMaxSpeed());

        Bicycle.Mechanic mechanic = new Bicycle.Mechanic();
        mechanic.damage(bicycle);
        System.out.println(bicycle.getMaxSpeed());
    }
}
