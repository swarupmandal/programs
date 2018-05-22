package com.string;

import java.util.concurrent.locks.*;

public class SpltTest {

	public static void main(String[] args) {
	
		/*String s = "Sep 22, 2017, 10:00:49 AM";
		
		String arr[] = s.split(",");
		
		System.out.println(arr[2]);
		s = arr[0] + arr[1];
		System.out.println(s);*/
		
		/*String str = "ABCDEFGHIJKL";
		char[] ch = str.toCharArray();
		
		for(int i = ch.length-1; i>=0;i--){
			System.out.print(ch[i]);
			
		}
		System.out.println("-");
		int len = str.length();
		String rev = "";
		for(int i=len-1; i>=0; i--){
			rev += str.charAt(i);
		}	
		
		
		
		System.out.println(rev);*/
		
		
		
		int n=456, reverse = 0;
		 	
		while (n != 0) {
			
			int x = n%10;
			reverse = reverse + x;
			n = n/10;
			
		}
		
		
	      /*while (n!= 0) {
	    	  reverse = reverse*10;
	    	  reverse = reverse + n%10;
	    	  n = n/10;
	      }*/
	      System.out.println(reverse);
		
	}
	
}

