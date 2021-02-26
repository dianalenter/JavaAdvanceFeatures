package oop.enums;

public class Main {
    public static void main(String[] args) {

        for (Planets planets : Planets.values()) {
            System.out.println(planets);
            Planets.JUPITER.distanceFromEarth();
        }

        System.out.println("********************");

        LengthUnit lengthUnit = LengthUnit.METER;
        System.out.println(lengthUnit + " has value " + lengthUnit.getValue());
        lengthUnit = LengthUnit.INCH;

        switch (lengthUnit) {
            case METER:
                System.out.println("We have meters ");
                break;
            case CENTIMETER:
                System.out.println("We have centimeters: ");
                break;
            case FOOT:
                System.out.println("We have foot");
                break;
            case INCH:
                System.out.println("We have inches");
                break;
        }
        System.out.println("*********************");

        for (LengthUnit unit : LengthUnit.values()) {
            System.out.println(unit);
        }
        System.out.println("***********************");
        System.out.println(lengthUnit.name());

    }
}
