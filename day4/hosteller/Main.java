package com.zettamine.java.day4.hosteller;

import java.util.Scanner;

public class Main {
	static Scanner scan=new Scanner(System.in);
	
	public static boolean phoneNoVerification(String phNo)
	{
		if(phNo.matches("[6789]\\d{9}"))
		{
		return true;
		}
		return false;
	}

	public static Hosteller getHostellerDetails()
	{
		System.out.println("Enter the Student Details & Hostel Details: ");
		
		System.out.print("Enter Student ID: ");
		int studId=scan.nextInt();
		
		System.out.print("Enter Student Name: ");
		String studName=scan.next();
		
		System.out.print("Enter Dept ID: ");
		int depId=scan.nextInt();
		
		System.out.print("Enter Gender [M/F]: ");
		String gender=scan.next();
		
		String phNo=null;
		while(true)
		{
		System.out.print("Enter Phone Number: ");
		phNo=scan.next();
		
		boolean phNoVerify=phoneNoVerification(phNo);
		if(!phNoVerify)
		{
			System.err.println("Invalid Phone Number.Re-Enter the Phone Number.");
			continue;
		}
		break;
		}
		
		System.out.print("Enter Student Hostel Name: ");
		String hostelName=scan.next();
		
		System.out.print("Enter Room No: ");
		int roomNo=scan.nextInt();
		
		System.out.println();
		System.out.println("-".repeat(60));
		System.out.println("Student ID             : "+studId);
		System.out.println("Student Name           : "+studName);
		System.out.println("Student Departement ID : "+depId);
		System.out.println("Student Gender         : "+gender);
		System.out.println("Student phone Number   : "+phNo);
		System.out.println("Student Hostel Name    : "+hostelName);
		System.out.println("Student Hostel RoomNo. : "+roomNo);
		System.out.println("-".repeat(60));
		System.out.println();
		
		
		return new Hosteller(hostelName,roomNo, new Student(studId, studName, depId, gender, phNo));
	}
	
	public static void main(String[] args) {
		
		Hosteller host=getHostellerDetails();
		
		while(true)
		{
			System.out.print("Modify Room Number(Y/N) : ");
			String opt=scan.next();
			System.out.println();
			if(opt.matches("[nNyY]"))
			{
			    if(opt.equalsIgnoreCase("y"))
			    {
				    System.out.print("Enter the New Room No : ");
				    host.setRoomNumber(scan.nextInt());
				    
				    System.out.println("Successfully Updated");
				    System.out.println();
				    break;
			    }
			    
			    else
			    {
			    	break;
			    }
			    
			}
			else
			{
				System.err.println("Enter the Valid Option ... ");
			}
			
		}//whileloop
		

		while(true)
		{
			System.out.print("Modify Phone Number(Y/N) : ");
			String opt=scan.next();
			
			if(opt.matches("[yYnN]"))
			{
				if(opt.equalsIgnoreCase("y"))
				{
					while(true)
					{
					System.out.print("Enter the New Phone Number : ");
					String phoneNo=scan.next();
					boolean res=phoneNoVerification(phoneNo);
					if(!res)
					{
						System.err.println("Enter the Valid Phone Number...");
						continue;
					}
					host.getStudentDetails().setPhone(phoneNo);
					System.out.println("Successfully Updated");
					System.out.println();
					break;
					
					}//Inner whileloop
					break;
					
			  }
				else
				{
					break;
				}
			}
		  else 
			{
				System.err.println("Enter Valid Option ...");
				System.out.println();
			}
		}//while Loop

		System.out.println("-".repeat(60));
		System.out.println("Updated Detailes ");
		System.out.println();
		System.out.println("Student ID             : "+host.getStudentDetails().getStudentId());
		System.out.println("Student Name           :  "+host.getStudentDetails().getName());
		System.out.println("Student Departement ID : "+host.getStudentDetails().getDepartmentId());
		System.out.println("Student Gender         : "+host.getStudentDetails().getGender());
		System.out.println("Student phone Number   : "+host.getStudentDetails().getPhone());
		System.out.println("Student Hostel Name    : "+host.getHostelName());
		System.out.println("Student Hostel RoomNo. : "+host.getRoomNumber());
		System.out.println("-".repeat(60));

	}

}
