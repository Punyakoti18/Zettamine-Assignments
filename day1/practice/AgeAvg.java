package com.zettamine.java.day1.practice;

import java.util.Scanner;

public class AgeAvg {
	static Scanner scan=new Scanner(System.in);
	public static float avgAge(int[] arr)
	{
		int ageArr[]=arr;
		float sum=0;
		float len=ageArr.length;
		float avg;
		for (int i=0;i<ageArr.length;i++)
		{
			float n=(float)ageArr[i];
		sum=sum+n;
		}
		avg =sum/len;
		return avg;
	}

	public static void main(String[] args) {
		int nFE;
		int ageArr[];
		
		while(true)
		{
		System.out.print("Enter total no. of employees: ");
	    nFE=scan.nextInt();
		if(nFE<2)
		{
			System.out.println("Please enter a valid employee count");
			continue;
		}
		else
			break;
	    }
		System.out.print("Enter the age for "+nFE+" employees:");
		int i=0;
		ageArr=new int [nFE];
		while(i<nFE)
		{
		int age=scan.nextInt();
		ageArr[i]=age;
		i++;
		}
		
		float avg=avgAge(ageArr);
		System.out.printf("The average age is : %.2f",avg);
		
		

}
}
