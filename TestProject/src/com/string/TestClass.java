package com.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestClass {

	/*static void f1(int a) {
		System.out.println("a=>" + a);
	}*/

	/*static void f1(Integer a) {
		System.out.println("Integer a=>" + a);
	}

	static void f1(Long a) {
		System.out.println("Long a=>" + a);
	}

	public static void main(String[] args) {

		TestClass.f1(1L);
	}*/
	
	
public static void main(String[] args) {
		
		Student1 s1 = new Student1();
		s1.setId(1);
		s1.setName("A");
		
		Student1 s2 = new Student1();
		s2.setId(1);
		s2.setName("A");
		
		Student1 s3 = new Student1();
		s3.setId(2);
		s3.setName("B");
		
		Student1 s4 = new Student1();
		s4.setId(2);
		s4.setName("B");
		
		Student1 s5 = new Student1();
		s5.setId(3);
		s5.setName("C");
		
		Student1 s6 = new Student1();
		s6.setId(4);
		s6.setName("D");
		
		Student1 s7 = new Student1();
		s7.setId(1);
		s7.setName("A");
		
		Student1 s8 = new Student1();
		s8.setId(1);
		s8.setName("A");
		
		List<Student1> Student1s = new ArrayList<Student1>();
		Student1s.add(s1);
		Student1s.add(s2);
		Student1s.add(s3);
		Student1s.add(s4);
		Student1s.add(s5);
		Student1s.add(s6);
		Student1s.add(s7);
		Student1s.add(s8);
		
		List<Student1> unique = new ArrayList<Student1>();
		Set<Student1> nonUnique = new HashSet<Student1>();
		
		for(Student1 s : Student1s) {
			if(!unique.contains(s))
				unique.add(s);
			else 
				nonUnique.add(s);
		}
		
		System.out.println("nonUnique :: "+nonUnique);
		unique.removeAll(nonUnique);
		System.out.println("unique :: "+unique);

		
	}

}
