package com.company;

import java.util.Arrays;

public class Apartment implements ComUslugaable {
    private String name;
    private String address;
    private Person[] families;

    public Apartment(String name, String address, Person[] families) {
        this.name = name;
        this.address = address;
        this.families = families;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Person[] getFamilies() {
        return families;
    }

    public void setFamilies(Person[] families) {
        this.families = families;
    }


    @Override
    public String toString() {
        return "Apartment{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", families=" + Arrays.toString(families) +
                '}';
    }

    @Override
    public void comUsluga() {
        System.out.println("Kvartira plotit comuslugy za kvartiry");
    }
}
