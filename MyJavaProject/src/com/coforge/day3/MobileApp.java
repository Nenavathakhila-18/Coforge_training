package com.coforge.day3;

public class MobileApp {

    public static void main(String[] args) {

        Mobile m1 = new Mobile();

        m1.setBrand("Samsung");
        m1.setModel("Galaxy S24");
        m1.setRam(8);
        m1.setPrice(74999);

        System.out.println(m1);

        Mobile m2 = new Mobile("Apple", "iPhone 16", 8, 89999);

        System.out.println(m2);
    }
}