package com.zettamine.java.day5.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class ProductProcess {

	static Scanner scan=new Scanner(System.in);
	
	public static void main(String[] args)  
	{
		ArrayList<Product> prodList= new ArrayList<>();
		
		Product prod;
		
		System.out.println("How many products to be saved: ");
		int n=scan.nextInt();
		
		int i=0;
		while(i<n)
		{
			System.out.println("Enter product id & product name of Product-"+(i+1)+": ");
			int proId=scan.nextInt();
			String proName=scan.nextLine();
			System.out.println();
			
			prodList.add(new Product(proId,proName));
			
			i++;
		}
		System.out.println();
		System.out.println(prodList);
		
		System.out.println("-".repeat(40));
		
		
		//Serialization
		FileOutputStream fos=null;
		try
		{	
		fos=new FileOutputStream("C:\\Users\\Punyakoti Reddy\\Desktop\\Stock.ser");
		
		
			ObjectOutputStream oos=new ObjectOutputStream(fos);

			oos.writeObject(prodList);
			
			System.out.println("Successfully Updated.");
		}
		catch(FileNotFoundException e)
		{
			e.getStackTrace();
		}
		
		catch(IOException e)
		{
			e.getStackTrace();
		}
		finally
		{
			try {
			fos.close();
			}
			catch(IOException e)
			{
				e.getStackTrace();
			}
		}//finally
		
		
		
	}

}
