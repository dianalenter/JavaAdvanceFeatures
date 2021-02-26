package oop.tema.exception.task1divideclass;

/**
 * Create the divide method which has to divide the two numbers that are the
 * attributes of the method. In case the second parameter of the method is 0, a
 * non-default exception should be thrown: CannotDivideBy0Exception .
 */
public class CannotDivideBy0Exception extends Exception {
    public CannotDivideBy0Exception() {
        super("Can not divide by 0!");
    }
}
