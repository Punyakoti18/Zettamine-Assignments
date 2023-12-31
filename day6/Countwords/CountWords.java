package com.zettamine.java.day6.Countwords;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CountWords {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Student's Article: ");
		String article=scan.nextLine().toLowerCase();
		
		String[] words=article.split("[,;:.?! ]+");
		
        System.out.println("Number of words: " + words.length);
		
		 Map<String, Integer> wordCounts = new Hashtable<>();

	        
	        for (String word : words) 
	        {
			if (!wordCounts.containsKey(word)) {

				wordCounts.put(word, 1);
			} else {
				wordCounts.put(word, wordCounts.get(word) + 1);
			}   

			
	        }
	        System.out.println();
	        System.out.println("Words with the count");
	        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }
	
		
	}

}
/* Method-2:-

  String wod=word.toLowerCase();
  wordCounts.put(wod, wordCounts.getOrDefault(wod,0)+1);
}*/
