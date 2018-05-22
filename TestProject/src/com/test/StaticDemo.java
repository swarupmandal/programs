package com.test;

public class StaticDemo {

	static String name= "shib";
	
	static {
		name = "abc";
		
		//System.out.println(name);
	}
	

	public static void display(String cName){
		
		name = cName;
		System.out.println(name);
		
	}
	
	public static void main(String[] args) {

		StaticDemo.display("avi");
		
		/*\u000dSystem.out.println("creee");*/
	}

}
