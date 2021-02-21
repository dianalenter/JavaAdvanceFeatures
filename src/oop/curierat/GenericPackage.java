package oop.curierat;

public class GenericPackage extends StareaInterna {

    public GenericPackage() {
    }

    public void addItem(double itemWeight) {
        setWeight(getWeight() + itemWeight);
    }

    private boolean verifyNumID(String nrPachet) {
        int count = 0;
        for (int i = 0; i < nrPachet.length(); i++) {
            char[] cifre = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
            for (int j = 0; j < cifre.length; j++) {
                if (cifre[j] == nrPachet.charAt(i)) count++;
            }
        }
        if (count == nrPachet.length()) return true;
        return false;
    }

    private boolean verifyOddNumID(String nrPachet) {
        int count = 0;
        for (int i = 0; i < nrPachet.length(); i++) {
            if ((((int) nrPachet.charAt(i)) % 2) != 0) count++;
        }
        System.out.println(count);
        if (count % 3 == 0) return true;
        return false;
    }

    private boolean verifySumOfNumID(String nrPachet) {
        int sum = 0;
        for (int i = 0; i < nrPachet.length(); i++) {
            System.out.println("char" + (nrPachet.charAt(i)));
            sum += ((int) nrPachet.charAt(i) - 48);
        }
        System.out.println(sum);
        if (sum % 4 == 0) return true;
        return false;
    }

    private boolean verifyConsecutiveNumber(String nrPachet) {
        int dif = 0;
        for (int i = 1; i < nrPachet.length(); i++) {

            if ((((int) nrPachet.charAt(i) - 48) - ((int) nrPachet.charAt(i - 1) - 48)) > 5) return false;
        }
        return true;
    }

    private boolean verifyLength(String nrPachet) {
        if ((nrPachet.length() >= 10) && (nrPachet.length() <= 12)) return true;
        return false;
    }


    public boolean checkID(String nrPachet) {
        if (!verifyNumID(nrPachet)) return false;
        if (!verifyOddNumID(nrPachet)) return false;
        if (!verifySumOfNumID(nrPachet)) return false;
        if (!verifyConsecutiveNumber(nrPachet)) return false;
        if (!verifyLength(nrPachet)) return false;

        return true;
    }

}

