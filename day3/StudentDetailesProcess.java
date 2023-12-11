package com.zettamine.java.day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentDetailesProcess {
	
	static Scanner scan =new Scanner(System.in);
	public static String emailvalidation(String str)
	{
		String emailId= str;
		if(str.matches("[\\w\\d]+@gmail[.][com]{3}"))
		{
			return emailId;
		}
		return "Error"; 
	}
	
	
	public static void main(String[] args) {
		
		StudentDetailes std;
		
		
		List<StudentDetailes> list=new ArrayList<>();
		while(true)
		{
			System.out.println("Enter Student Name and EmailId : ");
			String name=scan.next();
			String email=scan.next();
			String emailId=emailvalidation(email);
			if(emailId.equals("Error"))
			{
				System.err.println("EmailId is wrong Re-enter the Details ");
				continue;
			}
			list.add(new StudentDetailes(name,email));
			
			System.out.print("do you want to add more students?[Y/N] : ");
			String opt=scan.next();
			if(!(opt.equals("Y")||opt.equals("y")))
					{
				break;
				
					}
		}//while loop
		
		System.out.println("studentID\t sName \t sEmail \t  collegeName");
		System.out.println("-".repeat(60));
		for (StudentDetailes student :list) {
			
			System.out.println(student);
		}

	}

}
