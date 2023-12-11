package com.zettamine.java.day3;

import java.util.Collection;

public class StudentDetailes {
	private int studentID;
	static int id=101;
	static String collegeName="Saveetha Engg College";
	private String sName;
	private String sEmail;
	
	
	
	
	
	public StudentDetailes(String sName, String sEmail) {
	
		this.sName = sName;
		this.sEmail = sEmail;
		this.studentID = id++; 
	}


	public int getStudentID() {
		return studentID;
	}


	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}


	public static String getCollegeName() {
		return collegeName;
	}


	public static void setCollegeName(String collegeName) {
		StudentDetailes.collegeName = collegeName;
	}


	public String getsName() {
		return sName;
	}


	public void setsName(String sName) {
		this.sName = sName;
	}


	public String getsEmail() {
		return sEmail;
	}


	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}


	@Override
	public String toString() {
		return "  "+ studentID + "\t\t " + sName + "\t" + sEmail + " \t    "+collegeName+"";
	}


	
	
	

}
