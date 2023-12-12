package com.zettamine.java.day4.vehicle_loan;



public class Vehicle implements Loan,Insurance 
{
	private String vehicleNumber;
	private String modelName;
	private String vehicleType;
	private double price;
	
	
	public Vehicle(String vehicleNumber, String modelName, String vehicleType, double price) {
		super();
		this.vehicleNumber = vehicleNumber;
		this.modelName = modelName;
		this.vehicleType = vehicleType;
		this.price = price;
	}


	public String getVehicleNumber() {
		return vehicleNumber;
	}


	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}


	public String getModelName() {
		return modelName;
	}


	public void setModelName(String modelName) {
		this.modelName = modelName;
	}


	public String getVehicleType() {
		return vehicleType;
	}


	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
	
	
	public double issueLoan()
	{
		
		if(vehicleType.equals("4 wheeler"))
		{
			float res=(float)(0.8*this.price);
			return res;
		}
		else if(vehicleType.equals("3 wheeler"))
		{
			float res=(float)(0.75*this.price);
			return res;
		}
		float res=(float)(0.5*this.price);
		return res;
	}
	
	public double takeInsurance()
	{
		if(price<=150000)
		{
			return 3500;
		}
		else if(price>150000 && price<=300000)
		{
			return 4000;
		}
		return 5000;
		 
	}
	
	
	

}
