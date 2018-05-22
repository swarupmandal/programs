package com.test;

public interface TestInterface {
	
	public default void display(){
		
		System.out.println("default");
		
	}
	
	public static void display1(){
		
		System.out.println("static");
		
	}
}
