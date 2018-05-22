package com.alutest;

class Parent {
	public int sum(int a, long b) {
		System.out.println("In Parent Class");
		return (int) (a + b);
	}
}

public class Child extends Parent {

	public int sum(long a, int b) {
		System.out.println("In Child Class");
		return (int) (a + b);
	}
	
	public static void main(String[] args) {
		Parent parent = new Child();
		System.out.println(parent.sum(10, 10));
	}
}

// output 
//In Parent Class
//20

//If we change the reference variable of Parent to Child then ambiguous case raised.