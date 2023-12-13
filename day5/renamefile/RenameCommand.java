package com.zettamine.java.day5.renamefile;

import java.io.File;
import java.io.IOException;

public class RenameCommand {

	public static void main(String... args) throws IOException {
	    String path=args[0];
		String oldName=args[1];
		String newName=args[2];
		
		File oldFile=new File(path,oldName);
		
		if(!oldFile.exists())
		{

			System.out.println("File Doesn't Exist.");
			return;
		}
		else 
		{
				File newFile=new File(path,newName);
				if(oldFile.renameTo(newFile))
				{
					System.out.println("File rename Successfully Updated");
				}
				else
				{
					System.out.println("File rename failed.");
				}
			}
	
}	
}

