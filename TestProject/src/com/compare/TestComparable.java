package com.compare;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparable {

	public static void main(String[] args) {/*
	//https://github.com/swarupmandal/programs.git
		Student student = new Student();
			student.setAge(30);
			student.setName("shib");
			student.setRoll(803);
			student.setSalary(803.36);
			
		Student student1 = new Student();
			student1.setAge(20);
			student1.setName("lcc");
			student1.setRoll(815);
			student1.setSalary(815.36);
			
		Student student2 = new Student();
			student2.setAge(26);
			student2.setName("bb");
			student2.setRoll(703);
			student2.setSalary(703.36);
			
			
			ArrayList<Student> al=new ArrayList<Student>();  
			
			al.add(student);
			al.add(student1);
			al.add(student2);
			
			Collections.sort(al);
			
			System.err.println("Sort Using Comparable ::");
			for(Student st:al){
				System.out.println("Age=>"+st.age+" Name=>"+st.name+" Roll=>"+st.roll);
			}
			
			System.err.println("Sort Using Name Comparator ::");
			Collections.sort(al, Student.nameComparator);
			for(Student st:al){
				System.out.println("Age=>"+st.age+" Name=>"+st.name+" Roll=>"+st.roll);
			}
			
			System.err.println("Sort Using Roll Comparator ::");
			Collections.sort(al, Student.rollComparator);
			for(Student st:al){
				System.out.println("Age=>"+st.age+" Name=>"+st.name+" Roll=>"+st.roll);
			}
			
			System.err.println("Sort Using Age Comparator ::");
			Collections.sort(al, Student.ageComparator);
			for(Student st:al){
				System.out.println("Age=>"+st.age+" Name=>"+st.name+" Roll=>"+st.roll);
			}
			
			System.err.println("Sort Using Salary Comparator ::");
			Collections.sort(al, Student.salaryComparator);
			for(Student st:al){
				System.out.println("Age=>"+st.age+" Name=>"+st.name+" Roll=>"+st.roll+" Salary=>"+st.salary);
			}
			
	*/
		
	
		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "A", true));
		list.add(new Employee(2, "B", false));
		list.add(new Employee(3, "C", true));
		list.add(new Employee(4, "D", false));
		list.add(new Employee(5, "E", true));
		list.add(new Employee(6, "F", false));
		list.add(new Employee(7, "G", true));
		list.add(new Employee(8, "H", false));
		list.add(new Employee(9, "I", true));
		list.add(new Employee(10,"J", false));
		
	
		Collections.sort(list, new EmployeeComparator(true));
	
		for(Employee e : list){
			System.out.println(e);
			System.out.println("------------------------------------------------------");
		}
	
	}

}
