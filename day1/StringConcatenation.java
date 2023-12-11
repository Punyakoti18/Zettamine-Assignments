package com.zettamine.java.day1;

import java.util.Scanner;

public class StringConcatenation {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		System.out.print("Inmate's name: ");
		String name=scan.next();
		
		System.out.print("Inmate's father's name: ");
		String father=scan.next();
		
		String con=name.concat(father);
		
		for (char ch : con.toCharArray()) 
		{
			if(Character.isDigit(ch))
			{
				System.out.println("Invalid Name");
				return;
			}
			
		}
		
		System.out.println(name.toUpperCase()+" "+father.toUpperCase());
		
	
	}

}
