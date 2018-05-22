package com.collection.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		System.out.println("see :: "+(1.0/0));
		
		Set<String> set = new HashSet<String>();
		
		String s1 =  new String("shib");
		
		set.add("shib");
		set.add("avi");
		set.add("shib");
		
		set.add("gvi");
		set.add("cvi");
		set.add("kvi");
		
		set.add(s1);
		
		System.out.println("Set::=>" + set);
		
		
		
		Set<Dog> dog = new HashSet<Dog>();
	
		/*Dog d1 = new Dog("aa");
		
		Dog d2 = new Dog("bb");
		
		Dog d3 = new Dog("aa");
		
		dog.add(d1);
		dog.add(d2);
		dog.add(d3);
		
		System.out.println("dog::=>" + dog);
		
		for (Dog dog2 : dog) {
			
			System.out.println("dog::=>" + dog2.name);
		}*/
	}

}
