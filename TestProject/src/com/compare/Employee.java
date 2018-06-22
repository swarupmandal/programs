package com.compare;

public class Employee {

	private int id;
	private String name;
	private boolean isNew;
	
	public Employee(int id, String name, boolean isNew) {
		this.id = id;
		this.name = name;
		this.isNew = isNew;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public boolean isNew() {
		return isNew;
	}
	
	@Override
	public String toString() {
		return "ID > " + this.id +" NAME > " + this.name +" NEW > " + this.isNew;
	}
	
}
