package com.atm;
public class SavingsAccount extends BankAccount
{

	public SavingsAccount(int accNum, String accHolder, double accBalance) {
		super(accNum, accHolder, accBalance);
	}
	@Override
	public double withdraw(double amount)
	{
		if(amount>30000.00)
		{
			System.out.println("You crossed the transaction limit");
		}
		else
			this.accBalance=this.accBalance-amount;
		return super.showBalance();
	}
	public double deposit(double amount)
	{
		if(amount>1000000)
			System.out.println("You cannot deposit more than "+amount);
		else
			this.accBalance=this.accBalance+amount;
		return super.showBalance();
		
	}
	public void displaydetails()
	{
		super.toString();
	}
}
