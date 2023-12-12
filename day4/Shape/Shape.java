package com.zettamine.java.day4.Shape;

public abstract class Shape {
	private String color;
	public abstract void area();
	
	public Shape(String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
