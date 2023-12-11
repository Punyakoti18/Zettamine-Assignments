package com.zettamine.java.day2.employeeloan;

import java.util.Scanner;

public class EmployeeProcess {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
		Employee emp;
		Loan loan=new Loan();
		
		int empId;
		String empName;
		
		double basicPay;
		
		int hoursWorked;
		int hourlyWages;
		
		
		while(true)
		{
			System.out.print("Enter 1 to Process with PermanentEmp\n"
					+ "Enter 2 to Process with TemporaryEmp\n"
					+ "Enter 3 to Exit.");
			int opt=scan.nextInt();
			
			if(opt==1)
			{
				System.out.print("Enter the empId : ");
				empId=scan.nextInt();
				
				System.out.print("Enter the empName : ");
				empName=scan.next();
				
				System.out.print("Enter the basicSalary : ");
				basicPay=scan.nextDouble();
				
				emp=new PermanentEmployee(empId,empName,basicPay);
				
				emp.calculateSalary(basicPay);
				
				System.out.println();
				double result=loan.calculateLoanAmount(emp);
				System.out.println("The loan Amount is : "+result);
				
				System.out.println("Process Done..");
			}
			
			else if(opt==2)
			{
				System.out.print("Enter the empId : ");
				empId=scan.nextInt();
				
				System.out.print("Enter the empName : ");
				empName=scan.next();
				
				System.out.print("Enter no.of hoursWorked : ");
				hoursWorked =scan.nextInt();
					
				System.out.print("Enter the Amount HourlyWages : ");
				hourlyWages=scan.nextInt();
					
				emp=new TemporaryEmployee(empId, empName, hoursWorked, hourlyWages);
				
				emp.calculateSalary(hoursWorked, hourlyWages);
				
				System.out.println();
				double result=loan.calculateLoanAmount(emp);
				System.out.println("The loan Amount is : "+result);
				
				System.out.println("Process Done..");
			}
 			
			else if (opt==3)
			{
				break;
			}	
			else
			{
				System.err.println("Enter the proper option");
				System.out.println();
				continue;	
			}
		}//while loop
			
		
		
		
		
		
		

	}

}
