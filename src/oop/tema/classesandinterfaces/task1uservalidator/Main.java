package oop.tema.classesandinterfaces.task1uservalidator;

public class Main {
    public static void main(String[] args) {
        UserValidator userValidator = new UserValidator();
        String[] results = userValidator.validateEmails("dianacurca20@gmail.com","@yahoo.com");
        System.out.println(results[0]);
        System.out.println(results[1]);

    }
}
