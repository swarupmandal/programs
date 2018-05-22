package com.statics;

class TestB {
	
	static {
		
		System.out.println(" P Static");
	}
	
	{
		System.out.println("IIB Parent");
	}
	
	public TestB() {
		
		System.out.println(" Constructor Parent...");
	}
}
class TestC extends TestB{

	static {
		
		System.out.println(" C Static");
	}
	
	{
		System.out.println("IIB Child");
	}
	
	public TestC() {
		
		System.out.println(" Constructor Child...");
	}
	
	public static void main(String[] args) {
		
		TestC c = new TestC();
	}
}
