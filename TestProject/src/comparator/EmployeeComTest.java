package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class EmployeeComTest {

	int age;
	String name;
	Double salary;

	public EmployeeComTest(int age, String name, Double salary) {
		this.age = age;
		this.name = name;
		this.salary = salary;
	}
	
	public static void main(String[] args) {
		
		EmployeeComTest employeeComTest = new EmployeeComTest(30, "Shib", 50000.0);
		EmployeeComTest employeeComTest1 = new EmployeeComTest(24, "Avi", 35000.0);
		EmployeeComTest employeeComTest2 = new EmployeeComTest(26, "Tumpa", 85000.0);
		try {
			employeeComTest.finalize();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArrayList<EmployeeComTest> employees = new ArrayList<EmployeeComTest>();
		employees.add(employeeComTest);
		employees.add(employeeComTest1);
		employees.add(employeeComTest2);
		
		System.out.println("Sort By Age...........");
		Collections.sort(employees,new EmployeeComTestByAge());
		
		for(EmployeeComTest employee:employees){
			
			System.out.println("Age=>"+employee.age+" Name=>"+employee.name+" Salary=>"+employee.salary);
		}
		
		System.out.println("Sort By Salary...........");
		Collections.sort(employees,new EmployeeComTestBySalary());
		
		for(EmployeeComTest employee:employees){
			
			System.out.println("Age=>"+employee.age+" Name=>"+employee.name+" Salary=>"+employee.salary);
		}
		
		System.out.println("Sort By Name...........");
		Collections.sort(employees,new EmployeeComTestByName());
		
		for(EmployeeComTest employee:employees){
			
			System.out.println(employee);
		}
		
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((salary == null) ? 0 : salary.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeComTest other = (EmployeeComTest) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary == null) {
			if (other.salary != null)
				return false;
		} else if (!salary.equals(other.salary))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "EmployeeComTest [age=" + age + ", name=" + name + ", salary="
				+ salary + "]";
	}
	
	

}

class EmployeeComTestByName implements Comparator<EmployeeComTest> {

	@Override
	public int compare(EmployeeComTest o1, EmployeeComTest o2) {
		System.out.println("O1.Name=>"+o1.name+" ==== O2.Name=> "+o2.name);
		return o1.name.compareTo(o2.name);
	}

}

class EmployeeComTestByAge implements Comparator<EmployeeComTest> {
	
	@Override
	public int compare(EmployeeComTest o1, EmployeeComTest o2) {
		
		/*if (o1.age == o2.age)
			return 0;
		else if (o1.age > o2.age)
			return 1;
		else
			return -1;*/
		
		return o1.age - o2.age; // Both are correct syntax
	}

}

class EmployeeComTestBySalary implements Comparator<EmployeeComTest> {
	
	@Override
	public int compare(EmployeeComTest o1, EmployeeComTest o2) {
		
		/*if (o1.salary == o2.salary)
			return 0;
		else if (o1.salary > o2.salary)
			return 1;
		else
			return -1;*/
		return o1.salary.compareTo(o2.salary); // Both are correct syntax
	}

}


