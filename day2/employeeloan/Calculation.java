package com.zettamine.java.day2.employeeloan;

public interface Calculation {
	
	public abstract void calculateSalary(double basicSalary);
	
	public abstract void calculateSalary(int hoursWorked,int hourlyWages);

}
