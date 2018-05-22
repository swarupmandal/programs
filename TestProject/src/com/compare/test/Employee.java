package com.compare.test;

public class Employee implements Comparable<Employee> {

	int age;
	String name;
	Double salary;

	public Employee(int age, String name, Double salary) {
		this.age = age;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee o) {
		
		// Sort By age int.
		/*if (age == o.age)
			return 0;
		else if (age > o.age)
			return 1;
		else
			return -1;*/
		
		//Sort By Salary Double
				
		/*if (salary == o.salary)
			return 0;
		else if (salary > o.salary)
			return 1;
		else
			return -1;*/
		
		return name.compareTo(o.name);
	}

}
