package com.testthis;

public class TestThis {

	public TestThis() {
		
		System.out.println("Currenct Instance==>"+this.hashCode());
	}
	
	/*public TestThis(int x){
		this();
		System.out.println("2nd cons==>"+x);
	}
	
	public TestThis(int x,int y){
		this(5);
		System.out.println("2nd cons==>"+x);
	}*/
	
	public static void main(String[] args) {

		TestThis ss = new TestThis();
		
		System.out.println(ss.hashCode());
		
	}

}
