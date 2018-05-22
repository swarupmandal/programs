package com.overload;

public class TestOverload {

	void sum(int a, int b) {
		System.out.println("int arg method invoked");
	}

	void sum(long a, long b) {
		System.out.println("long arg method invoked");
	}
	
	public static void main(String[] args) {
		
		TestOverload overload = new TestOverload();
		
		overload.sum(10, 10);
	}
}
