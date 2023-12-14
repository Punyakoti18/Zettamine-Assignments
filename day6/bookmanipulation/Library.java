package com.zettamine.java.day6.bookmanipulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
	
	static Scanner scan=new Scanner(System.in);

	public static void main(String[] args) {
		List<Book> bookList=new ArrayList<>();
		
		Book book=null;
		
		while(true)
		{
			System.out.println("1. Add Book\n"
					+ "2. Display all Book Details\n"
					+ "3. Search Book by Author \n"
					+ "4. Count Number of books - by book name\n"
					+ "5. Exit\n");
			int opt=scan.nextInt();
			if(opt==1)
			{
				System.out.println("Enter no. of books need to be add: ");
				int n=scan.nextInt();
				int i=0;
				while(i<n)
				{
					Book a=addBook(book);
					bookList.add(a);
					i++;
				}
			}
			else if(opt==2)
			{
				System.out.println("Displaying all book details");
				System.out.println();
				for (Book bk : bookList) 
				{
					
					System.out.println(bk.getIsbnNo()+" | "+bk.getBookTitle()+" | "+bk.getBookAuthor());
				}
			}
			else if(opt==3)
			{
				System.out.print("Enter the Author Name: ");
				String authorName=scan.next();
				
				String bookDeatiles=findBook(authorName,bookList);
				System.out.println();
				System.out.println(bookDeatiles);
			}
			else if(opt==4)
			{
				int count=countBook(bookList);
				System.out.println();
				System.out.println(count);
			}
			else if(opt==5)
			{
				break;
			}
			else
			{
				System.out.println("Enter the Correct Option: ");
			}
			
			
		}//while
		System.out.println(bookList.isEmpty());

	}

	private static String findBook(String authorName,List<Book> book) 
	{
		for (Book bk : book) 
		{
			if(bk.getBookAuthor().equals(authorName))
			{
				String detailes=bk.getIsbnNo()+" | "+bk.getBookTitle()+" | "+bk.getBookAuthor();
				return detailes;
			}
			
			
		}
		return "None of the book published by the "+ authorName;
		
	}

	private static int countBook(List<Book> bookList) {
		int count=0;
		System.out.print("Enter the Author Name: ");
		String name=scan.next();
		
		for (Book book : bookList) 
		{
			if(book.getBookAuthor().equals(name))
			{
				count++;
			}
		}
		return count;
	}

	public static Book addBook(Book book)
	{
		
		System.out.print("Enter the isbn no: ");
		int isbn=scan.nextInt();
		System.out.println();
		
		
		System.out.print("Enter the book name: ");
		String name=scan.next();
		scan.nextLine();
		
		System.out.print("Enter the author name: ");
		String author=scan.nextLine();
		
		return new Book(isbn,name,author);
		
	}
	public static boolean isEmpty(List<Book> book)
	{
		if(book.isEmpty())
		{
			return true;
		}
		return false;
	}
}
