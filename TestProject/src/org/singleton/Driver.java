package org.singleton;

public class Driver {
	
	private static Driver driver;
	
	private Driver() {
		
		if(null == driver)
		System.out.println("-- -- -- --");
		else
		System.out.println("cons >>> >> > " + driver.hashCode());
	}
	
	
	public static Driver driverCreation(){
		if(null == driver){
			
			System.out.println("<<<<<<<<<<<<<<<<<< ONLY ONE TIME DRIVER OBJECT IS CREATING >>>>>>>>>>>>>>>>>>");
			
			driver = new Driver();
		}
		
		System.out.println("Only one driver >>> >> > " + driver.hashCode());
		return driver;
	}
	
	public void printDriverStatus(){
		System.out.println("inside print driver");
	}
	

}
