package com.coforge.day4.abstraction;

public abstract class Vehicle implements VehiclePlan {

    @Override
    public void noOfEngine() {
        System.out.println("I have one engine");
    }
}