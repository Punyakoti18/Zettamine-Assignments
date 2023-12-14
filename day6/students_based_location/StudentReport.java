package com.zettamine.java.day6.students_based_location;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class StudentReport {
	
	static Scanner scan=new Scanner(System.in);

	public static void main(String[] args) 
	{
		
		List<Student> stdList=new ArrayList<>();
		
		
		
		addStudent(stdList);
		
		List<String> location=new ArrayList<>();
		
		for (Student stu : stdList) 
		{
			location.add(stu.getLocation());	
		}
		Map<String,Integer> locCount=new HashMap<>();
		
		 for (String loc : location) 
	        {
	            if (!locCount.containsKey(loc)) 
	            {
	            	locCount.put(loc, 1);
	            			} else {
	            				locCount.put(loc, locCount.get(loc) + 1);
	            			}   
	        }
		 System.out.println("Location\tCount");
		 
		 for(Map.Entry<String, Integer>entries : locCount.entrySet())
		 {
			 System.out.println(entries.getKey()+"\t\t "+entries.getValue());
		 }

	}

	private static void addStudent(List<Student> stdList) {
		
		while(true)
		{
			
		System.out.print("Enter Student Name: ");
		String name=scan.next();
		
		System.out.print("Enter the Location: ");
		String loc=scan.next();
		
		System.out.println("Enter the eMail: ");
		String email=scan.next();
		
		System.out.println("Enter the Mobile Number: ");
		long phNo=scan.nextLong();
		
		stdList.add(new Student(name,loc,email,phNo));
		
		System.out.print("Do you want to add more students[Y/N]: ");
		String opt=scan.next();
		if(opt.equalsIgnoreCase("y"))
		{
			addStudent(stdList);
		}
		break;
		}
		
		
	}

}
