package com.atm;
abstract class BankAccount
{
	 int accNum;
	 String accHolder;
	 double accBalance;
	
	public BankAccount(int accNum, String accHolder, double accBalance) {
		this.accNum = accNum;
		this.accHolder = accHolder;
		this.accBalance = accBalance;
	}
	public double showBalance()
	{
		return accBalance;
	}
	public double withdraw(double amount);
	public double deposit(double amount);
	@Override
	public String toString() {
		return "BankAccount [accNum=" + accNum + ", accHolder=" + accHolder + ", accBalance=" + accBalance + "]";
	}
}