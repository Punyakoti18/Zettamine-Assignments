package com.zettamine.java.day5.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;
import java.util.Scanner;



public class ProductDeserialization {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) throws Exception {

		try(FileInputStream fio=new FileInputStream("C:\\Users\\Punyakoti Reddy\\Desktop\\stock.ser"))
		{
			ObjectInputStream ois=new ObjectInputStream(fio);
			
			List<Product> products = (List<Product>)ois.readObject();
			System.out.println(products);
			System.out.println();

			for(int i=0;i<products.size();i++)
			{
				System.out.print("Enter the Product ID: ");
				int proId=scan.nextInt();
				for (Product prod : products) 
				{
					if(prod.getProductId()==proId)
					{
						System.out.println(prod.getProductName());
					}
					
				}
			}
			
			
		} catch (FileNotFoundException e) {
			
			System.out.println("please Create Stock File");
			
		} catch (IOException e) {
			
			System.out.println("Please Enter Stock Details");
		}
	}
	
}
