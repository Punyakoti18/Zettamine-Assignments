package com.zettamine.java.day1;

import java.util.Scanner;

public class BillGeneration {
	static Scanner scan =new Scanner(System.in);
	static int costOfPizza;
	static int costOfPuff;
	static int costOfCoolDrink;
	static int  total;
	static int nFPizza;
	static int nFPuff;
	static int nFCoolDrink;
	private static final int pizzaPrice=100;
	private static final int puffPrice=20;
	private static final int coolDrinkPrice=10;
	
	
	public static void pizzaProcess(int num)
	{
		nFPizza=nFPizza+num;
		int price=pizzaPrice*num;
		costOfPizza=costOfPizza+price;
		total=total+price;
		
		
	}
	public static void puffProcess(int num)
	{
		
		int price=puffPrice*num;
		costOfPuff=costOfPuff+price;
		total=total+price;
		nFPuff=nFPuff+num;
	}
	public static void coolDrinkProcess(int num)
	{
		
		int price=coolDrinkPrice*num;
		costOfCoolDrink=costOfCoolDrink+price;
		total=total+price;
		nFCoolDrink=nFCoolDrink+num;
		
	}
	public static void billing()
	{
		System.out.println("Bill Details");
		System.out.println();
		System.out.printf("No of Pizzas:      \t %d \t cost : %d ",nFPizza,costOfPizza);
		System.out.println();
		System.out.printf("No of Puffs:      \t %d \t cost : %d ",nFPuff,costOfPuff);
		System.out.println();
		System.out.printf("No of Cool Drinks: \t %d \t cost : %d ",nFCoolDrink,costOfCoolDrink);
		System.out.println();
		float total1=(float)total;
		System.out.printf("Total Price : %.2f",total1);
			
	}
	
	
	
	public static void main(String[] args) {
		
		while(true)
		{
			System.out.println("Enter 1 Select Pizza \nEnter 2 to Select puff \n"
					+ "Enter 3 to Select coolDrink \nEnter 4 to Exit");
			int option=scan.nextInt();
			if(option==1)
			{
				System.out.print("Enter no.of Pizzes : ");
				int num=scan.nextInt();
				pizzaProcess(num);
				System.out.println("-".repeat(10));
			}
			else if(option==2)
			{
				System.out.print("Enter no.of puffs : ");
				int num=scan.nextInt();
				puffProcess(num);
			}
			else if(option==3)
			{
				System.out.print("Enter no.of CoolDrinks : ");
				int num=scan.nextInt();
				coolDrinkProcess(num);
			}
			else if(option ==4)
			{
				break;
			}
			else
			{
				System.out.println("Enter correct number ");
			}
		}
		System.out.println();
		
		System.out.println("Enter Y for billing \nEnter N to Exit.");
		String option=scan.next();
		
		switch(option)
		{
		case "Y": 
			billing();
			break;
		case "N":
			break;
		default:
			System.out.println("Invalid Option ");
		}
		System.out.println();
		System.out.println("ENJOY THE SHOW!!!");
		
	}

}
