package com.compare;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class TestUDO {

	public static void main(String[] args) {

		HashMapCompare compare = new HashMapCompare(23, "shib");
		HashMapCompare compare1 = new HashMapCompare(56, "aaa");
		HashMapCompare compare3 = new HashMapCompare(1, "bbb");

		HashMap<Integer, HashMapCompare> hashMap = new HashMap<Integer, HashMapCompare>();

		hashMap.put(5, compare);
		hashMap.put(1, compare1);
		hashMap.put(3, compare3);

		/*
		 * TreeMap<Integer,HashMapCompare> treeMap = new TreeMap<Integer,
		 * HashMapCompare>(hashMap);
		 * 
		 * System.out.println("Tree Sorted==>"+treeMap);
		 */

		Collection<HashMapCompare> compares = hashMap.values();
		List<HashMapCompare> list = new ArrayList<>(compares);
		Collections.sort(list, HashMapCompare.rollComparator);


		for(HashMapCompare compare2 : list){
			
			System.out.println("Id:=>"+compare2.id+"  "+compare2.name);
		}
	}
}
