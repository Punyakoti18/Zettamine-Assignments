package com.zettamine.java.day4.Shape;

public class Circle extends Shape {
	
	private float radius;
	

	
	public Circle(String color, float radius) {
		super(color);
		this.radius = radius;
	}

	@Override
	public void area() {
		System.out.println();
		System.out.printf("Area of Circle = %.2f "+(Math.PI*Math.pow(radius, 2)));
		
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	

	
	
	
}
