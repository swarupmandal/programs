package com.serialization;

import java.io.Serializable;

public class Student implements Serializable {

	private static final long serialVersionUID = 647560678419911797L;

	static String company;//it won't be serialized
	int roll;
	private String name;

	public Student(int roll, String name,String company) {
		this.roll = roll;
		this.name = name;
		Student.company = company;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ",company=" + company + "]";
	}

	
	

}
