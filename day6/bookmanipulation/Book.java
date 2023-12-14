package com.zettamine.java.day6.bookmanipulation;

public class Book 
{
	private long isbnNo;
	private String bookTitle;
	private String bookAuthor;
	
	
	


	public Book(int isbn, String name, String author) {
		super();
		this.isbnNo = isbn;
		this.bookTitle = name;
		this.bookAuthor = author;
	}


	@Override
	public String toString() {
		return "Book [isbnNo=" + isbnNo + ", bookTitle=" + bookTitle + ", bookAuthor=" + bookAuthor + "]";
	}


	public long getIsbnNo() {
		return isbnNo;
	}


	public void setIsbnNo(long isbnNo) {
		this.isbnNo = isbnNo;
	}


	public String getBookTitle() {
		return bookTitle;
	}


	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}


	public String getBookAuthor() {
		return bookAuthor;
	}


	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	
	

}
