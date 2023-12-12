package com.zettamine.java.day4.account;

import java.util.Scanner;

public class Main {
	static Scanner scan =new Scanner(System.in);
	
	public static boolean verifyEid(String eID)
	{
		if(eID.matches("^[a-zA-Z0-9]+@[a-zA-Z]+[.](com|in)"))
		{
			return true;
		}
		return false;
	}

	public static void main(String[] args) 
	{
		System.out.print("Enter A/C Number: ");
		long accNo=scan.nextLong();
		
		System.out.print("Enter Customer ID: ");
		int custID=scan.nextInt();
		
		System.out.print("Enter Customer Name: ");
		String custName=scan.next();
		
		String email=null;
		while(true)
		{
		System.out.print("Enter Customer E-MailID: ");
		email=scan.next();
		boolean eId=verifyEid(email);
		if(!eId)
		{
			System.err.println("Invalid Email ID");
			System.out.println();
			continue;
		}
		break;
		}//while
		
		System.out.println();
		System.out.println("Enter balance: ");
		double bal=scan.nextFloat();
		
		System.out.print("Enter minimum Balance: ");
		double minBal=scan.nextDouble();
		
		
		
		SavingsAccount sa=new SavingsAccount(accNo,new Customer(custID,custName,email),bal,minBal);
		
		System.out.println();
		System.out.print("Enter Amount to WithDraw: ");
		double debit=scan.nextDouble();
		
		boolean res=sa.withdraw(debit);
		if(res)
		{
		 System.out.printf("Rs.%.2f debited | Balance: %.2f",res,sa.getBalance());
		}
		else
		{
			System.out.println("Balance Is LessThan Minimum Balance");
		}

	}//main

}
