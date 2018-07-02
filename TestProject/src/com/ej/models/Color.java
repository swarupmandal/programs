package com.ej.models;

public class Color {

	private final int hex;
	
	public Color(int h) {
		this.hex = h;
	}
	
	public Color(int red, int green, int yellow) {
		this(red << 16 + green << 8 + yellow);
	}
	
	public Color(String rgb) {
		this(Integer.parseInt(rgb, 16));
		
		
	}
	public static void main(String[] args) {
		
	}
	
	public void test(){
		
	}
	
}
