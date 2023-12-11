package com.zettamine.java.day1;

import java.util.Scanner;

public class DisplayCharacter {
	static Scanner scan=new Scanner(System.in);
	
	static final int size=4;
	
	public static int [] addDigits(int s)
	{
		int arr[]=new int[s];
		
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the number : ");
			int num=scan.nextInt();
			arr[i]=num;
		}
		return arr;
	}

	public static void main(String[] args) {
		int mBoard[]=addDigits(size);
		
		for (int i=0;i<mBoard.length;i++)
		{
			char c=(char)mBoard[i];
			System.out.println(mBoard[i]+"--->"+c);
		}

	}

}
