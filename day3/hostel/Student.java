package com.zettamine.java.day3.hostel;

public class Student {
	protected int studentId;
	protected String name;
	protected int deptId;
	protected String gender;
	protected String phone;
	public Student(int studentId, String name, int deptId, String gender, String phone) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.deptId = deptId;
		this.gender = gender;
		this.phone = phone;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getGender() {
		return gender;
	}
	public void setGenger(String gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	

}
