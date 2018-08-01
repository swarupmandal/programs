package com.sort;

import java.util.ArrayList;
import java.util.Arrays;

public class CTest7 {

	public static void main(String[] args) {
		// removeString();
		// removeStr();
		//swappArray();
		//removeStrSb();
		//subCount();
		//arrayMerge();
		//sels();
		//rightRotate();
		//rrotate();
		rightRoateOrNot();
		
		
	}

	public static void removeString() {
		String sentence = "alkjhfoiujweifbadljsdnvcAkdsjfhWEOUqeeiurypqjdkjnnzzvnajoOkjsdifUfi";
		// String vowels = "a,A, e,E, i,I, o,O, u,U,";
		String vowels = "aAeEiIoOuU";

		sentence = sentence.replaceAll("[" + vowels + "]", "");
		System.out.println(sentence);

	}

	public static void removeStr() {
		String sentence = "alkjhfoiujweifbadljsdnvcAkdsjfhWEOUqeeiurypqjdkjnnzzvnajoOkjsdifUfi";
		// String vowels = "aAeEiIoOuU";
		String vowels = "a,A, e,E, i,I, o,O, u,U,";
		String str = "";
		char[] ch = sentence.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (!isRemove(ch[i], vowels)) {
				str = str + ch[i];
			}
		}
		System.out.println(str);

	}

	public static boolean isRemove(char ch, String str) {
		boolean flag = false;
		char[] v = str.toCharArray();
		for (int i = 0; i < v.length; i++) {
			if (ch == v[i]) {
				flag = true;
				break;
			}
		}

		return flag;
	}

	public static void removeStrSb() {
		String sentence = "alkjhfoiujweifbadljsdnvcAkdsjfhWEOUqeeiurypqjdkjnnzzvnajoOkjsdifUfi";
		// String vowels = "aAeEiIoOuU";
		String vowels = "a,A, e,E, i,I, o,O, u,U,";
		
		ArrayList<Character> vList = new ArrayList<Character>();
		for(int i = 0; i < vowels.length(); i ++){
			vList.add(vowels.charAt(i));
		}
		
		StringBuffer sb = new StringBuffer(sentence);
		for(int i = 0; i <sb.length(); i++ ){
			if(vList.contains(sb.charAt(i))){ 
				sb.replace(i, i+1, "");
				i--;
			}
		}
		
		System.out.println(sb);
	}

	public static void swappArray() {
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 11, 12, 13, 14, 15 };

		for (int i = 0; i < a.length; i++) {
			int temp = a[i];
			a[i] = b[i];
			b[i] = temp;

		}

		for (int i = 0; i < a.length; i++) {
			System.out.print((i == 0) ? "A : " + a[i] + " " : a[i] + " "
					+ ((a.length > i + 1) ? "," : ""));
		}
		System.out.println();
		for (int i = 0; i < b.length; i++) {
			System.out.print((i == 0) ? "B : " + b[i] + " " : b[i] + " "
					+ ((b.length > i + 1) ? "," : ""));
		}
	}

	public static void subCount(){
		String str1 = "ABCDEFABGHABABCBAB";
		String str2 = "AB";
		int index = 0;
		int count = 0;
		while ((index = str1.indexOf(str2, index)) != -1) {
			count = count + 1;
			index = index + str2.length();
		}
		
		System.out.println(count);
		
	}

	public static void arrayMerge(){
		
		int arr1[] = { 25, 65, 12, 22, 11, 27, 9, 10, 24 };
		int arr2[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		
		Integer[] a = new Integer[arr1.length];
		Integer[] b= new Integer[arr2.length];
		Integer[] ab = new Integer[arr1.length + arr2.length];
		
		for(int i = 0; i < arr1.length; i++){
			a[i] = arr1[i];
		}
		
		for(int i = 0; i < arr2.length; i++){
			b[i] = arr2[i];
		}
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.addAll(Arrays.asList(a));
		al.addAll(Arrays.asList(b));
		
		for(int i =0; i <al.size(); i++){
			ab[i] = al.get(i);
		}
		
		for(int i =0; i < ab.length; i++){
			
			int m_index = i;
			
			for(int j = i+1; j < ab.length; j++){
				
				if(ab[j] < ab[m_index]){
					m_index = j;
				}
			}
			
			int temp = ab[m_index];
			ab[m_index] = ab[i];
			ab[i] = temp;
			
		}
		
		for(int i =0; i< ab.length; i++){
			System.out.print(ab[i] + (ab.length > i+1 ? ", ":""));
		}
	}
	
	public static void sels(){
		int arr[] = {25, 65, 12, 22, 11, 27, 9, 10, 24};
		
		for(int i =0; i < arr.length; i++){
			int m_index = i;
			for(int j = i+1; j < arr.length; j++){
				if(arr[j] < arr[m_index]){
					m_index = j;
				}
			}
			int temp = arr[m_index];
			arr[m_index] = arr[i];
			arr[i] = temp;
		}
		
		for(int i =0; i < arr.length; i++){
			System.out.print(arr[i] + (arr.length > i+1 ? ", ":""));
		}
	}
	
	public static void rightRotate(){
		int arr[] = {1,2,3,4,5,6,7,8,9};
		for(int i =0; i < 4; i++){
			rr(arr);
		}	
		
		for(int i =0 ; i < arr.length; i ++){
			System.out.print(arr[i] +(arr.length > i+1 ? ", " : ""));
		}
	}
	
	public static void rr(int arr[]){
		
		int firstValue = arr[0];
		int i =0;
		
		for(i = 0; i < arr.length -1; i++){
			arr[i] = arr[i+1];
		}
		arr[i] = firstValue;
	}
	
	public static void rrotate(){
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int count =0;
		int index = 5;
		while(index > count){
			int firstValue = arr[0];
			int i =0;
			for(i =0; i < arr.length-1; i ++){
				arr[i] = arr[i+1];
				
			}
			arr[i] = firstValue;
			count++;
			
		}		
		for(int i =0 ; i < arr.length; i ++){
			System.out.print(arr[i] +(arr.length > i+1 ? ", " : ""));
		}
	}
	
	public static void rightRoateOrNot(){
		String str1 = "ABAJDIJVJFOSHFJF";
		String str2 = "JFFF";
		
		if((str1+str1).indexOf(str2) != -1){
			System.out.println("TRUE");
		}else {
			System.out.println("FALSE");
		}		
	}
	
	public static void binarySearch(){
		
	}
}