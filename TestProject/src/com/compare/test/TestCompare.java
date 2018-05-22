package com.compare.test;

import java.util.ArrayList;
import java.util.Collections;

public class TestCompare {

	public static void main(String[] args) {

		/*===============Comparable=============*/
		ArrayList<Employee> employees = new ArrayList<Employee>();
		
		employees.add(new Employee(20, "shib", 50000.0));
		employees.add(new Employee(24, "Avi", 35000.0));
		employees.add(new Employee(26, "Tumpa", 85000.0));
		employees.add(new Employee(18, "subja", 45000.0));
		
		Collections.sort(employees);
		
		// Sort By Using Comparable
		for(Employee employee:employees){
			
			System.out.println("Age=>"+employee.age+" Name=>"+employee.name+" Salary=>"+employee.salary);
		}
		
	}

}
