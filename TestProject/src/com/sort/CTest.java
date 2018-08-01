package com.sort;

import java.util.ArrayList;
import java.util.Arrays;

public class CTest {

	public static void main(String[] args) {
		long start = System.nanoTime();
		//swapArray();
		//removeString();
		//removeStringReplace();
		//removeStringUsingSb();
		//subcount();
		//arrayMarge1();
		//sels();
		//rightRotate();
		//rr();
		//rightrotatedornot();
		//selectionSort();
		
		//int[] arr = { 25, 1, 65, 5, 12, 7, 22, 11, 8, 27, 9, 10, 12, 24 };
		int[] arr = {9, 10, 11, 12, 22, 24, 25, 27, 65};
		//int i =binarySearch(0, arr.length-1, arr);
		
		//System.out.println("I > " +i);
		
		long end = System.nanoTime();
		System.out.println(end -start);
	}
	
	public static void swapArray(){
		int[] a = {1,2,3,4,5};
		int[] b = {11,12,13,14,15};
		
		for(int i =0; i < a.length; i++){
			int temp = a[i];
			a[i] = b[i];
			b[i] = temp;			
		}
		int c =0;
		for(int i =0; i < a.length; i++){
			System.out.print(((i==0)? "A > ": "")+  a[i]+((a.length > i+1)?", ":""));
		}
		System.out.println();
		for(int i =0; i < b.length; i++){
			System.out.print(((i==0)? "B > ": "")+ b[i]+((b.length > i+1)?", ":""));
		}
		
	}
	
