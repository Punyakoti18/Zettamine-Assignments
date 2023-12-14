package com.zettamine.java.day6.insurancebazaar;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class InsuranceBazaar {
	static Scanner scan=new Scanner(System.in);

	public static void main(String[] args) {
		Map<Integer,String> Policy=new Hashtable<>();
		
		while(true)
		{
			System.out.println("1 To add a Policy\n"
					+ "2 TO Search a Policy\n"
					+"3 To Exit.");
            int opt=scan.nextInt();
			if(opt==1)
			{
				System.out.println("Enter the no of Policy names you want to store: ");
				int n=scan.nextInt();
				int i=0;
				while(i<n)
				{
					addPolicy(Policy);
					i++;
				}
						
			}
			else if(opt==2)
			{
				System.out.print("Enter the policy type to be searched: ");
				String pol=scan.next();
				searchPolicy(pol,Policy);
			}
			else if(opt==3)
			{
				break;
			}
			
		}

	}

	private static void searchPolicy(String pol, Map<Integer, String> policy) 
	{
		
	
		for(Map.Entry<Integer,String>entries: policy.entrySet())
		{
			if(entries.getValue().contains(pol))
			{
				System.out.println(entries.getKey());
			}
			}
		}
		

	private static void addPolicy(Map<Integer, String> policy) {
		System.out.print("Enter the Policy ID: ");
		int no=scan.nextInt();
		
		System.out.print("Enter the Policy Name: ");
		String pol=scan.next();
		
		
		policy.put(no,pol);
		
	}

}
