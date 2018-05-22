package org.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class DriverMain {
	
	public static void main(String[] args) {
		
		/*ConsumerOne consumerOne = new ConsumerOne();
		consumerOne.checkOne();
		
		ConsumerTwo consumerTwo = new ConsumerTwo();
		consumerTwo.checkTwo();*/
		
		
		
		try {
			Class<Driver> clazz = Driver.class;
			Constructor<Driver> cons = clazz.getDeclaredConstructor();
			cons.setAccessible(true);
			System.out.println(cons.newInstance().hashCode());
			System.out.println(cons.newInstance().hashCode());
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
