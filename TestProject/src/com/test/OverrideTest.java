package com.test;

class T {
	public static int i;
/*	private void display() {
		System.out.println("Private...T");
	}*/
	
	T(int i){
		this.i = i;
		System.out.println(i);
	}
}

class OverrideTest extends T {
	OverrideTest(int i) {
		super(i);
		// TODO Auto-generated constructor stub
	}

	private static int i;
	
	private void display() {
		System.out.println("Private...OverrideTest"+super.i);
	}
	
	public static void main(String[] args) {
		
		 new OverrideTest(10);
		
		//t.display();
		//System.out.println(t);
	}
}
