package com.zettamine.java.day1;

import java.util.Scanner;

public class NumberToWord {
	
	public static String digitToWord(int n)
	{
		int i=n;
		String word=switch(i)
		{
		case 0-> "Zero";
		
		case 1->"One ";
		case 2->"Two ";
		case 3->"Three ";
		case 4-> "Four ";
		case 5-> "Five ";
		case 6-> "Six ";
		case 7-> "Seven ";
		case 8-> "Eight ";
		case 9-> "Nine ";
		default->"Enter the correct number";
		};
		return word;
	}

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num=scan.nextInt();
		String str=" ";
		int temp=num;
		while(num>0)
		{
			int r=num%10;
			String word=digitToWord(r);
			str=word+str;
			num=num/10;
					
		}
		System.out.println(temp+" in words -->"+str);

	}

}
