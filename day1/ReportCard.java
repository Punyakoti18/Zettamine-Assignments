package com.zettamine.java.day1;

import java.util.Scanner;

public class ReportCard {
	static Scanner scan=new Scanner(System.in);
	
	public static void reportCard(String name,int[] mark)
	{
		String sName=name;
		int[] marks=mark;
		
		System.out.println("-".repeat(40));
		System.out.println("       ReportCard            ");
		System.out.println();
		
		System.out.println("Student Name : "+sName);
		System.out.println("-".repeat(40));
		System.out.println("SUBJECT       MARKS");
		
		float avg;
		int total=0;
		int n=1;
		for (int i=0;i<marks.length;i++)
		{
			System.out.println("subject-"+n+"     "+marks[i]);
			total=total+marks[i];	
			n++;
		}
		System.out.println("-".repeat(400));
		
		
		
		float sum1=(float)total;
		float nFS=(float)marks.length;
		float avg1=sum1/nFS;
		System.out.printf("Total=%d   Average = %.2f",total,avg1);
		System.out.println();
		System.out.println("-".repeat(40));
		
	}
	
	
	public static int[] marksEntry(int s)
	{
		int []marks=new int[s];
		System.out.println();
		int n=1;
		for(int i=0;i<marks.length;i++)
		{
			System.out.print("Enter mark for subject-"+n+" ");
			marks[i]=scan.nextInt();
			n++;
		}
		return marks;
	}
	
	
	

	public static void main(String[] args) {
		
		System.out.print("Enter the Student Name : ");
		String studentName=scan.next();
		
		System.out.println();
		System.out.print("Enter the no.of subjects : ");
		int noOfStud=scan.nextInt();
		
		int marks[]=marksEntry(noOfStud);
		System.out.println("\n");
		
		reportCard(studentName,marks);
	}

}
