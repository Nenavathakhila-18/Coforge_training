package com.coforge.day4.abstraction;

public class Square extends Figure{
	
	Square() {
	    super(10);
	}
	
	@Override
	public void area() {
		System.out.println("The area is " + (getSide()* getSide()));
	}

}
