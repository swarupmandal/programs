package com.hashcode;

public class TestHashCode implements Cloneable {

	private int age;
	private String name;

	public TestHashCode(int age, String name) {

		this.age = age;
		this.name = name;
	}

	public static void main(String[] args) throws CloneNotSupportedException {

		TestHashCode hashCode = new TestHashCode(10, "shib");
		TestHashCode hashCode2 = new TestHashCode(10, "shib");

		// TestHashCode hashCode2 = (TestHashCode) hashCode.clone();

		System.out.println("hashCode=>" + hashCode.hashCode() + "---hashCode2==>" + hashCode2.hashCode());

		System.out.println(hashCode.equals(hashCode2));// false

		System.out.println(hashCode.age == hashCode2.age);// true

		System.out.println(hashCode == hashCode2); // false

		try {

		} catch (Exception e) {

			
		}

	}

}
