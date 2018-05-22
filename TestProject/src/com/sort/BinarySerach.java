package com.sort;

import java.util.*;
import java.io.*;

public class BinarySerach {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		int arr[] = { 25, 65, 12, 22, 11, 27, 9, 10, 24 };
		int arr2[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int arr3[] = { 15, 18, 2, 3, 6 };
		int arr4[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };

		/*
		 * for(int i : arr2){ System.out.print(i + " "); }
		 */

		BinarySerach search = new BinarySerach();
		// search.rotate(arr2, arr2.length, 2);
		// boolean flag = search.rightRotatedOrNot("ABC", "CA");
		// System.out.println(flag);

		/*
		 * int[] arr3 = search.selectionSort(arr);
		 * 
		 * for(int i : arr3){ System.out.print(i + " "); }
		 */

		// int pos = search.binarySearch(arr3, 0, arr3.length-1, 65);
		// System.out.println();
		// System.out.println("POSITION >>> >> > " + pos);

		// boolean available = search.pairInSortedArray(arr, arr.length, 19);
		// System.out.println(available);

		// search.getPair(arr, 74);

		// int i = search.rotationCount(arr, arr.length);

		// System.out.println(i);
		// search.rearrange(arr4, arr4.length);

		// search.arrayMarging2(arr, arr3);

		// int c = search.substrCount();
		// System.out.println(c);
		/*String str = "alkjhfoiujweifbadljsdnvcAkdsjfhWEOUqeeiurypqjdkjnnzzvnajoOkjsdifUfi";
		String v = "aeiouAEIOUjJ";
		String nv = removeString(str, v);
		System.out.println(nv);*/
		
		swapArray();
	}

	// ABCABC

	public void rotate(int arr[], int length, int key) {
		for (int i = 0; i < key; i++) {
			rightRotate(arr, length);
		}
		System.out.println();
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	public void rightRotate(int arr[], int length) {
		int temp = arr[0];
		int i = 0;
		for (i = 0; i < length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[i] = temp;
	}

	public boolean rightRotatedOrNot(String str1, String str2) {

		return (str1 + str1).indexOf(str2) != -1;

	}

	public int[] selectionSort(int arr[]) {

		for (int i = 0; i < arr.length; i++) {

			int min_idx = i;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min_idx]) {
					min_idx = j;
				}
			}

			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}

	public int binarySearch(int[] arr, int first, int last, int key) {

		if (first <= last) {

			int mid = first + (last - first) / 2;

			if (arr[mid] == key) {
				return mid;
			}
			if (arr[mid] > key) {
				return binarySearch(arr, first, mid - 1, key);
			} else {
				return binarySearch(arr, mid + 1, last, key);
			}
		}
		return -1;
	}

	public boolean pairInSortedArray(int arr[], int n, int x) {

		// Find the pivot element
		int i;
		for (i = 0; i < n - 1; i++)
			if (arr[i] > arr[i + 1])
				break;

		int l = (i + 1) % n; // l is now index of
								// minimum element

		int r = i; // r is now index of maximum
					// element

		// Keep moving either l or r till they meet
		while (l != r) {
			// If we find a pair with sum x, we
			// return true
			if (arr[l] + arr[r] == x)
				return true;

			// If current pair sum is less, move
			// to the higher sum
			if (arr[l] + arr[r] < x)
				l = (l + 1) % n;

			else
				// Move to the lower sum side
				r = (n + r - 1) % n;
		}
		return false;
	}

