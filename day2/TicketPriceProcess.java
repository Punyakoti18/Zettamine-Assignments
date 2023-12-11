package com.zettamine.java.day2;

import java.util.Scanner;

public class TicketPriceProcess {
	private final static int price=100;
	static int availableTickets;
	
	
	public static int calculateTicketCost(int noOftickets) 
	{
		int res=price*noOftickets;
		return res;
	}

	static Scanner scan=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int id;
		int noOfTickets;
		int price;
		
		System.out.print("Enter no of bookings : ");
		int n=scan.nextInt();
		
		System.out.println();
		System.out.print("Enter the available tickets : ");
		availableTickets=scan.nextInt();
		System.out.println();
		int i=0;
		while(i<n)
		{
			System.out.print("Enter the ticketId : ");
			id=scan.nextInt();
			
			System.out.print("Entert the no of tickets : ");
			noOfTickets=scan.nextInt();
			
			price=calculateTicketCost(noOfTickets);
			
			System.out.println();
			System.out.println("Available Tickets : "+availableTickets);
			availableTickets=availableTickets-noOfTickets;
			System.out.println("Total Amount : "+price);
			System.out.println("Available Tickets After Booking : "+availableTickets);
			System.out.println();
		}
		
		
		

	}

}
