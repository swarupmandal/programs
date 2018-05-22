package org.linklist;

public class SelectionSort {
	
	public static void main(String[] args) {
		
		SelectionSort selectionSort =new SelectionSort();
		int[] arr = {4,88,64,25,12,22,11,7};
		selectionSort.sort3(arr);
		selectionSort.printArray(arr);
		
	}
	
	public void sort(int[] arr) {

		int n = arr.length;

		for (int i = 0; i < n; i++) {

			int min_idx = i;

			for (int j = i + 1; j < n; j++) {
				
				if(arr[j] < arr[min_idx]){
					min_idx = j;
					
				}
				
			}
			
			int temp = arr[min_idx];
			
			arr[min_idx] = arr[i];
			
			arr[i] = temp;
			
			
		}

	}
	
	void printArray(int[] arr){
		int n = arr.length;
		for(int i = 0; i < n; i++){
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void sort2(int[] arr){
		
		int len = arr.length;
		
		for(int i =0; i <len; i++){
			
			int min_idx = i;
			
			for(int j=i+1; j <len; j++){
				
				if(arr[j]< arr[min_idx]){
					min_idx = j;
				}
			}
			
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
			
			
		}
		
	}
	
	public void sort3(int[] arr){
		
		int len = arr.length;
		
		for(int i =0; i< len; i++){
			
			int min_idx = i;
			
			for(int j =i+1; j < len; j++){
				
				if(arr[j] < arr[min_idx]){
					min_idx = j;
				}
				
			}
			
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
		
	}
	

}
