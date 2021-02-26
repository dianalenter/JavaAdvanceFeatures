package oop.tema.contbancar;

import oop.tema.contbancar.ContBancar;

public class ContBancarExtins extends ContBancar {
    float annualInterestRate;

    public void addMonthlyInterest() {
        this.balance += this.balance * annualInterestRate / 12;
    }

    public ContBancarExtins(float balance, float annualInterestRate) {
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }
}

