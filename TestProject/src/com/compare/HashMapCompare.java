package com.compare;

import java.util.Comparator;

public class HashMapCompare {
	
	int id;
	String name;
	
	HashMapCompare(int id,String name){
		this.id = id;
		this.name = name;
	}

	public static Comparator<HashMapCompare> rollComparator = new Comparator<HashMapCompare>() {
		
		@Override
		public int compare(HashMapCompare o1, HashMapCompare o2) {
			return o1.id - o2.id;
		}
	}; 
}


