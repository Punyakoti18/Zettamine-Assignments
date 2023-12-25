package com.zettamine.rainfall.data;

import java.util.Scanner;

import com.zettamine.rainfall.services.RainFallServices;

public class RainFallProcess {
	static Scanner scan =new Scanner(System.in);

	public static void main(String[] args) 
	{
		RainFallServices rs;
		RainFall rf;
		
		while(true)
		{
			System.out.println("1. Add RainFall\n"
					+ "2. gettingRainFalls\n"
					+ "3. getAvg RainFall by using PinCode\n"
					+ "4. To Exit.\n");
			System.out.print("Choose your Option: ");
			int opt=scan.nextInt();
			
			if(opt==1);
			{
				System.out.print("Enter the City PinCode : ");
				int pin =scan.nextInt();
				
				System.out.println("Enter the CityName : ");
				String name=scan.next();
				
				System.out.print("Enter the rain fall in jan: ");
				float jan=scan.nextFloat();
				
				System.out.print("Enter the rain fall in feb: ");
				float feb=scan.nextFloat();
				
				System.out.print("Enter the rain fall in mar: ");
				float mar=scan.nextFloat();
				
				System.out.print("Enter the rain fall in apr: ");
				float apr=scan.nextFloat();
				
				System.out.print("Enter the rain fall in may: ");
				float may=scan.nextFloat();
				
				System.out.print("Enter the rain fall in jun: ");
				float jun=scan.nextFloat();
				
				System.out.print("Enter the rain fall in jul: ");
				float jul=scan.nextFloat();
				
				System.out.print("Enter the rain fall in aug: ");
				float aug=scan.nextFloat();
				
				System.out.print("Enter the rain fall in sep: ");
				float sep=scan.nextFloat();
				
				System.out.print("Enter the rain fall in oct: ");
				float oct=scan.nextFloat();
				
				System.out.print("Enter the rain fall in nov: ");
				float nov=scan.nextFloat();
				
				System.out.print("Enter the rain fall in dec: ");
				float dec=scan.nextFloat();
				
				rs.addRainFall(new RainFall(pin,name,jan,feb,mar,apr,may,jun,jul,aug,sep,oct,nov,dec));
				
				
			}
			else if(opt==2)
			{
				rs.gettingRainFalls();
				
			}
			else if(opt==3)
			{
				System.out.println("Enter the City PinCode: ");
				int pin=scan.nextInt();
				
				rs.getAvg(pin);
			}
			
			else if(opt==4)
			{
				scan.close();
				rs.close();
				break;
			}
			else
				System.out.println("Enter the Correct Option.");
			
		}

	}

}
