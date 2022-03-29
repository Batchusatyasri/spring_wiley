package com.atm;
import java.util.Date;
import org.springframework.context.ApplicationEvent;
public class WithdrawalEvent extends ApplicationEvent
{
	double accBalance;
	public WithdrawalEvent(Object source,double accBalance)
	{
		super(source);
		this.accBalance=accBalance;
	}
	@Override
	public String toString()
	{
		return "Your money is withdrawn from your account.  " +"\n" +"Your remaining accbalance is "+this.accBalance+" "
				+"Timestamp is"+new Date();
	}
}
