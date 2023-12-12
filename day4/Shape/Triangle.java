package com.zettamine.java.day4.Shape;

public class Triangle extends Shape {
	
	private int height;
	private int base;
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	
	public Triangle(String color, int height, int base) {
		super(color);
		this.height = height;
		this.base = base;
	}
	
	@Override
	public void area() {
		float areaTri=(0.5f)*(this.height*this.base);
		System.out.println();
		System.out.println("Area of the Triangle = "+areaTri);
		
	}
	
	

}
