package com.singleton;

/**
 * Eager initialization of Singleton Class 
 * @author Shibu
 *
 */
public class SingletonClass {

	private static volatile SingletonClass sSoleInstance = new SingletonClass();

	private SingletonClass() {
	}

	public static SingletonClass getInstance() {
		return sSoleInstance;

	}
}
