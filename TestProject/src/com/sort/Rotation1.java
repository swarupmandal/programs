package com.sort;

public class Rotation1 {

	public static void main(String[] args) {
		
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		
		
		
		Rotation1 rotate = new Rotation1();
		
		
		//rotate.rotate(arr, 2, 7);
		//rotate.printArray(arr, 7);
		//rotate.rightRotatedOrNot("ABC", "CAB");
		
		
		
	}

	void rotate(int[] arr, int d, int length){
		
		for(int i =0; i <d; i++){
			leftRotate(arr, length);
		}
		
	
	}
	
	void leftRotate(int[] arr, int length){
		int i =0;
		int temp =arr[0];
		
		for(i=0; i < length-1; i++){
			arr[i] = arr[i+1];
		}
		arr[i] = temp;
	}
	
	void rightRotatedOrNot(String str1, String str2){
		
		boolean flag = ((str1+str1).indexOf(str2)!= -1);
		
		System.out.println(flag);
		
	}
	
	

	/* utility function to print an array */
	void printArray(int arr[], int size) {
		int i;
		for (i = 0; i < size; i++){
			System.out.print(arr[i] + " ");
		}
		
	}
}
