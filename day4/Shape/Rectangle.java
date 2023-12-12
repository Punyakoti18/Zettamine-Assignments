package com.zettamine.java.day4.Shape;

public class Rectangle extends Shape{
	private int length;
	private int breadth;
	
	
	
	
	public Rectangle(String color, int length, int breadth) {
		super(color);
		this.length = length;
		this.breadth = breadth;
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
	@Override
	public void area() {
		int areaRec=this.length*this.breadth;
		System.out.println();
		System.out.println("Area Of the Rectangle = "+areaRec);
		
		
	}
	
	

}
