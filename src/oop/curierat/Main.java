package oop.curierat;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Pachetul"+ packageName+"având codul" +uniqueID+ "și greutatea" +weight+ "aparține curierului" +courierName);
        GenericPackage genericPackage = new GenericPackage();
        genericPackage.setUniqueID("213142341425");
        genericPackage.setWeight(2.5);
        genericPackage.setPackageName("LaptopAssus");
        genericPackage.setCourierName("FanCurier");

        System.out.println(genericPackage.checkID(genericPackage.getUniqueID()));
        genericPackage.addItem(4.5);
        System.out.println("Greutatea: "+genericPackage.getWeight());
        System.out.println(genericPackage);


      //  genericPackage.verifyOddNumID(genericPackage.getUniqueID())
//        String numar = "456357";
//        System.out.println("Number:" + Integer.parseInt(numar));
    }
}
