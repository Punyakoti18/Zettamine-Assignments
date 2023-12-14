package com.zettamine.java.day6.phnomanipulation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class PhoneBook {

	static Scanner scan =new Scanner(System.in);
	
	
	public static void main(String[] args) {
		List<Contact> phBook=new ArrayList<>();
		
		Contact con=null;
		
		while(true)
		{
			System.out.println("Menu :");
			System.out.println();
			System.out.println("1. Add Contact\r\n"
					+ "2. Display all Contacts\r\n"
					+ "3. Search Contact by phone \r\n"
					+ "4. Remove Contact\r\n"
					+ "5. Exit\r\n");
			int opt=scan.nextInt();
			
			if(opt==1)
			{
				System.out.println("How many numbers want to be Added: ");
				int n=scan.nextInt();
				int i=0;
				while(i<n)
				{
					addContact(con,phBook);
					i++;
				}
				
			}
			else if(opt==2)
			{
				viewAllContacts(phBook);
						
			}
			else if(opt==3)
			{
				System.out.println("Search contact by phone: ");
				long no=scan.nextLong();
				search(no,phBook);
			}
			else if(opt==4)
			{
				System.out.println("Enter the Phone Number to remove: ");
				long no=scan.nextLong();
				boolean res=removeNo(no,phBook);
				if(res)
				{
					System.out.println("The contact is successfully deleted.");
				}
				else
				{
					System.out.println("The contact didn't get deleted.");
				}
			}
			else if(opt==5)
			{
				break;
			}
			else
				System.out.println("Enter the Correct Option..");
		}

	}

	private static boolean removeNo(long no, List<Contact> phBook) {
		
		System.out.println("Do you want to remove the contact (Y/N): ");
		String opt=scan.next();
		if(opt.equalsIgnoreCase("y"))
		{
		Iterator<Contact> itr=phBook.iterator();
		while(itr.hasNext())
		{
			Contact obj=itr.next();
			if(obj.getPhoneNumber()==no)
			{
				itr.remove();
				return true;
			}
		}
		return false;
		}
		return false;
	}

	private static void search(long no,List<Contact> phBook) {
		
		for (Contact con : phBook) 
		{
			if(con.getPhoneNumber()==no)
			{
				System.out.println("First Name: "+con.getFirstName()+" | "+"Last Name: "+con.getLastName()+" | "+"Phone No.: "+con.getPhoneNumber()+" | "+"Email: "+con.getEmail());
			
			}
			
		}
		System.out.println("Not Found.");
		
	}

	private static void addContact(Contact con, List<Contact> phBook) {
		System.out.println();
		System.out.println("Enter the First Name: ");
		String fName=scan.next();
		
		System.out.println("Enter the last Name: ");
		String lName=scan.next();
		
		System.out.println("Enter the Phone Number: ");
		long phNo=scan.nextLong();
		
		
		String eMail=null;
		while(true)
		{
			System.out.println("Enter the EMail: ");
			eMail=scan.next();
			if(!emailVerify(eMail))
			{
				System.err.println("Enter the Valid EMAIL ID....");
				continue;
			}
			break;
			
		}
		
		phBook.add(new Contact(fName,lName,phNo,eMail));
			
	}

	private static boolean emailVerify(String eMail) {
		if(eMail.matches("^[A-za-z0-9]+@[A-za-z0-9]+[.](com|in)"))
				{
			return true;
			
				}
		return false;
	}
	
	public static void viewAllContacts(List<Contact> phBook)
	{
		for (Contact cont : phBook) 
		{
			
			System.out.println("First Name: "+cont.getFirstName()+" | "+"Last Name: "+cont.getLastName()+" | "+"Phone No.: "+cont.getPhoneNumber()+" | "+"EMail: "+cont.getEmail());
			
		}
		

		
	}

}
