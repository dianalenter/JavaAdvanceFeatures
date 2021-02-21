package oop.exercitiiexceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("intr un sir");
        try (Scanner scanner = new Scanner(System.in)) {
            if (scanner.hasNextInt()) {
                int n = scanner.nextInt();
                System.out.println("INT " + n);
            } else if (scanner.hasNextDouble()) {
                double n = scanner.nextDouble();
                System.out.println("DOUBLE " + n);
            } else {
                throw new Exception("Hey! That's not a value! Try once more.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}


