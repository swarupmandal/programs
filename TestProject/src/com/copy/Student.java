package com.copy;

public class Student implements Cloneable {

	int roll;
	String name;
	Address address;

	Student(int roll, String name, Address address) {

		this.name = name;
		this.roll = roll;
		this.address = address;
	}

	protected Object clone() throws CloneNotSupportedException {

				
		Student student = (Student) super.clone();
		 
        student.address = (Address) address.clone();
 
        return student;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address="
				+ address + "]";
	}

}
