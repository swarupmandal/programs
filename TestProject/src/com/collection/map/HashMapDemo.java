package com.collection.map;

import java.util.HashMap;
import java.util.LinkedList;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		
		hashMap.put(1,"z");
		hashMap.put(5, "a");
		hashMap.put(3, "b");
		
		HashMap<Integer, String> hashMap2 = new HashMap<Integer, String>();
		
		hashMap2.put(33, "shib");
		
		hashMap.putAll(hashMap2);
		
		System.out.println(hashMap2.get(40));
		System.out.println(hashMap);
		for (HashMap.Entry<Integer,String> entry : hashMap.entrySet()) {
			
			System.out.println("Key=>"+entry.getKey().hashCode()+"--"+"Value=>"+entry.getValue().hashCode());
		}
		
		
		LinkedList<String>  linkedList = new LinkedList<String>();
		
	}

}
