package com.copy;

public class TestStudent {

	public static void main(String[] args) {
		
		Address address = new Address("1st", "Kolkata");
		Student s1 = new Student(10, "Shib",address);
		Student s2 = null;
		try {
				s2 = (Student) s1.clone();
		} catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		
		s2.address.city = "Delhi";
		s2.name = "Avirup";
		s2.roll = 11;
		
		System.out.println("S2==>"+s2.toString());
		System.out.println("S1==>"+s1.toString());
		
	}
}