	public static void getPair(int[] arr, int sum) {

		for (int i = 0; i < arr.length; i++) {
			int first = arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				int second = arr[j];

				if ((first + second) == sum) {
					System.out.printf("(%d, %d) %n", first, second);
				}
			}
		}

	}

	int rotationCount(int arr[], int length) {

		int min = arr[0];
		int min_idx = -1;

		for (int i = 0; i < length; i++) {

			if (min > arr[i]) {
				min = arr[i];
				min_idx = i;
			}
		}
		return min_idx;
	}

	void rearrange(int arr[], int lenght) {

		int i = -1, temp = 0;
		for (int j = 0; j < lenght; j++) {
			if (arr[j] < 0) {
				i++;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		for (int a = 0; a < arr.length; a++) {

			System.out.print(arr[a] + " ");

		}

		int pos = i + 1;
		int neg = 0;

		while (neg < lenght && pos < lenght && arr[neg] < 0) {
			temp = arr[neg];
			arr[neg] = arr[pos];
			arr[pos] = temp;

			pos = pos + 1;
			neg = neg + 2;
		}

		System.out.println();

		for (int a = 0; a < arr.length; a++) {

			System.out.print(arr[a] + " ");

		}
	}

	void arrayMarging1(int arr1[], int arr2[]) {

		Integer arr[] = new Integer[arr1.length + arr2.length];
		for (int i = 0; i < arr.length; i++) {

			if (arr1.length > i) {
				arr[i] = arr1[i];
			}

			if (arr1.length == i) {
				int c = 0;
				for (int j = arr1.length; j < arr.length; j++) {
					arr[j] = arr2[c];
					c = c + 1;
				}
			}

		}

		for (int i = 0; i < arr.length; i++) {
			int m_idx = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[m_idx]) {
					m_idx = j;
				}
			}
			int temp = arr[m_idx];
			arr[m_idx] = arr[i];
			arr[i] = temp;
		}

		int c = 0;
		for (int i : arr) {
			c = c + 1;
			System.out.print(i + ((arr.length > c) ? ", " : ""));
		}

	}

	void arrayMarging2(int arr1[], int arr2[]) {

		ArrayList<Integer> al = new ArrayList<Integer>();

		Integer[] a = new Integer[arr1.length];
		Integer[] b = new Integer[arr2.length];
		int arr[] = new int[a.length + b.length];

		for (int i = 0; i < a.length; i++) {
			a[i] = arr1[i];
		}

		for (int i = 0; i < b.length; i++) {
			b[i] = arr2[i];
		}

		al.addAll(Arrays.asList(a));
		al.addAll(Arrays.asList(b));

		for (int i = 0; i < arr.length; i++) {
			arr[i] = al.get(i);
		}

		for (int i = 0; i < arr.length; i++) {
			int m_idx = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[m_idx]) {
					m_idx = j;
				}
			}
			int temp = arr[m_idx];
			arr[m_idx] = arr[i];
			arr[i] = temp;
		}

		int c = 0;
		System.out
				.println("25, 65, 12, 22, 11, 27, 9, 10, 24, 15, 18, 2, 3, 6");
		for (int i : arr) {
			c = c + 1;
			System.out.print(i + ((al.size() > c) ? ", " : ""));
		}

	}

	int substrCount() {

		String str1 = "ABCDEFABGHABAB";
		String str2 = "AB";

		if (str1.isEmpty() || (str2.isEmpty())) {
			return 0;
		}

		int idx = 0;
		int count = 0;

		while ((idx = str1.indexOf(str2, idx)) != -1) {
			count = count + 1;
			idx = idx + str2.length();
		}

		int index = 0;
		int c = 0;

		while ((index = str1.indexOf(str2, index)) != -1) {
			index = index + str2.length();
			c = c + 1;
		}

		System.out.println("C " + c);

		return count;
	}

	public static void checkVoiwels(String str, String v) {

		char[] chStr = str.toCharArray();

		char[] ch = v.toCharArray(); // {'a',
										// 'e','i','o','u','A','E','I','O','U'};
		ArrayList<Character> vList = new ArrayList<Character>();
		for (int i = 0; i < ch.length; i++) {
			vList.add(ch[i]);
		}

		/*
		 * StringBuffer sb = new StringBuffer(str);
		 * 
		 * for(int i =0; i<sb.length(); i++){
		 * 
		 * if(vList.contains(sb.charAt(i))){ sb.replace(i, i+1, "");
		 * 
		 * i--;
		 * 
		 * }
		 * 
		 * } System.out.println(sb);
		 */
		// return sb.toString();

		StringBuffer sb = new StringBuffer(str);

		for (int i = 0; i < sb.length(); i++) {

			if (vList.contains(sb.charAt(i))) {
				sb.replace(i, i + 1, "");
				i--;
			}

		}
		System.out.println(sb);

		/*
		 * String v = "aeiouAEIOU"; String nv = str.replaceAll("a", ""); nv =
		 * nv.replace("e", ""); nv = nv.replace("i", ""); nv = nv.replace("o",
		 * ""); nv = nv.replace("u", ""); nv = nv.replace("A", ""); nv =
		 * nv.replace("E", ""); nv = nv.replace("I", ""); nv = nv.replace("O",
		 * ""); nv = nv.replace("U", ""); System.out.println("Str2 >>> >> > " +
		 * nv);
		 */
		// lkjhfjwfbdljsdnvckdsjfhW
	}

	public static String removeString(String str, String v) {
		String str1 = "";

		/*
		 * for(int i=0; i<str.length(); i++){ if(!isVoiwel(str.charAt(i), v)){
		 * str1= str1+str.charAt(i); } } return str1;
		 */

		return str1 = str.replaceAll("[aeioujAEIOUJ]", "");
	}

	public static boolean isVoiwel(char ch, String voiwels) {

		for (int i = 0; i < voiwels.length(); i++) {
			if (ch == voiwels.charAt(i)) {
				return true;
			}
		}
		return false;
	}

	public static void swapArray() {
		int arr1[] = { 1, 2, 3, 4, 5, 6, };
		int arr2[] = { 10, 11, 12, 13, 14, 15 };
		//int arr[] = new int[arr1.length];

		for (int i = 0; i < arr1.length; i++) {
			if (arr1.length == arr2.length) {
				int temp = arr1[i];
				arr1[i] = arr2[i];
				arr2[i] = temp;
			}
		}
		System.out.print("arr1 >>> > > ");
		for(int i=0;i<5; i++){
			
			System.out.print(arr1[i]+((5>i+1)?",":""));
		}
		System.out.println();
		System.out.print("arr2 >>> > > ");
		for(int i=0;i<5; i++){
			System.out.print(arr2[i]+((5>i+1)?",":""));
		}
		
	}

	public static void swapArrayPos(){
		
		char[] arr = {'a','b','c','e','f','g'};
		
		
		
	}
	
}
