package com.oops;

public class DataAccess {
	
	public static void main(String[] args) {
		
		Parent p1 = new Parent();
		Child c1 = new Child();
		
		p1.p();
		c1.p();
		c1.c();
		
		Parent p2 = new Child();
		p2.p();
		
		
		
	}

}

interface Master {
	
	void m();
}

class Parent {
	public void p(){
		System.out.println("Parent Method");
	}
}

class Child extends Parent {
	public void c(){
		System.out.println("Child Method");
	}
	
	public void p(){
		System.out.println("Overrided Parent Method");
	}
}
