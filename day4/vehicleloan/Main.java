package com.zettamine.java.day4.vehicle_loan;

import java.util.Scanner;

public class Main {
	static Scanner scan =new Scanner(System.in);

	public static void main(String[] args) 
	{
		Vehicle vcl;
		
		System.out.print("Enter  Vehicle Number: ");
		String number=scan.nextLine();
		
		
		System.out.print("Enter Model Name: ");
		String model=scan.nextLine();
		
		System.out.print("Enter Vehicle Type: ");
		String type= scan.nextLine();
		
		System.out.print("Enter Price OF the vehicle: ");
		double price=scan.nextFloat();
		
		
		vcl=new Vehicle(number, model, type, price);
		
		double loan=vcl.issueLoan();
		
		double insurance=vcl.takeInsurance();
		
		System.out.printf("The Loan will get on this Vehicle: %.2f",loan);
		System.out.println();
		System.out.printf("The Insurance Amount on this Vehicle: %.2f",insurance);
		
		

	}

}
