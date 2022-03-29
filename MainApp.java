package com.atm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		 WithdrawalEventPublisher publisher = (WithdrawalEventPublisher) context.getBean("WithdrawalEventPublisher");
		SavingsAccount acc1 = new SavingsAccount(515, "Satya", 2000000);
		SalaryAccount acc2=new SalaryAccount(503,"satya",3000000);
		System.out.println(acc1);
		System.out.println(acc2);
		double balance=acc1.withdraw(2000);
		double balance2=acc2.withdraw(50000);
		publisher.publish(balance);
		publisher.publish(balance2);
	}
}