package com.string;

public final class ImmutableClass {
	final String pancardNumber;

	public ImmutableClass(String pancardNumber) {
		this.pancardNumber = pancardNumber;
	}

	public String getPancardNumber() {
		return pancardNumber;
	}
	
	public static void main(String[] args) {
		ImmutableClass immutableClass = new ImmutableClass("10");
		
	}
}
