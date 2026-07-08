package com.coforge.day4;

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
		
		Figure figure;
		
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
