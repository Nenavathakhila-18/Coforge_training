package com.coforge.day4.abstraction;

public class Triangle extends Figure {
	
	Triangle() {
	    super(20L,30L);
	}
	
	@Override
	public void area() {
		System.out.println("The area is " + (getBase()* getHeight()/2));
	}

}
