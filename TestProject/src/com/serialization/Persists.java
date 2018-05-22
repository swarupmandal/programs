package com.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Persists {

	public static void main(String[] args) throws IOException {

		Student student = new Student(101, "shib1","SSS IT Pvt Ltd");

		try {
			FileOutputStream fileOutputStream = new FileOutputStream("D:\\st.txt");
			@SuppressWarnings("resource")
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			
			objectOutputStream.writeObject(student);
			objectOutputStream.flush();
			Student.company = "INT"; // Not 
			student.roll = 200; 
			System.out.println("Success...");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
