package com.coforge.day4.abstraction;

public class VehicleApp {
	public static void main(String[] args) {
		/*
		Bike honda = new Bike();
		honda.noOfEngine();
		honda.noOfWheels();
		honda.brandName();
		
		Scooty activa = new Scooty();
		activa.noOfEngine();
		activa.Bike.java;
		activa.sBrandName();
		 */
		
		VehiclePlan vehicle;
		vehicle = new Bike();
		vehicle.noOfEngine();
		vehicle.numberOfWheels();
		vehicle.brandName();
		
		vehicle = new Scooty();
		vehicle.noOfEngine();
		vehicle.numberOfWheels();
		vehicle.brandName();
		
	}
}
