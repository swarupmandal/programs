package com.sort;

public class SelectionSort {

	public static void main(String[] args) {

		/*int arr[] = new int[8];
		arr[0] = 64;
		arr[1] = 25;
		arr[2] = 12;
		arr[3] = 22;
		arr[4] = 11;
		
		arr[0] = 25;
		arr[1] = 64;
		arr[2] = 12;
		arr[3] = 22;
		arr[4] = 11;
		arr[5] = 9;
		arr[6] = 10;
		arr[7] = 24;*/
		
		int arr[] = new int[10];
		/*arr[0] = 64;
		arr[1] = 25;
		arr[2] = 12;
		arr[3] = 22;
		arr[4] = 11;*/
		
		arr[0] = 25;
		arr[1] = 64;
		arr[2] = 12;
		arr[3] = 22;
		arr[4] = 11;
		arr[5] = 27;
		arr[6] = 9;
		arr[7] = 10;
		arr[8] = 24;
		arr[9] = 21;
		
		sort(arr, "");
		print(arr);
		
	}

	public static void sort(int arr[]) {

		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			
			
			int min_indx = i;

			for (int j = i + 1; j < n; j++) {

				if (arr[j] < arr[min_indx]) {
					min_indx = j;
				}				
			}
			int temp = arr[min_indx];
			arr[min_indx] = arr[i];
			arr[i] = temp;
			
		}

	}
	
	
	public static void sort(int[] arr, String str){
		
		int n = arr.length;
		
		for(int i = 0; i < n-1; i++){
			
			int min_idx = i;
			
			for(int j = i + 1; j < n; j++){
				
				if(arr[j] < arr[min_idx]){
					
					min_idx = j;
				}
				
			}
			
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;			
		}
		
	}
	
	
	public static void print(int[] arr){
		
		for(int i : arr){
			System.out.print(i + " ");
		}
	}
	

}
