package com.test;

public class Company {

	final int id;
	final static String name;
	Company() {
		id = 10;
	}
	
	static{
		name = "INT";
	}
	
	static void display() {
		System.out.println("Company name ==>> "+name);
	}
	
	/*public static void main(String[] args) {

		Company company = new Company();
		System.out.println(company.id);
		System.out.println(company.name);
	}*/

}
