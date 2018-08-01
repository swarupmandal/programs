package com.sorting;

public class Patterns {

	public static void main(String[] args) {

		pattern1();
	}

	public static void pattern1() {

		int c = 1;
		int n = 10;

		for (int i = 1; i <= n; i++) {

			if ((i / 2) * 2 == i) {
				c = c + 1;
				System.out.print(c + " ");
			}

			for (int j = 1; j <= n; j++) {

				System.out.print(i + " ");

			}
			if ((i / 2) * 2 != i) {
				c = c + 1;
				System.out.print(c + " ");
			}
			System.out.println();
		}

	}

	public static void pattern2() {

		int n = 7;
		int c = 1;

		for (int i = 1; i <= n; i++) {

			if ((i / 2) * 2 != i) {

				for (int j = 1; j <= i; j++) {

					System.out.print(c);
					if (j < i) {
						System.out.print("*");
					}
					c = c + 1;
				}
			}

			int d = 0;

			if ((i / 2) * 2 == i) {

				d = (i + c);

				for (int j = 1; j <= i; j++) {
					d = d - 1;
					System.out.print(d);
					if (j < i) {
						System.out.print("*");
					}

					c = c + 1;
				}
			}
			System.out.println();
		}

	}

	public static void pattern3() {

		char ch = 'A';
		int n = 5;

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(ch + " ");
				ch = (char) (ch + 1);
			}
			System.out.println();
		}
	}

	public static void pattern4() {

		String str = "LOTUS";
		char ch[] = str.toCharArray();

		for (int i = 0; i < str.length(); i++) {

			for (int j = 0; j <= i; j++) {

				System.out.print(ch[j]);

			}
			System.out.println();
		}
	}

	public static void pattern5() {

		int count = 0;
		int length = 5;
		for (int i = 1; i <= length; i++) {

			for (int j = 0; j < i; j++) {

				System.out.print(count = count + 1);
				System.out.print(" ");
			}
			System.out.println();
		}

	}

	public static void pattern6() {
		int n, i, k, number = 1, j;

		n = 6;

		for (i = 0; i < n; i++) {

			for (k = n; k > i; k--) {

				System.out.print(" ");
			}
			number = 1;
			for (j = 0; j <= i; j++) {

				System.out.print(number + " ");
				number = number * (i - j) / (j + 1);
			}
			System.out.println();
		}
	}

	public static void pattern7() {
		String fruit = "ORANGE";
		char[] ch = fruit.toCharArray();

		for (int i = 0; i <= fruit.length(); i++) {
			for (int j = 0; j < i; j++) {

				System.out.print(ch[j]);

			}
			System.out.println();
		}

		for (int i = fruit.length() - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print(ch[j]);
			}
			System.out.println();
		}

	}

	public static void pattern8() {

		int n = 7;
		int number = 1;
		for (int i = 0; i < n; i++) {
			System.out.printf("%" + (n - i) * 2 + "s", "");
			number = 1;

			for (int j = 0; j <= i; j++) {
				System.out.printf("%4d", number);
				number = number * (i - j) / (j + 1);
			}
			System.out.println();
		}
	}

	public static void pattern9() {
		

		/*int number, i, k, count = 1;
		number = 5;
		count = number - 1;
		for (k = 1; k <= number; k++) {
			for (i = 1; i <= count; i++){ 
				System.out.print(" ");
			}
				count--;
			
			for (i = 1; i <= 2 * k - 1; i++){
				System.out.print("*");
			}
			System.out.println();
		}
		count = 1;
		for (k = 1; k <= number - 1; k++) { 
			for (i = 1; i <= count; i++){
				System.out.print(" ");
			}
				count++;
			
			for (i = 1; i <= 2 * (number - k) - 1; i++){
				System.out.print("*");
			}
			
			System.out.println();
		}*/
		
		
		
		int a,b,d, c=1;
		int n=7;
		c=n-1;
		
		for(a=1; a<=n; a++){
			
			for(d =1; d<=c; d++){
				System.out.print(" ");
			}
			c=c-1;
			
			for(b=1;b<= 2*a-1; b++){
				System.out.print("*");
			}
			System.out.println();
		}
		c=1;
		for(a=1;a<=n-1; a++){
			for(d = 1; d<= c; d++){
				System.out.print(" ");
			}
			c=c+1;
			
			for(b=1; b<=2*(n-a)-1; b++){
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

	public static void pattern10(){
		
		int n =5;
		int count = n-1;
		for(int i = 1; i<=n; i++){
			
			for(int space = 1; space<=count; space++){
				System.out.print(" ");
			}
			count = count-1;
			for(int j = i; j>=1;j--){
				System.out.print(j);
			}
			for(int k=2; k<=i; k++){
				System.out.print(k);
			}
			System.out.println();
			
		}
		count = 1;
		for(int i=n-1; i>=1; i--){
			for(int space = 1; space<=count; space++){
				System.out.print(" ");
			}
			count = count+1;
			for(int j = i; j>=1; j--){
				System.out.print(j);
			}
			for(int k = 2; k<=i; k++){
				System.out.print(k);
			}
			System.out.println();
		}
		
	}

	public static void pattern11(){
		int n =5;
		
		for(int i =0; i<=n; i++){
			
			for(int j=1; j<=n-i; j++){
				System.out.print(" ");
			}
			for(int k = 1; k<=i; k++){
				System.out.print(k);
			}
			for(int l = i+1; l>=1;l--){
				System.out.print(l);
			}
			System.out.println();
		}
		
		for(int i = n; i>0; i--){
			for(int j = 0; j <= n-i; j++){
				System.out.print(" ");
			}
			for(int k = 1; k<=i; k++){
				System.out.print(k);
			}
			for(int l = i-1; l>=1; l--){
				System.out.print(l);
			}
			System.out.println();
		}
		
	}
	
	public static void pattern12(){
		int p, q;
		int n = 5;
		for(int i =1; i<=n;i++ ){
			if(i%2==0){
				p=1;q=0;
			}else {
				p=0;q=1;
			}
			for(int j=1; j<=i;j++){
				if(j%2==0){
					System.out.print(p);
				}else {
					System.out.print(q);
				}
			}
			System.out.println();
		}

	}
	
	public static void pattern13(){
		char ch = 'A';
		int n=5;
		for(int i = 1; i<=n; i++){
			
			for(int j =1; j<=i; j++){
				System.out.print(ch);
			}
			ch = (char)(ch+1);
			System.out.println();
		}
	}
	
	public static void pattern14(){
		
		int n=5;
		for(int i =1; i<=n; i++){
			for(int j =1; j<=n-i;j++){
				System.out.print(" ");
			}
			
			for(int k=1; k<=i;k++){
				System.out.print(k + " ");
			}
			System.out.println();
		}
		
	}
	
	public static void pattern15(){
		int n = 5;
		
		for(int i =1; i <= n; i++){
			for(int j = 1; j <= n-i; j++){
				System.out.print(" ");
			}
			for(int k =1; k<= i; k++){
				System.out.print(k + " ");
			}
			
			System.out.println();
		}
		for(int i = n-1; i>= 1; i--){
			for(int j =1; j <= n-i; j++){
				System.out.print(" ");
			}
			for(int k =1; k<=i; k++){
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
	
}
