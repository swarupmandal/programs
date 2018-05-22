package com.compare;

import java.util.Comparator;

public class Student implements Comparable<Student> {

	public int roll;
	public String name;
	public int age;
	public Double salary;

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Student o) {

		if (this.age == o.age)
			return 0;
		else if (this.age > o.age)
			return 1;
		else
			return -1;
	}
	
	public static Comparator<Student> ageComparator = new Comparator<Student>() {

		@Override
		public int compare(Student o1, Student o2) {
			return o1.getAge() - o2.getAge();
		}
    };
    
    public static Comparator<Student> nameComparator = new Comparator<Student>() {

		@Override
		public int compare(Student o1, Student o2) {
			return o1.getName().compareTo(o2.getName());
		}
    };
    
    public static Comparator<Student> rollComparator = new Comparator<Student>() {

		@Override
		public int compare(Student o1, Student o2) {
			return o1.getRoll() - o2.getRoll();
		}
    };
    
    public static Comparator<Student> salaryComparator = new Comparator<Student>() {

		@Override
		public int compare(Student o1, Student o2) {
			return o1.getSalary().compareTo( o2.getSalary());
		}
    };

}
