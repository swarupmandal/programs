package com.singleton;


public class LazySingleton{
	
	private static transient LazySingleton lazySingleton;

	private LazySingleton() {

		if (lazySingleton != null) {
			throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
		}

	}

	public static LazySingleton getInstance() {
		if (lazySingleton == null) {

			lazySingleton = new LazySingleton();
		}

		return lazySingleton;

	}
}
