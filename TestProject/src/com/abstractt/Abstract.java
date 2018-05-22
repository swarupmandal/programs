package com.abstractt;

abstract class Parent {

	abstract void display();
}

class Abstract extends Parent{

	@Override
	void display() {
		System.out.println("Child Override....");
	}
	
	
	
	public static void main(String[] args) {
		Parent p = new Abstract();
		
		p.display();
	}
}
