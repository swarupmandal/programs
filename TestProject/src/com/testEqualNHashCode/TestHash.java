package com.testEqualNHashCode;

import java.util.HashMap;
import java.util.Map;

public class TestHash {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(101);
		Employee e2 = new Employee(101);
		
		
		Map<Employee,String> map = new HashMap<Employee, String>();
		
		map.put(e1, "shib");
		map.put(e2, "shib");
		
		System.out.println(map.size()); // 2
		
		
		Integer o1 = new Integer(91);
		Integer o2 = new Integer(91);
		
		
		Map<Integer,String> map2 = new HashMap<Integer, String>();
		
		map2.put(o1, "Test");
		map2.put(o2, "Test");
		
		System.out.println(map2.size()); // 1 
		
	}
}
