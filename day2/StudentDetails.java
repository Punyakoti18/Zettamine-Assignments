package com.zettamine.java.day2;

public class StudentDetails {
	private int id;
	private String name;
	private String address;
	private String college;
	
StudentDetails(int id,String name,
		String address,String college)
{
	this.id=id;
	this.name=name;
	this.address=address;
	this.college=college;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getCollege() {
	return college;
}

public void setCollege(String college) {
	this.college = college;
}

}
