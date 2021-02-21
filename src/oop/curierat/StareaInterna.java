package oop.curierat;

public class StareaInterna {
    private String uniqueID;
    private double weight;
    private String packageName;
    private String courierName;

    public String getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(String uniqueID) {
        this.uniqueID = uniqueID;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getCourierName() {
        return courierName;
    }

    public void setCourierName(String courierName) {
        this.courierName = courierName;
    }

    @Override
    public String toString() {
        return "Pachetul " +packageName + "avand codul "+uniqueID+"si greutatea "+weight+"apartine curierului " + courierName+" .";
    }
}
