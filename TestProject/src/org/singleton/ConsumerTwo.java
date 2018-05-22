package org.singleton;

public class ConsumerTwo {
	
	public ConsumerTwo() {
		Driver.driverCreation();
		System.out.println("--------------------->> " + Driver.driverCreation().hashCode());
	}
	
	public void checkTwo(){
		
	}
	
}
