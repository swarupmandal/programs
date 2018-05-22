package com.reflection;

import com.reflection.privateAccess.PrivateField;




public class Reflex {
	
	
	
	public static void main(String[] args) {
		
		Student student;
		PrivateField field;
		try {
			student =reflex1();
			field = new PrivateField();
			String name = field.getPrivateField(student);
			System.out.println("CITY >>> >> > "+name);
			
			student = reflexMethods();
			field = new PrivateField();
			field.getPrivateMethod(student);
			
			field = new PrivateField();
			field.getPrivateConstructor();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static Student reflex1() {
		
		Student student = new Student();
		student.setName("Calcutta");
		
		return student;
 	}
	
	public static Student reflexMethods(){
		
		Student student = new Student();
		return student;
	}
	public static Student reflexConstructor(){
		
		Student student = new Student();
		return student;
	}


}
