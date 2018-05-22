package com.inheritance;

class Grand {

	void display(){
		System.out.println("Grand...");
	}
}

class Parent extends Grand {
	void display(){
		System.out.println("Parent...");
	}
}

class ChildTest extends Parent {
	
	void display(){
		System.out.println("ChildTest...");
	}
	public static void main(String[] args) {

		Grand d = new Grand();
		
		d.display();
				
	}

}
