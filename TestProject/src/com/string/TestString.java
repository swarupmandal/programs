package com.string;

public class TestString {
	
	public static void main(String[] args) {
		
		String s= "abc";
		System.out.println(System.identityHashCode(s));
		
		s = s.concat("d");
		
		System.out.println(System.identityHashCode(s));
		
		StringBuffer sb = new StringBuffer("abc");
		
		System.out.println(System.identityHashCode(sb));
		
		sb = sb.append("d");
		
		System.out.println(System.identityHashCode(sb));
		
		
		StringBuilder sb1 = new StringBuilder("abc");
		
		System.out.println(System.identityHashCode(sb1));
		
		sb1 = sb1.append("d");

		System.out.println(System.identityHashCode(sb1));
	}

}
