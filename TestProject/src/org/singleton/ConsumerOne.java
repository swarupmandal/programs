package org.singleton;

public class ConsumerOne {
	
	public ConsumerOne() {
		
		Driver.driverCreation();
		System.out.println("---------------------> " + Driver.driverCreation().hashCode());
	}
	
	public void checkOne(){
		
	}

}
