package com.collection.map;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedTest {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();
		ListIterator<String> iterator = null;
		ll.add("aa");
		ll.add("ab");
		ll.add("ac");
		ll.add("ad");

		iterator = ll.listIterator();
		
		System.out.println("Elements in forward directiton");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());

		}
		
		System.out.println("Elements in backward directiton");
		while (iterator.hasPrevious()) {
			System.out.println(iterator.previous());

		}
	}
	/*public static void main(String a[]){
        List<Integer> li = new ArrayList<Integer>();
        ListIterator<Integer> litr = null;
        li.add(23);
        li.add(98);
        li.add(29);
        li.add(71);
        li.add(5);
        litr=li.listIterator();
        System.out.println("Elements in forward directiton");
        while(litr.hasNext()){
            System.out.println(litr.next());
        }
        System.out.println("Elements in backward directiton");
        while(litr.hasPrevious()){
            System.out.println(litr.previous());
        }
    }*/

}
