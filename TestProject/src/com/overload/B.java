package com.overload;

class A {
	A get() {
		return this;
	}
}

public class B extends A {

	B get() {
		return this;
	}

	void message() {
		System.out.println("welcome to covariant return type");
	}

	public static void main(String[] args) {
		
		//new B().get().message();
		
		A a = new A();
		System.out.println("A==>"+a.hashCode());
				
	}
}
