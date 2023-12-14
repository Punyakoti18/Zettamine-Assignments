package com.zettamine.java.day6.students_based_location;

public class Student 
{
	private String name;
	private String location;
	private String email;
	private long mobile;
	
	
	public Student(String name, String location, String email, long mobile) {
		super();
		this.name = name;
		this.location = location;
		this.email = email;
		this.mobile = mobile;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public long getMobile() {
		return mobile;
	}


	public void setMobile(long mobile) {
		this.mobile = mobile;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", location=" + location + ", email=" + email + ", mobile=" + mobile + "]";
	}
	
	

}
