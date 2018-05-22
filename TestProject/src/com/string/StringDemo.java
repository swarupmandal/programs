package com.string;

public class StringDemo {

	public static void main(String[] args) {

		/*String s = new String("abcdefg");
		
		System.out.println(System.identityHashCode(s));
		s= s.substring(1);
		
		System.out.println("s==>"+s);
		System.out.println(System.identityHashCode(s));
		
		s= s.substring(4);
		
		System.out.println("s==>"+s);
		System.out.println(System.identityHashCode(s));
		
		s= s.substring(0);
		
		System.out.println("s==>"+s);
		System.out.println(System.identityHashCode(s));*/
		
		String s = "abc";
		
		System.out.println(String.valueOf(s));
		String s1 = null;
		System.out.println(String.valueOf(s1));
	}

}
