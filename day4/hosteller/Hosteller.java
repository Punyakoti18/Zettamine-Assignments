package com.zettamine.java.day4.hosteller;

public class Hosteller {
	 private String hostelName;
	 private int roomNumber;
	 private Student studentDetails;
	 
	public Hosteller(String hostelName, int roomNumber, Student studentDetails) {
		super();
		this.hostelName = hostelName;
		this.roomNumber = roomNumber;
		this.studentDetails = studentDetails;
	}

	public String getHostelName() {
		return hostelName;
	}

	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Student getStudentDetails() {
		return studentDetails;
	}

	public void setStudentDetails(Student studentDetails) {
		this.studentDetails = studentDetails;
	}
	
	


}
