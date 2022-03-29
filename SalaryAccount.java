package com.atm;
public class SalaryAccount extends BankAccount
{
	public SalaryAccount(int accNum, String accHolder, double accBalance) {
		super(accNum, accHolder, accBalance);
	}
	@Override
	public double withdraw(double amount)
	{
		if(amount>100000)
			System.out.println("You cannot take more than "+amount);
		else
			this.accBalance=this.accBalance-amount;
		return super.showBalance();
	}
	public double deposit(double amount)
	{
		System.out.println("You have no limit in depositing money");
		this.accBalance=this.accBalance+amount;
	return super.showBalance();
	}
	public void display()
	{
		super.toString();
	}
}