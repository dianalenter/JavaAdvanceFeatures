package oop.tema.exception.task1divideclass;

public class MathUtils {
    public static float divide(int a, int b) throws CannotDivideBy0Exception {
        if (b == 0) {
            throw new CannotDivideBy0Exception();
        }
        return a / b;
    }
}
