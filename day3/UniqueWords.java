package com.zettamine.java.day3;

import java.util.ArrayList;
import java.util.List;

public class UniqueWords {
	

	public static void main(String[] args) {
		
	String sentence="Hello Everybody,welcome to collection in java.Collection is like a container and powerfull concept in java.";
	
	
	String[] words=sentence.split("[^A-Za-z]+");
	List list=new ArrayList();
	
	for (String word : words) {
		System.out.print(word+" ");
		
	}
	System.out.println("\n");
	
    int count=0;
    System.out.print("Uniqe Words : ");
	for (int i=0;i<words.length;i++)
	{
		String str =words[i].toLowerCase();
		if(!list.contains(str))
		{
			list.add(words[i]);
			count++;
		}
		else
		{
			System.out.print(str+" ");
		}
	}//for loop
	
	System.out.println();
	System.out.println("No of Unique Words : "+count);
	
	
	}

}
