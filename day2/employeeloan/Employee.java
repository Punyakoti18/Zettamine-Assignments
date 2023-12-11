package com.zettamine.java.day2.employeeloan;

public class Employee implements Calculation {
	protected int empId;
	protected String empName;
	protected double salary;
	
	public Employee(int empId,String empName)
	{
		this.empId=empId;
		this.empName=empName;
	}

	@Override
	public void calculateSalary(double basicSalary) 
	{
		float pfAmt=(float)(basicSalary*0.12);
		
		salary=basicSalary-pfAmt;
		System.out.println("The Salary you Get : "+salary);
		
	}
	
	@Override
	public void calculateSalary(int hoursWorked, int hourlyWages) {
		salary=hoursWorked*hourlyWages;
		
		System.out.println("The Salary you Get : "+salary);
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	

	
}
