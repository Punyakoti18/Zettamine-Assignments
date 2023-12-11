package com.zettamine.java.day2.employeeloan;

public class Loan {
	
	public double calculateLoanAmount(Employee emp)
	{
		double amount=0;
		
		
		if(emp instanceof PermanentEmployee)
		{
			double per=15;
			double salary=emp.getSalary();
			amount=(double)((per/100)*salary);
			
			
		}
		else if(emp instanceof TemporaryEmployee)
		{
			double per=10;
			double salary=emp.getSalary();
			amount=(double)((per/100)*salary);
			
		}
		return amount;
		
	}

}