	public static String removeString(){
		String sentence = "alkjhfoiujweifbadljsdnvcAkdsjfhWEOUqeeiurypqjdkjnnzzvnajoOkjsdifUfi";
		String vowels = "a,A, e,E, i,I, o,O, u,U,";
		
		
		String str ="";
		System.out.println(">" + sentence.length());
		
		
		for(int i =0; i < sentence.length(); i++){
			System.out.println("i "+i + " " +sentence.charAt(i));
			if(!isVowel(vowels, sentence.charAt(i))){
				str = str+sentence.charAt(i);
			}
		}
		
		System.out.println(str);
		
		return str;		
	}
	public static boolean isVowel(String v, char ch){
		boolean flag = false;
		for(int i=0; i< v.length(); i++){
			if(v.charAt(i) == ch){
				flag =true;
				break;				
			}
		}	
		return flag;
	}
	
	
	public static void removeStringReplace(){
		
		String sentence = "alkjhfoiujweifbadljsdnvcAkdsjfhWEOUqeeiurypqjdkjnnzzvnajoOkjsdifUfi";
		String vowels = "aAeEiIoOuU,";
		
		String str = sentence.replaceAll("["+vowels+"]", "");
		
		System.out.println(str);
		
	}
	
	
	public static void removeStringUsingSb(){
		String sentence = "alkjhfoiujweifbadljsdnvcAkdsjfhWEOUqeeiurypqjdkjnnzzvnajoOkjsdifUfi";
		String vowels = "aAeEiIoOuU";
		
		ArrayList<Character> vList = new ArrayList<Character>();
		for(int i=0;i<vowels.length();i++){
			vList.add(vowels.charAt(i));
		}
		
		StringBuffer sb = new StringBuffer(sentence);
		for(int i=0; i < sb.length(); i++){
			if(vList.contains(sb.charAt(i))){
				sb.replace(i, i+1, "");
				i--;
			}
		}
		System.out.println(sb.toString());
	}
	
	
	public static void subcount(){
		
		String str1 = "ABCDEFABGHABABCBAB";
		String str2 = "AB";		
		
		int index = 0;
		int count = 0;
		while((index = str1.indexOf(str2, index)) != -1){
			System.out.println(index);
			index = index + str2.length();
			count = count+1;
		}
		System.out.println(count);
		
	}

	
	public static void arrayMarge1(){
		
		int arr1[] = { 25, 65, 12, 22, 11, 27, 9, 10, 24 };
		int arr2[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		
		int arr[] = new int[arr1.length + arr2.length];
		
		Integer[] a = new Integer[arr1.length];
		Integer[] b = new Integer[arr2.length];
		Integer[] ab = new Integer[arr1.length + arr2.length];
		
		for(int i=0; i< arr1.length; i++){
			a[i] = arr1[i];
		}
		
		for(int i=0; i< arr2.length; i++){
			b[i] = arr2[i];
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.addAll(Arrays.asList(a));
		list.addAll(Arrays.asList(b));
		
		for(int i=0; i<list.size(); i++){
			ab[i]= list.get(i);
		}
		
		for(int i =0; i< ab.length; i++){
			System.out.print(ab[i]+" ");
		}
		System.out.println();
		for(int i =0; i< ab.length; i++){
			int m_index = i;
			for(int j=i+1; j< ab.length; j++){
				if(ab[j] < ab[m_index]){
					m_index = j;
				}				
			}
			
			int temp  = ab[m_index];
			ab[m_index] = ab[i];
			ab[i] = temp;
		}
		
		for(int i =0; i< ab.length; i++){
			System.out.print(ab[i]+" ");
		}
		
	}
	
	
	public static void sels(){
		int arr[] = { 25, 65, 12, 22, 11, 27, 9, 10, 24 };
		for(int i =0; i<arr.length; i++){
			int index = i;
			for(int j = i+1; j< arr.length; j++){
				if(arr[j] < arr[index]){
					index = j;
				}
			}
			int temp = arr[index];
			arr[index] = arr[i];
			arr[i] = temp;
		}
		
		for(int i =0; i< arr.length; i++){
			System.out.print(arr[i] +" ");
		}
	}

	
	public static void rightRotate(){
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		int index = 4;
		
		for(int i =0; i <index; i++){
			rorate(arr);
		}
		
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}
	public static void rorate(int[] arr){
		System.out.println("LENTH 1 > " + arr.length);
		int temp = arr[0];
		int j =0;
		for(j =0; j< arr.length-1; j++){
			arr[j] = arr[j+1];
		}
		System.out.println("LENTH 2 > " + arr.length);		
		arr[j] = temp;
	}
	
	
	public static void rr(){
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int index = 4;
		int count = 0;
		while (count < index) {
			int temp =arr[0];
			int i =0;
			for(i =0; i < arr.length-1; i++){
				arr[i] = arr[i+1];
			}
			arr[i] = temp;
			count++;
		}
		for(int i =0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void rightrotatedornot(){
		String str1 = "ABAJDIJVJFOSHFJF";
		String str2 = "JF";
		int count =0;
		int index =0;
		while ((index = str1.indexOf(str2, index)) != -1) {
			index = index + str2.length();
			count ++;
		}
		
		System.out.println(count);
		System.out.println();
		
		
		if((str1+str1).indexOf(str2) != -1){
			System.out.println("Right Rotated");
		}
		
		
		System.out.println();
		
		
	}
	
	
	public static void selectionSort(){
		int[] arr1 = {25, 65, 12, 22, 11, 27, 9, 10, 24 };
		
		for(int i =0; i< arr1.length; i++){
			
			int m_index = i;
			
			for(int j =i+1; j<arr1.length; j++){
				if(arr1[j] < arr1[m_index]){
					m_index = j;
				}
			}
			
			int temp = arr1[m_index];
			arr1[m_index] = arr1[i];
			arr1[i] = temp;
		}
		
		for(int i =0; i< arr1.length; i++){
			System.out.print(arr1[i]+ " ");
		}
		System.out.println();
	}
	
	
	public static int binarySearch(int f, int l, int[] arr){
		
		//int[] arr = { 25, 1, 65, 5, 12, 7, 22, 11, 8, 27, 9, 10, 12, 24 };
		
		
		int mid =0;
		int toFind = 65;
		
		if(f <= l){
			
			 mid = f+(l-f/2);
			 if(arr[mid] == toFind){
				 return mid;
			 }
			
			 if(arr[mid] > toFind){
				 return binarySearch(f, mid-1, arr);
			 }else {
				 return binarySearch(mid+1, l, arr);
			 }
			
			
			
			
		}
		return -1;
	}
	
	
	
	
}
