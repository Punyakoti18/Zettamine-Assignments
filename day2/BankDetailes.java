package com.zettamine.java.day2;

import java.util.Scanner;

public class BankDetailes {
	private long  accNo;
	private String accName;
	private String address;
	static double balance;
	
	
	BankDetailes(long accNo,String accName,String address)
	{
		this.accNo=accNo;
		this.accName=accName;
		this.address=address;
		
	}
	static Scanner scan=new Scanner(System.in);
	

	

	public long getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public static double getBalance() {
		return balance;
	}

	public static void setBalance(double balance) {
		BankDetailes.balance = balance;
	}

	public static Scanner getScan() {
		return scan;
	}

	public static void setScan(Scanner scan) {
		BankDetailes.scan = scan;
	}

	public static void main(String... args)
	{
		BankDetailes bank=null;
		String  acc=null;
		
		while(true)
		{
			
			System.out.print("1 Create an Account\n2 Deposit\n3 Withdraw\n"
					+ "4 Detailes\n5 EXIT. ");
			int opt=scan.nextInt();
			
			if(opt==1)
			{
				if(acc==null)
				{
					System.err.println("Account is Not Yet Opened.");
					System.out.print("Enter the Account No : ");
					long acno=scan.nextLong();
					System.out.println();
					
					System.out.print("Enter the AccName : " );
					String name=scan.next();
					System.out.println();
					
					System.out.println("Enter the Address : ");
					String add=scan.next();
					System.out.println();
					
					System.out.print("Enter the Initial amount : ");
					double money=scan.nextDouble();
				    balance=balance+money;
				    
				    bank=new BankDetailes(acno,name,add);
				    
				    acc="Created";
				    System.out.println();
				    System.out.println("A/C Opened");
				}
				else
				{
					System.out.println();
					System.out.println("A/C is Already there ");
					System.out.println();
					
					continue;
				}
			}
			
			else if(opt==2)
			{
				if(acc!=null)
				{
				System.out.print("Enter the amount : ");
				double amount=scan.nextDouble();
				
				deposit(amount);
				System.out.println();
				
				System.out.println("Amount : "+amount+" Deposited | Balance  : "+balance);
				System.out.println();
				}
				else
				{
					System.out.println();
					System.err.println("Account is Not Yet Opened.");
					System.out.println("Please Open an New A/C with Us...");
					System.out.println();
					continue;
				}
			}
			else if (opt==3)
			{
				if(acc!=null)
				{
				System.out.println("Enter the amount : ");
				double amount =scan.nextDouble();
				withdraw(amount);
				System.out.println();
				
				System.out.println("Amount : "+amount+" withdraw | Balance  : "+balance);
				System.out.println();
				}
				else
				{
					System.out.println();
					System.err.println("Account is Not Yet Opened.");
					System.out.println("Please Open an New A/C with Us...");
					System.out.println();
					continue;
				}
				
			}
			else if(opt==4)
			{
				if(acc!=null)
				{
					System.out.println();
					System.out.println("Account No. "+bank.getAccNo());
					System.out.println("Acc Holder Name : "+bank.getAccName());
					System.out.println("Address : "+bank.getAddress());
					
				}
				else
				{
					System.out.println();
					System.err.println("Account is Not Yet Opened.");
					System.out.println("Please Open an New A/C with Us...");
					System.out.println();
				}
			}
			
		}//while
	}
	public static void deposit(double amt)
	{
		double amount=amt;
		balance=balance+amount;
			
	}
	
	public static void withdraw(double amt)
	{
		double amount=amt;
		if(amount<=balance)
		{
			balance=balance-amount;
		}
		else {
			System.err.println("Insufficient Funds.. ");
		}
	}

	
} 
