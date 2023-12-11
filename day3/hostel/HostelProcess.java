package com.zettamine.java.day3.hostel;

import java.util.Scanner;

public class HostelProcess {
	static Scanner scan=new Scanner(System.in);
	
	public static boolean validPh(String phNo)
	{
		String ph=phNo;
		if(ph.matches("[6789][0-9]{9}"))
		{
			return true;
		}
		
		return false; 
	}
	
	public static Hosteller getHostellerDetails()
	{
		System.out.print("Enter the StudentId : ");
		int stdId=scan.nextInt();
		
		System.out.print("Enter the Student Name : ");
		String name=scan.next();
		
		System.out.print("Enter the DeptId : ");
		int dptId=scan.nextInt();
		
		System.out.println("Enter the Gender : ");
		String gender=scan.next();
		
		String phoneNo=null;
		
		
		while(true)
		{
		System.out.print("Enter the Phone Number : ");
		phoneNo=scan.next();
		boolean rePhoneNo=validPh(phoneNo);
		if(!rePhoneNo)
		{
			System.err.println("Enter the valid Phone Number. ");
			continue;
		}
		break;
		}//whileloop
		
		System.out.print("Enter the Hostel Name :");
		String hostelName=scan.next();
		
		System.out.print("Enter the Room No : ");
		int roomNo=scan.nextInt();
		
		System.out.println();
		System.out.println("-".repeat(60));
		System.out.println("Student ID             : "+stdId);
		System.out.println("Student Name           :  "+name);
		System.out.println("Student Departement ID : "+dptId);
		System.out.println("Student Gender         : "+gender);
		System.out.println("Student phone Number   : "+phoneNo);
		System.out.println("Student Hostel Name    : "+hostelName);
		System.out.println("Student Hostel RoomNo. : "+roomNo);
		System.out.println("-".repeat(60));
		System.out.println();
		
		return new Hosteller(stdId,name,dptId,gender,phoneNo,hostelName,roomNo);
		
	}

	public static void main(String[] args) 
	{
		
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
				    host.setRoomNo(scan.nextInt());
				    
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
					boolean res=validPh(phoneNo);
					if(!res)
					{
						System.err.println("Enter the Valid Phone Number...");
						continue;
					}
					host.setPhone(phoneNo);
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
		System.out.println("Student ID             : "+host.studentId);
		System.out.println("Student Name           :  "+host.getName());
		System.out.println("Student Departement ID : "+host.getDeptId());
		System.out.println("Student Gender         : "+host.getGender());
		System.out.println("Student phone Number   : "+host.getPhone());
		System.out.println("Student Hostel Name    : "+host.getHostelName());
		System.out.println("Student Hostel RoomNo. : "+host.getRoomNo());
		System.out.println("-".repeat(60));
		
		
	
			
    }
		
}

