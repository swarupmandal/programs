package com.reflection;

public class Student {

	public static String s = "hello";
	private int id;
	private String name;	
	public String address;
	
	public Student() {
		System.out.println("public default constructor");
	}
	
	@SuppressWarnings("unused")
	private Student(String name){
		System.out.println("private arg1 constructor Student");
		this.name = name;
	}
	
	@SuppressWarnings("unused")
	private Student(String name, int id){
		System.out.println("private arg0, arg1 constructor Student");
		this.name = name;
		this.id = id;
	}
	
	@SuppressWarnings("unused")
	private void test(String name, int id){
		System.out.println("private test " + name + " - " + id);
	}
	
	public void test1(){
		System.out.println("local test");
	}

	public static String getS() {
		return s;
	}

	public static void setS(String s) {
		Student.s = s;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
