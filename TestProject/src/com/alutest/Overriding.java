package com.alutest;

class ParentT{
	
	public static void display(){
		
		System.out.println("Parent Static Display...");
	}
	
	private void disp(){
		
		System.out.println("Parent Static Display...");
	}
	
}
public class Overriding extends ParentT{

	public static void display(){
		
		System.out.println("Child Static Display...");
	}
	
	public void disp(){
		
		System.out.println("Child Static Display...");
	}
	
	public static void main(String[] args) {
		
		Overriding t = new Overriding();
		
		Overriding.display();
		
		t.disp();
		
	}
}


