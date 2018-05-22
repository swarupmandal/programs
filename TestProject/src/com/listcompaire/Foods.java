package com.listcompaire;

public class Foods {
	
	public static void main(String[] args) {
		
		int[] arr = {20, 25, 12, 1, 16, 4, 28};
		
		
		for(int i = 0; i < arr.length; i ++){
			
			int min_idx = i;
			
			for(int j = i + 1; j < arr.length; j++  ){
				
				if(arr[j] < arr[min_idx]){
					min_idx = j;
				}
				
			}
			
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
			
		}
		
		for(int i =0; i < arr.length; i ++){
			System.out.print(arr[i] + " ");
		}
		
		
		
		
		
		
	}
	

}
