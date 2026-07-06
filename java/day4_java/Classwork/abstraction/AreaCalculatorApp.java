package com.coforge.day4.abstraction;

public class AreaCalculatorApp {
	
	public static void main(String[] args) {
		
		/*
		Rectangle rectangle = new Rectangle();
		Square square = new Square();
		Triangle triangle = new Triangle();
		
		rectangle.area();
		square.area();
		triangle.area();
		*/
		
		AreaPlan figure; // giving reference to the interface
		
		figure = new Rectangle();
		figure.area();
		
		figure = new Triangle();
		figure.area();
		
		figure = new Square();
		figure.area();
		
		 // Rectangle rectangle = (Rectangle) new Figure(5); 
		 // reverse is not possible
	}

}
