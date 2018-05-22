package com.statictest;

class ParentTest {
	
	ParentTest(){
		System.out.println("Parent Constructor..");
	}
	
	static{
		
		System.out.println("Parent Static Block..");
	}
	
	{
		
		System.out.println("Parent IIB Block..");
	}
	
}

class DemoStatic extends ParentTest {

	DemoStatic(){
		System.out.println("Child Constructor..");
	}
	
	static{
		
		System.out.println("Child Static Block..");
	}
	
	{
		
		System.out.println("Child IIB Block..");
	}
	
	public static void main(String[] args) {
		
		DemoStatic demoStatic  = new DemoStatic();
		
	}

}
