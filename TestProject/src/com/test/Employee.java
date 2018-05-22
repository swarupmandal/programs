package com.test;

public class Employee extends Company {

	private static String name = "Avirup";
	static void display() {
		System.out.println("Employee name ==>> "+name);
	}
	
	static void downcasting(Company company) {
		Employee employee = (Employee) company;
		System.out.println("Downcasting");
	}
	
	public static void main(String[] args) {
		
		Company company = new Employee();
		company.display();
		Employee.downcasting(company);
	}
}
