package com.atm;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
public class WithdrawalEventPublisher implements ApplicationEventPublisherAware  {
	private ApplicationEventPublisher publisher;
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher=publisher;
		
	}
	public void publish(double accBalance) {
		WithdrawalEvent event = new WithdrawalEvent(this,accBalance);
		this.publisher.publishEvent(event);
	}
}