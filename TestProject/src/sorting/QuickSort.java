package sorting;

public class QuickSort {

	private int[] arr;
	private int length;
	
	public static void main(String[] args) {
		
		QuickSort quickSort = new QuickSort();
		int[] input = {24,2,45,20,56,75,2,56,99,53,12};
				
		quickSort.sort(input);
	}
	
	public void sort(int[] arr){
		if(arr == null || arr.length == 0){
			return;
		}		
		this.arr = arr;
		length = arr.length;
		quickSort(0, length-1);
		
	}
	
	public void quickSort(int lowerIndex, int higherIndex){
		
		int l = lowerIndex;
		int h = higherIndex;
		int pvot = lowerIndex + (higherIndex-lowerIndex)/2;
		//hashing algo
		//garbage collection
		//inner and static nested
		//an object can have how many references
		//singleton
		//when a class is loading
		//if a class need only one object at the time of loading what to do
		//if we need to do memory to do memory emty at run time what to do
		
		
		while (l <= h) {
			
			while (arr[l] < pvot) {
				l++;
				System.out.println("L > " + l);
				
			}
			
			while (arr[h] > pvot) {
				h--;
				System.out.println("H > " + h);
			}
			
			if(l < h){
				exchangeNumber(l, h);
				l++;
				h--;
			}
		}
		
		
	}
	
	public void exchangeNumber(int i, int j){
		int temp = arr[j];
		arr[i] = arr[j];
		arr[i] = temp;
	}

}
