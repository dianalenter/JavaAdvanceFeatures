package oop.inputoutput;

import java.io.Serializable;

public class Person implements Serializable {
    private String firtsName;  //transient opreste atributul respectiv pentru a fi serializat sau deserializat....ascund datele
    private String lastName;

    public Person(String firtsName, String lastName) {
        this.firtsName = firtsName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firtsName='" + firtsName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
