package com.listcompaire;

public class FoodItem {
	
	private int id;
	private String name;
	private String test;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTest() {
		return test;
	}
	public void setTest(String test) {
		this.test = test;
	}
	
	
	
	
	@Override
	public String toString() {
		return "ID " + this.id +" - Name " + this.name +" - Test " + this.test;
	}

}
