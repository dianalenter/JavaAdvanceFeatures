package oop.exceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**Try-Catch-Finnaly*/
        try {
//            String text = null;
//            text.toString();
//            int x = 5 / 0;

            int[] array = {5, 7};
            int index = 3;
            printArrayElement(array, index);

        } catch (ArithmeticException | MyException arithmeticException) {
            System.out.println("Aritmetic exception " + arithmeticException.getMessage());
        } finally {
            System.out.println("This will be no matter what the value is ");
        }


    }

    public static void printArrayElement(int[] array, int index) throws MyException {
        if (index < 0 || index >= array.length) {
            throw new MyRuntimeException("Incorrect index value ");
        }

        System.out.println(array[index]);
    }

//    String n=null;
//
//    System.out.println("introdu un sir ");
//
//    try(  Scanner scanner = new Scanner(System.in)){
//        n=scanner.next();
//        Integer.parseInt((n));
//        System.out.println("INT " + Integer.parseInt(n));
//    }catch(
//    NumberFormatException e )
//            try
//
//    {
//        Double.parseDouble(n);
//        System.out.println("Double" + Double.parseDouble(n));
//    }catch(
//    NumberFormatException e1)
//
//    {
//        System.out.println("ai introdus un string ");
//    }


}
