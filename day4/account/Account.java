package com.zettamine.java.day4.account;

public abstract class Account 
{
	protected long accNo;
	protected Customer customerObj;
	protected double balance;
	
	public Account(long accNo, Customer customerObj, double balance) {
		super();
		this.accNo = accNo;
		this.customerObj = customerObj;
		this.balance = balance;
	}

	public long getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public Customer getCustomerObj() {
		return customerObj;
	}

	public void setCustomerObj(Customer customerObj) {
		this.customerObj = customerObj;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public abstract boolean withdraw(double amount);

}
