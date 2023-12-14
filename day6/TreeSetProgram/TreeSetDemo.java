package com.zettamine.java.day6.treesetdevelop;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		Set<String> name = new TreeSet<String>(new MyComp());
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter no of students : ");
		int n = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < n; i++)
		{
			System.out.print("enter student-" + (i+1) + " name : ");
			String stuName = sc.nextLine();
			
			name.add(stuName);
		}
		
		int i = 1;
		for(String studentName : name)
		{
			
			System.out.println(i++ + "." + studentName);
		}
		
		sc.close();
	}

}

class MyComp implements Comparator<String>
{

	@Override
	public int compare(String o1, String o2) 
	{
		int len = o1.length()-o2.length();
		if(len != 0)
		{
			return len;
		}
		
		return o1.compareTo(o2);
		
	}
	
}
