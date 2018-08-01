package com.sort;

public class CTestP7 {
	
	public static void main(String[] args) {
		p1();
	}
	
	public static void p1(){
		int count = 1;
		for(int i =1; i<= 10; i++){
			
			if((i/2)*2 == i){
				count = count + 1;
				System.out.print(count +" ");
				
			}
			
			for(int j =1; j<=10; j++){
				System.out.print(i + " ");
			}
			
			if((i/2)*2 != i){
				count = count + 1;
				System.out.print(count + " ");
				
			}
			
			System.out.println();
		}
	}

}
