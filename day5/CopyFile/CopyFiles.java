package com.zettamine.java.day5.copyfile;

import java.io.File;
import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class CopyFiles1 {

	public static void main(String... args) {
		
		String src=args[0];
		String destination=args[1];
		
		File dir1=new File(src);
		
		if(!dir1.exists())
		{
			System.out.println("Directory Not Found");
			System.exit(0);
		}
		
		File dir2=new File(destination);
		//if(!dir2.exists())
		{
			dir2.mkdir();
			copyFiles(dir1,dir2);
		}
		
		
		

	}

	private static void copyFiles(File dir1, File dir2) {
		System.out.println("!!!!!!!!!!!!!!!!!!!");
		try {
			System.out.println("!!!!!!!!!");
			Files.copy(dir1.toPath(),dir2.toPath(),StandardCopyOption.REPLACE_EXISTING);
			System.out.println("Successfully Copied");
		} catch (IOException e) {
		
			System.out.println(e);
			e.printStackTrace();
		}
		
	}

	
}
