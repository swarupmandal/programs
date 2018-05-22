package com.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestLazySingleton {

	public static void main(String[] args) {

		// Test for singleton
		/*
		 * LazySingleton lazySingleton = LazySingleton.getInstance();
		 * LazySingleton lazySingleton2 = LazySingleton.getInstance();
		 * System.out.println("lazySingleton==>"+lazySingleton.hashCode());
		 * System.out.println("lazySingleton2==>"+lazySingleton2.hashCode());
		 */
		
		/* using reflection we can break the singleton rule */
		LazySingleton lazySingleton = LazySingleton.getInstance();
		LazySingleton lazySingleton2 = null;

		try {
			
			Class<LazySingleton> clazz = LazySingleton.class;
			Constructor<LazySingleton> cons = clazz.getDeclaredConstructor();
			cons.setAccessible(true);
			lazySingleton2 = cons.newInstance();
			
		} catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException | InstantiationException e) {
			e.printStackTrace();
		}
		
		System.out.println("lazySingleton==>"+lazySingleton.hashCode());
		System.out.println("lazySingleton2==>"+lazySingleton2.hashCode());

	}

}
