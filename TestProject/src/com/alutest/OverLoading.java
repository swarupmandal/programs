package com.alutest;

public class OverLoading {

	public void sum(short a) {
		System.out.println("In Short");
	}

	public void sum(int a) {
		System.out.println("In int");
	}

	public void sum(Integer a) {
		System.out.println("In Integer");
	}
	
	public void sum(double a) {
		System.out.println("In double");
	}

	public void sum(Double a) {
		System.out.println("In Double");
	}

	public void sum(float a) {
		System.out.println("In float");
	}
	
	public void sum(Float a) {
		System.out.println("In Float");
	}
	
	public static void main(String[] args) {
		OverLoading overLoading = new OverLoading();
		overLoading.sum(0.550);
	}
}

//In int