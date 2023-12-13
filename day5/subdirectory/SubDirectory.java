package com.zettamine.java.day5.subdirectory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class SubDirectory {

	public static void main(String[] args) {
		
		
		File f=new File("C:/CJava");
		
		if(!f.exists())
		{
		   f.mkdirs();
		   System.out.println("Successfully Created");
		}
		else
		{
			System.out.println("Already Existed");
		return;
		}
		
		//String subDirectoryPath="java";
		f=new File("C:/CJava/java");
		
		if(!f.exists())
		{
			f.mkdir();
			System.out.println("Successfully Created");
		}
		else
		{
			System.out.println("Already Existed");
		}
		
		
		f=new File("C:/CJava/java/java.txt");
		if(!f.exists())
		{
		try {
			
		f.createNewFile();
		System.out.println("Successfully Created");
		}
		catch (IOException e) {
			
			e.printStackTrace();
		}
		}
		

	}

}
