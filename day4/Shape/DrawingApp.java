package com.zettamine.java.day4.Shape;

import java.util.Scanner;

public class DrawingApp {
	static Scanner scan =new Scanner(System.in);
	

	public static void main(String[] args) {
		Shape sh=null;
		
		while(true)
		{
			System.out.print("Which Shape do you want to work with ? [1 Rect | 2. Circle | 3 Triangle] : ");
			int opt=scan.nextInt();
			System.out.println();
			
			switch(opt)
			{
			case 1:
			{
			System.out.print("Enter color the Rectangle : ");
			String color=scan.next();
			
			System.out.print("Enter Length of  the Rectangle : ");
			int length=scan.nextInt();
			
			System.out.print("Enter Breadth of the Rectangle : ");
			int breadth=scan.nextInt();
			sh=new Rectangle(color,length,breadth);
			break;
			
			}
			
			case 2:
			{
				System.out.print("Enter color the Circle : ");
				String color=scan.next();
				
				System.out.print("Enter Radius of the Circle : ");
				int radius=scan.nextInt();

				sh=new Circle(color,radius);
				System.out.println();
				break;
			}
			case 3:
			{
				System.out.print("Enter color the Triangle : ");
				String color=scan.next();
				
				System.out.print("Enter Height of  the Triangle : ");
				int height=scan.nextInt();
				
				System.out.print("Enter Base of the Triangle : ");
				int base=scan.nextInt();
				System.out.println();
				sh=new Triangle(color,height,base);
				
				break;
			}
			default:
			{
				System.err.println("Invalid Shape Selection :: try Again");
				continue;
			}
			
			}
			
			break;
		}//whileLoop
		System.out.println();
		System.out.println("=".repeat(15)+"SHAPE SELECTED : "+sh.getClass().getSimpleName().toUpperCase()+"=".repeat(15));
		System.out.println();
		System.out.println("Color of "+sh.getClass().getSimpleName().toUpperCase()+" is "+sh.getColor());
		while(true)
		{
			System.out.print("Do you want to Change the Color[Y/N] : ");
			String opt=scan.next();
			if(opt.equalsIgnoreCase("y"))
			{
				System.out.print("Enter the new Color : ");
				String color=scan.next();
				sh.setColor(color);
				System.out.println("Updated color of "+sh.getClass().getSimpleName().toUpperCase()+" is "+color);
				break;
			}
			else 
			{
				break;
			}
			
		}//whileLoop
		
		sh.area();

	}//main

}
