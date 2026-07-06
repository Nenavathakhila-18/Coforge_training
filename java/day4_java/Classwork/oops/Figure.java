package com.coforge.day4;

public class Figure {
	
	private int length;
	private int breadth;
	private long height;
	private int side;
	private long base;
	
	Figure(int length,int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	Figure(int side){
		this.side = side;
	}
	
	Figure(long base,long height){
		this.base = base;
		this.height = height;
	}
	
	public void area() {
		System.out.println("Cannot define");
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	public long getHeight() {
		return height;
	}

	public void setHeight(long height) {
		this.height = height;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	public long getBase() {
		return base;
	}
	
}
