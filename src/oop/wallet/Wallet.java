package oop.wallet;

public class Wallet {

    private int valueInRon;

    public Wallet(int valueInRon) {
        this.valueInRon = valueInRon;
    }

    public int take(int howMuchYouTake) {
        if (valueInRon >= howMuchYouTake) {
            valueInRon = valueInRon - howMuchYouTake;
            return howMuchYouTake;
        }
        return 0;
    }
}

