package com.coforge.day4.abstraction;

public abstract class TwoWheeler extends Vehicle {

    @Override
    public void numberOfWheels() {
        System.out.println("I have two wheels");
    }
}