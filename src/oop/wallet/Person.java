package oop.wallet;

public class Person {

    private Wallet wallet = new Wallet(100);

    public Wallet getWallet() {
        return wallet;
    }

    public int pleaseGiveMeSomeMoney(int amount) {
        return wallet.take(amount);
    }
}

