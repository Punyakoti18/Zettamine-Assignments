package com.zettamine.java.day1;

import java.util.Scanner;
//class MinimumOf5AndMaximumOf40Tickets extends Exception 
//{
//	MinimumOf5AndMaximumOf40Tickets(String str)
//	{
//		super(str);
//	}
//}
//class IV extends Exception
//{
//	IV(String str)
//	{
//		super(str);
//	}
//}

//-----------------------------------------------------------------------------------------------------------
public class MovieTicketCal {
	
	static Scanner scan=new Scanner(System.in);
	final static int king=75;
	final static int queen=150;
	final static int refresh=50;

	public static float ticketProcess(int noOfTickets,String rFM,String coupon,String circle)
	{
		int tickets=noOfTickets;
		float cost;
		
		if(noOfTickets>=5 && noOfTickets<=20)	
		{
			if(circle.equals("K")||circle.equals("k"))
			{
				cost=(float)king*tickets;
			}
			else
			{
				cost=(float)queen*tickets;
			}
			
			if(rFM.equals("Y")||rFM.equals("y"))
			{
				int ref=refresh*tickets;
				cost=(float)cost+ref;
			}
			
			if(coupon.equals("Y")||coupon.equals("y"))
			{ 
				float dis=(float)((2.0/100)*cost);
				cost=cost-dis;	
			}
			return cost;
		}
		else
		{
			if(circle.equals("K")||circle.equals("k"))
			{
				cost=(float)king*tickets;
			}
			else
			{
				cost=(float)queen*tickets;
			}
			System.out.println("1="+cost);
			float dis=(float)((10.0/100)*cost);
			cost=cost-dis;
			System.out.println("2="+cost);
			
			if(coupon.equals("Y")||coupon.equals("y"))
			{ 
				float dis2=(float)((2.0/100)*cost);
				cost=cost-dis2;	
			}
			
			if(rFM.equals("Y")||rFM.equals("y"))
			{
				int ref=refresh*tickets;
				cost=(float)cost+ref;
			}
			System.out.println("3="+cost);
		
			return cost;	
		}
	}
	
	
	
	public static void main(String[] args) {
		int noOfTickets;
		String rFM;
		String coupon;
		String circle;
			
		System.out.print("Enter no of tickets : ");
		 noOfTickets=scan.nextInt();
		 
		System.out.print("Do you want refreshment: ");
		 rFM=scan.next();
		 
		System.out.print("Do you have coupon code: ");
		 coupon=scan.next();
			
			
		System.out.print("Enter the circle : ");
		circle=scan.next();
		 System.out.println();
		 
		 
		if((noOfTickets>=5 && noOfTickets<=40)&&(circle.equals("K")||circle.equals("Q")||circle.equals("q")||circle.equals("k"))&&
				(coupon.equals("Y")||coupon.equals("N")||coupon.equals("n")||coupon.equals("y")))
		{
		float result=ticketProcess(noOfTickets,rFM,coupon,circle);
		System.out.println("Tick Cost: "+result);
		}
		
		else if(noOfTickets<5 && noOfTickets>40)
		{
			System.out.println("Minimum of 5 and Maximum of 40 Tickets");
		}
		
		else if(!(circle.equals("K")||circle.equals("Q"))||(circle.equals("k")||circle.equals("q"))||
				(rFM.equals("Y")||rFM.equals("y"))||(rFM.equals("N")||rFM.equals("n")))
		{
			System.out.println("Invalid Input");
		}
		

	}
}

