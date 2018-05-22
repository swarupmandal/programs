package com.collection.map;

import java.util.HashMap;

public class TestHashMap {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		
		hashMap.put(1,"z");
		hashMap.put(5, "a");
		hashMap.put(3, "b");
		System.out.println("Integer key................");
		
		 // create a synchronized map
       // Map<Integer,String> syncMap = Collections.synchronizedMap(hashMap);
        
		for (HashMap.Entry<Integer,String> entry : hashMap.entrySet()) {
			
			System.out.println("Key=>"+entry.getKey().hashCode()+"--"+"Value=>"+entry.getValue().hashCode());
		}
		
		
		
		HashMap<Integer, String> hashMap2 = new HashMap<Integer, String>();
		
		hashMap2.put(1,"z");
		hashMap2.put(5, "a");
		hashMap2.put(3, "b");
		System.out.println("Integer key 2................");
		
		 // create a synchronized map
       // Map<Integer,String> syncMap = Collections.synchronizedMap(hashMap);
        
		for (HashMap.Entry<Integer,String> entry : hashMap2.entrySet()) {
			
			System.out.println("Key=>"+entry.getKey().hashCode()+"--"+"Value=>"+entry.getValue().hashCode());
		}
		
		
		HashMap<String, String> hashMap1 = new HashMap<String, String>();
		
		hashMap1.put("aa","z");
		hashMap1.put("aa", "a");
		hashMap1.put("gg", "b");
		
		System.out.println("String key................"+hashMap1.get("gg").hashCode());
		
		 // create a synchronized map
        //Map<String,String> syncMap1 = Collections.synchronizedMap(hashMap1);
        
		for (HashMap.Entry<String,String> entry : hashMap1.entrySet()) {
			
			System.out.println("Key=>"+entry.getKey().hashCode()+"--"+"Value=>"+entry.getValue());
		}
		
		HashMap<String, String> hashMap3 = new HashMap<String, String>();
		
		hashMap3.put("aa","z");
		hashMap3.put("aa", "a");
		hashMap3.put("gg", "b");
		
		System.out.println("String key................"+hashMap3.get("gg").hashCode());
		
		 // create a synchronized map
        //Map<String,String> syncMap1 = Collections.synchronizedMap(hashMap1);
        
		for (HashMap.Entry<String,String> entry : hashMap3.entrySet()) {
			
			System.out.println("Key=>"+entry.getKey().hashCode()+"--"+"Value=>"+entry.getValue());
		}
	}

}
