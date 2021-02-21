package oop.enums;

public enum LengthUnit {
    METER(1),
    CENTIMETER(4),
    FOOT(6),
    INCH(7);

    double value;

    LengthUnit(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
