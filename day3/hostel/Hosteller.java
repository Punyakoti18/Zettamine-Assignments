package com.zettamine.java.day3.hostel;

public class Hosteller extends Student
{
	private String hostelName;
	private int roomNo;

	
	public Hosteller(int studentId, String name, int deptId, String gender,
			String phone, String hostelName,int roomNo) {
		super(studentId, name, deptId, gender, phone);
		this.hostelName = hostelName;
		this.roomNo = roomNo;
	}

	public String getHostelName() {
		return hostelName;
	}

	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	
	

}
