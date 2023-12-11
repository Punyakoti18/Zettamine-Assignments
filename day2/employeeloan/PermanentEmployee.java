package com.zettamine.java.day2.employeeloan;



public class PermanentEmployee extends Employee 
{
	private double basicSalary;
	
public PermanentEmployee(int empId,String empName,double basicSalary)
{
	super(empId,empName);
	this.basicSalary=basicSalary;
}

public double getBasicSalary() {
	return basicSalary;
}

public void setBasicSalary(double basicSalary) {
	this.basicSalary = basicSalary;
}


}
