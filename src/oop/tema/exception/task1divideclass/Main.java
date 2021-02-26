package oop.tema.exception.task1divideclass;

import static oop.tema.exception.task1divideclass.MathUtils.divide;

public class Main {
    public static void main(String[] args) throws CannotDivideBy0Exception {
        MathUtils:divide(10, 2);
        System.out.println("Can be divide!");
    }

}
