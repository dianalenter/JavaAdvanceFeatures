package oop.wallet;

public class Main {

    public static void main(String[] args) {
        Person john = new Person();
//        int someMoneyFromJohn = john.getWallet().take(10);
        int someMoneyFromJohn = john.pleaseGiveMeSomeMoney(10);
        System.out.println("am luat de la john " + someMoneyFromJohn);
    }
}

