package com.zettamine.java.day4.account;

public class SavingsAccount extends Account 
{
	private double minimumBalance;
	
	
	
	public SavingsAccount(long accNo, Customer customerObj, double balance, double minimumBalance) {
		super(accNo, customerObj, balance);
		this.minimumBalance = minimumBalance;
	}



	public double getMinimumBalance() {
		return minimumBalance;
	}



	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}



	public boolean withdraw(double amount)
	{
		double bal=(double)balance-amount;
		if(bal>minimumBalance)
		{
			balance=balance-amount;
			return true;
		}
		return false;
		
		
	}

}
