package com.coforge.classwork.day3;

public class EmployeeApp {

	public static void main(String[] args) {
		Employee akhila = new Employee(101,"akhila",40000.0);
		akhila.display();
		
		Employee akash = new Employee(102,"akash",30000.0);
		akash.display();
		
		akhila.setSalary(50000);
		akhila.display();
		
		System.out.println(akash.getSalary());

	}

}