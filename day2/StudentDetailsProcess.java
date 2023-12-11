package com.zettamine.java.day2;

import java.util.Scanner;

public class StudentDetailsProcess {
static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
		StudentDetails std;
		
		int id;
		String name;
		String address;
		String college;
		
			System.out.print("Enter Student's Id : ");
			id=scan.nextInt();
			
			System.out.print("Enter Student's Name : ");
			name=scan.next();
			
			System.out.print("Enter Student's Address : ");
			address=scan.next();
			
			while(true)
			{ 
				
			System.out.print("Whether the student is from NIT(Yes/No)");
			String opt=scan.next();
			if(opt.equals("Yes"))
			{
			    std=new StudentDetails(id,name,address,"NIT");
			    break;
			}
			else if(opt.equals("No"))
			{
				System.out.print("Enter the college Name : ");
				college=scan.next();
				
				std=new StudentDetails(id,name,address,college);
				break;
			}
			else
			{
				System.out.println("Wrong Input");
				continue;
			}
			
			
		}
		System.out.println();
		System.out.println("Student ID   : "+std.getId());
		System.out.println("Student Name : "+std.getName());
		System.out.println("Address      : "+std.getAddress());
		System.out.println("College Name : "+std.getCollege());

	}

}
