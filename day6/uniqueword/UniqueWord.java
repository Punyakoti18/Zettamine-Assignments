package com.zettamine.java.day6.uniqueword;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class UniqueWord {
	static Scanner scan=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter Student Articles: ");
		String article=scan.nextLine();
		
		
		String[] words=article.split("[^A-Za-z]+");
		System.out.println("Number of words: "+words.length);
		
		List<String> uniquewords=new ArrayList<>();
		
		
		for (String word : words) 
		{
			String str=word.toLowerCase();
			if(!uniquewords.contains(str))
			{
				uniquewords.add(str);
			}
		}
		Collections.sort(uniquewords);
		System.out.println(uniquewords.size());
		System.out.println();
		System.out.println("The words Are: ");
		
		int i=0;
		for (String word : uniquewords) 
		{
			System.out.println((++i)+"."+word);
		}

	}

}
