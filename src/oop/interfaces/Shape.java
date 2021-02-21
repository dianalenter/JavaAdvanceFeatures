package oop.interfaces;

public interface Shape {

    double getArea();

    double getPerimeter();

    default void print() {
        System.out.println("This Shape: " + this + " ");
    }
}
