package com.zettamine.java.day5.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;



public class ProductDeserialization {

	
	public static void main(String[] args) throws Exception {

		try(FileInputStream fio=new FileInputStream("C:\\Users\\Punyakoti Reddy\\Desktop\\stock.ser"))
		{
			ObjectInputStream ois=new ObjectInputStream(fio);
			
			List<Product> products = (List<Product>)ois.readObject();
			System.out.println(products);
			System.out.println();
			System.out.println("The Product Names :");
			for (Product pro : products) {
				System.out.println(pro.getProductName());
			}
			
			
		} catch (FileNotFoundException e) {
			
			System.out.println("please Create Stock File");
			
		} catch (IOException e) {
			
			System.out.println("Please Enter Stock Details");
		}
	}
	
}
