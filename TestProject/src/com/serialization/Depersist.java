package com.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Depersist {

	public static void main(String[] args) throws Exception{

		FileInputStream fileInputStream = new FileInputStream("D:\\st.txt");
		@SuppressWarnings("resource")
		ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
		
		Student s = (Student) inputStream.readObject();
		
		System.out.println("Student=>"+s);
	}

}
