package com.collection.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestTreeSet {
	
	public static void main(String[] args) {
		 System.out.println("see :: "+(1.0/0));
		TreeSet<String> set = new TreeSet<String>();
		
		set.add("shib");
		set.add("avi");
		set.add("shib");
		set.add("raj");
		
		
		System.out.println("set==>"+set.hashCode());
		
		Iterator<String> itr = set.iterator();
		
		TreeSet<String> set1 = (TreeSet) set.clone();
		
		System.out.println("set1==>"+set1.hashCode());
		
		while(itr.hasNext()){
			//set.remove("raj"); //ConcurrentModificationException
			System.out.println(itr.next());
		}
	}

}
