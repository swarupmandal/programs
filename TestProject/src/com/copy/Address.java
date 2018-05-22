package com.copy;

public class Address implements Cloneable{

	String street;
	String city;

	Address(String street, String city) {

		this.city = city;
		this.street = street;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + "]";
	}
	
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}

}
